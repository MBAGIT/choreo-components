/*
 * explore-api
 * The Opendatasoft Explore API v2 is organized around REST. It provides access to all the data available through the platform in a coherent, hierarchical way.  - Only the HTTP `GET` method is supported. - All API endpoints return JSON. - Endpoints are organized in a hierarchical way describing the relative relationship between objects. - All responses contain a list of links allowing easy and relevant navigation through the API endpoints. - All endpoints use the [Opendatasoft Query Language (ODSQL)](https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)). This means that, most of the time, parameters work the same way for all endpoints. - While the `records` endpoint is subject to a [limited number of returned records](https://help.opendatasoft.com/apis/ods-explore-v2/#tag/Dataset/operation/getRecords), the `exports` endpoint has no limitations.
 *
 * The version of the OpenAPI document: v2.1
 * Contact: support@opendatasoft.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.wso2.client.api;

import okhttp3.MediaType;
import okhttp3.ResponseBody;

import java.io.IOException;

import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

public class ProgressResponseBody extends ResponseBody {

    private final ResponseBody responseBody;
    private final ApiCallback callback;
    private BufferedSource bufferedSource;

    public ProgressResponseBody(ResponseBody responseBody, ApiCallback callback) {
        this.responseBody = responseBody;
        this.callback = callback;
    }

    @Override
    public MediaType contentType() {
        return responseBody.contentType();
    }

    @Override
    public long contentLength() {
        return responseBody.contentLength();
    }

    @Override
    public BufferedSource source() {
        if (bufferedSource == null) {
            bufferedSource = Okio.buffer(source(responseBody.source()));
        }
        return bufferedSource;
    }

    private Source source(Source source) {
        return new ForwardingSource(source) {
            long totalBytesRead = 0L;

            @Override
            public long read(Buffer sink, long byteCount) throws IOException {
                long bytesRead = super.read(sink, byteCount);
                // read() returns the number of bytes read, or -1 if this source is exhausted.
                totalBytesRead += bytesRead != -1 ? bytesRead : 0;
                callback.onDownloadProgress(totalBytesRead, responseBody.contentLength(), bytesRead == -1);
                return bytesRead;
            }
        };
    }
}
