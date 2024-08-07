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


package org.wso2.client.api.explore_api;

import org.wso2.client.api.ApiException;
import org.wso2.client.model.explore_api.EnumFormatDatasetsV21;
import org.wso2.client.model.explore_api.InlineResponse200;
import org.wso2.client.model.explore_api.InlineResponse2001;
import org.wso2.client.model.explore_api.InlineResponse2002;
import org.wso2.client.model.explore_api.InlineResponse400;
import org.wso2.client.model.explore_api.InlineResponse429;
import org.wso2.client.model.explore_api.RecordV21;
import org.wso2.client.model.explore_api.ResultsV21;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatasetApi
 */
@Ignore
public class DatasetApiTest {

    private final DatasetApi api = new DatasetApi();

    
    /**
     * Export a dataset
     *
     * Export a dataset in the desired format. **Note:** The &#x60;group_by&#x60; parameter is only available on exports starting with the v2.1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportRecordsTest() throws ApiException {
        String datasetId = null;
        EnumFormatDatasetsV21 format = null;
        String select = null;
        String where = null;
        String orderBy = null;
        String groupBy = null;
        Integer limit = null;
        String refine = null;
        String exclude = null;
        String lang = null;
        String timezone = null;
        Boolean useLabels = null;
        Integer epsg = null;
                api.exportRecords(datasetId, format, select, where, orderBy, groupBy, limit, refine, exclude, lang, timezone, useLabels, epsg);
        // TODO: test validations
    }
    
    /**
     * Export a dataset in CSV
     *
     * Export a dataset in CSV (Comma Separated Values). Specific parameters are described here
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportRecordsCSVTest() throws ApiException {
        String datasetId = null;
        String delimiter = null;
        String listSeparator = null;
        Boolean quoteAll = null;
        Boolean withBom = null;
                api.exportRecordsCSV(datasetId, delimiter, listSeparator, quoteAll, withBom);
        // TODO: test validations
    }
    
    /**
     * Export a dataset in GPX
     *
     * Export a dataset in GPX. Specific parameters are described here
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportRecordsGPXTest() throws ApiException {
        String datasetId = null;
        String nameField = null;
        String descriptionFieldList = null;
        Boolean useExtension = null;
                api.exportRecordsGPX(datasetId, nameField, descriptionFieldList, useExtension);
        // TODO: test validations
    }
    
    /**
     * List dataset attachments
     *
     * Returns a list of all available attachments for a dataset. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDatasetAttachmentsTest() throws ApiException {
        String datasetId = null;
                InlineResponse2002 response = api.getDatasetAttachments(datasetId);
        // TODO: test validations
    }
    
    /**
     * Read a dataset record
     *
     * Reads a single dataset record based on its identifier. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRecordTest() throws ApiException {
        String datasetId = null;
        String recordId = null;
        String select = null;
        String lang = null;
        String timezone = null;
                RecordV21 response = api.getRecord(datasetId, recordId, select, lang, timezone);
        // TODO: test validations
    }
    
    /**
     * Query dataset records
     *
     * Perform a query on dataset records.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRecordsTest() throws ApiException {
        String datasetId = null;
        String select = null;
        String where = null;
        String groupBy = null;
        String orderBy = null;
        Integer limit = null;
        Integer offset = null;
        String refine = null;
        String exclude = null;
        String lang = null;
        String timezone = null;
        Boolean includeLinks = null;
        Boolean includeAppMetas = null;
                ResultsV21 response = api.getRecords(datasetId, select, where, groupBy, orderBy, limit, offset, refine, exclude, lang, timezone, includeLinks, includeAppMetas);
        // TODO: test validations
    }
    
    /**
     * List dataset facets
     *
     * Enumerates facet values for records and returns a list of values for each facet. Can be used to implement guided navigation in large result sets. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRecordsFacetsTest() throws ApiException {
        String datasetId = null;
        String where = null;
        String refine = null;
        String exclude = null;
        String facet = null;
        String lang = null;
        String timezone = null;
                InlineResponse2001 response = api.getRecordsFacets(datasetId, where, refine, exclude, facet, lang, timezone);
        // TODO: test validations
    }
    
    /**
     * List export formats
     *
     * List available export formats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDatasetExportFormatsTest() throws ApiException {
        String datasetId = null;
                InlineResponse200 response = api.listDatasetExportFormats(datasetId);
        // TODO: test validations
    }
    
}
