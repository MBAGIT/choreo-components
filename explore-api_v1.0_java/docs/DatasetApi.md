# DatasetApi

All URIs are relative to *https://equipements.sports.gouv.fr/api/explore/v2.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportRecords**](DatasetApi.md#exportRecords) | **GET** /catalog/datasets/{dataset_id}/exports/{format} | Export a dataset
[**exportRecordsCSV**](DatasetApi.md#exportRecordsCSV) | **GET** /catalog/datasets/{dataset_id}/exports/csv | Export a dataset in CSV
[**exportRecordsGPX**](DatasetApi.md#exportRecordsGPX) | **GET** /catalog/datasets/{dataset_id}/exports/gpx | Export a dataset in GPX
[**getDatasetAttachments**](DatasetApi.md#getDatasetAttachments) | **GET** /catalog/datasets/{dataset_id}/attachments | List dataset attachments
[**getRecord**](DatasetApi.md#getRecord) | **GET** /catalog/datasets/{dataset_id}/records/{record_id} | Read a dataset record
[**getRecords**](DatasetApi.md#getRecords) | **GET** /catalog/datasets/{dataset_id}/records | Query dataset records
[**getRecordsFacets**](DatasetApi.md#getRecordsFacets) | **GET** /catalog/datasets/{dataset_id}/facets | List dataset facets
[**listDatasetExportFormats**](DatasetApi.md#listDatasetExportFormats) | **GET** /catalog/datasets/{dataset_id}/exports | List export formats


<a name="exportRecords"></a>
# **exportRecords**
> exportRecords(datasetId, format, select, where, orderBy, groupBy, limit, refine, exclude, lang, timezone, useLabels, epsg)

Export a dataset

Export a dataset in the desired format. **Note:** The &#x60;group_by&#x60; parameter is only available on exports starting with the v2.1

### Example
```java
// Import classes:
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.models.*;
import org.wso2.client.api.explore_api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    EnumFormatDatasetsV21 format = EnumFormatDatasetsV21.fromValue("json"); // EnumFormatDatasetsV21 | 
    String select = "select_example"; // String | Examples: - `select=size` - Example of select, which only return the \"size\" field. - `select=size * 2 as bigger_size` - Example of a complex expression with a label, which returns a new field named \"bigger_size\" and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard ('*'): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label.
    String where = "where_example"; // String | A `where` filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](<https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause>) reference documentation.
    String orderBy = "orderBy_example"; // String | Example: `order_by=sum(age) desc, name asc`  A comma-separated list of field names or aggregations to sort on, followed by an order (`asc` or `desc`).  Results are sorted in ascending order by default. To sort results in descending order, use the `desc` keyword.
    String groupBy = "groupBy_example"; // String | Example: `group_by=city_field as city`  A group by expression defines a grouping function for an aggregation. It can be:  - a field name: group result by each value of this field  - a range function: group result by range  - a date function: group result by date  It is possible to specify a custom name with the 'as name' notation.
    Integer limit = -1; // Integer | Number of items to return in export.  Use -1 (default) to retrieve all records 
    String refine = "refine_example"; // String | Example: `refine=modified:2020` - Return only the value `2020` from the `modified` facet.  A facet filter used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: `refine=<FACETNAME>:<FACETVALUE>`  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **`refine` must not be confused with a `where` filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.**
    String exclude = "exclude_example"; // String | Examples: - `exclude=city:Paris` - Exclude the value `Paris` from the `city` facet. Facets enumeration will display `Paris` as `excluded` without any count information. - `exclude=modified:2019/12` - Exclude the value `2019/12` from the `modified` facet. Facets enumeration will display `2020` as `excluded` without any count information.  A facet filter used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  `exclude` uses the following syntax: `exclude=<FACETNAME>:<FACETVALUE>`  **`exclude` must not be confused with a `where` filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.**
    String lang = "en"; // String | A language value.  If specified, the `lang` value override the default language, which is \"fr\". The language is used to format string, for example in the `date_format` function.
    String timezone = "UTC"; // String | Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml).
    Boolean useLabels = false; // Boolean | If set to `true`, this parameter will make exports output the label of each field rather than its name.  This parameter only makes sense for formats that contain a list of the fields in their output. 
    Integer epsg = 4326; // Integer | This parameter sets the EPSG code to project shapes into for formats that support geometric features. 
    try {
      apiInstance.exportRecords(datasetId, format, select, where, orderBy, groupBy, limit, refine, exclude, lang, timezone, useLabels, epsg);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#exportRecords");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **String**| The identifier of the dataset to be queried.  You can find it in the \&quot;Information\&quot; tab of the dataset page or in the dataset URL, right after &#x60;/datasets/&#x60;. |
 **format** | [**EnumFormatDatasetsV21**](.md)|  | [enum: json, geojson, shp, csv, xlsx, kml, jsonl, jsonld, rdfxml, turtle, n3]
 **select** | **String**| Examples: - &#x60;select&#x3D;size&#x60; - Example of select, which only return the \&quot;size\&quot; field. - &#x60;select&#x3D;size * 2 as bigger_size&#x60; - Example of a complex expression with a label, which returns a new field named \&quot;bigger_size\&quot; and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard (&#39;*&#39;): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label. | [optional]
 **where** | **String**| A &#x60;where&#x60; filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](&lt;https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause&gt;) reference documentation. | [optional]
 **orderBy** | **String**| Example: &#x60;order_by&#x3D;sum(age) desc, name asc&#x60;  A comma-separated list of field names or aggregations to sort on, followed by an order (&#x60;asc&#x60; or &#x60;desc&#x60;).  Results are sorted in ascending order by default. To sort results in descending order, use the &#x60;desc&#x60; keyword. | [optional]
 **groupBy** | **String**| Example: &#x60;group_by&#x3D;city_field as city&#x60;  A group by expression defines a grouping function for an aggregation. It can be:  - a field name: group result by each value of this field  - a range function: group result by range  - a date function: group result by date  It is possible to specify a custom name with the &#39;as name&#39; notation. | [optional]
 **limit** | **Integer**| Number of items to return in export.  Use -1 (default) to retrieve all records  | [optional] [default to -1]
 **refine** | **String**| Example: &#x60;refine&#x3D;modified:2020&#x60; - Return only the value &#x60;2020&#x60; from the &#x60;modified&#x60; facet.  A facet filter used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: &#x60;refine&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **&#x60;refine&#x60; must not be confused with a &#x60;where&#x60; filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.** | [optional]
 **exclude** | **String**| Examples: - &#x60;exclude&#x3D;city:Paris&#x60; - Exclude the value &#x60;Paris&#x60; from the &#x60;city&#x60; facet. Facets enumeration will display &#x60;Paris&#x60; as &#x60;excluded&#x60; without any count information. - &#x60;exclude&#x3D;modified:2019/12&#x60; - Exclude the value &#x60;2019/12&#x60; from the &#x60;modified&#x60; facet. Facets enumeration will display &#x60;2020&#x60; as &#x60;excluded&#x60; without any count information.  A facet filter used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  &#x60;exclude&#x60; uses the following syntax: &#x60;exclude&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  **&#x60;exclude&#x60; must not be confused with a &#x60;where&#x60; filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.** | [optional]
 **lang** | **String**| A language value.  If specified, the &#x60;lang&#x60; value override the default language, which is \&quot;fr\&quot;. The language is used to format string, for example in the &#x60;date_format&#x60; function. | [optional] [enum: en, fr, nl, pt, it, ar, de, es, ca, eu, sv]
 **timezone** | **String**| Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml). | [optional] [default to UTC]
 **useLabels** | **Boolean**| If set to &#x60;true&#x60;, this parameter will make exports output the label of each field rather than its name.  This parameter only makes sense for formats that contain a list of the fields in their output.  | [optional] [default to false]
 **epsg** | **Integer**| This parameter sets the EPSG code to project shapes into for formats that support geometric features.  | [optional] [default to 4326]

### Return type

null (empty response body)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Return a file |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**429** | Too many requests |  -  |
**500** | Internal Server Error |  -  |

<a name="exportRecordsCSV"></a>
# **exportRecordsCSV**
> exportRecordsCSV(datasetId, delimiter, listSeparator, quoteAll, withBom)

Export a dataset in CSV

Export a dataset in CSV (Comma Separated Values). Specific parameters are described here

### Example
```java
// Import classes:
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.models.*;
import org.wso2.client.api.explore_api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    String delimiter = ";"; // String | Sets the field delimiter of the CSV export
    String listSeparator = ","; // String | Sets the separator character used for multivalued strings
    Boolean quoteAll = false; // Boolean | Set it to true to force quoting all strings, i.e. surrounding all strings with quote characters
    Boolean withBom = true; // Boolean | Set it to true to force the first characters of the CSV file to be a Unicode Byte Order Mask (0xFEFF). It usually makes Excel correctly open the output CSV file without warning. **Warning:** the default value of this parameter is `false` in v2.0 and `true` starting with v2.1
    try {
      apiInstance.exportRecordsCSV(datasetId, delimiter, listSeparator, quoteAll, withBom);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#exportRecordsCSV");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **String**| The identifier of the dataset to be queried.  You can find it in the \&quot;Information\&quot; tab of the dataset page or in the dataset URL, right after &#x60;/datasets/&#x60;. |
 **delimiter** | **String**| Sets the field delimiter of the CSV export | [optional] [default to ;] [enum: ;, ,, 	, |]
 **listSeparator** | **String**| Sets the separator character used for multivalued strings | [optional] [default to ,]
 **quoteAll** | **Boolean**| Set it to true to force quoting all strings, i.e. surrounding all strings with quote characters | [optional] [default to false]
 **withBom** | **Boolean**| Set it to true to force the first characters of the CSV file to be a Unicode Byte Order Mask (0xFEFF). It usually makes Excel correctly open the output CSV file without warning. **Warning:** the default value of this parameter is &#x60;false&#x60; in v2.0 and &#x60;true&#x60; starting with v2.1 | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Return a file |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**429** | Too many requests |  -  |
**500** | Internal Server Error |  -  |

<a name="exportRecordsGPX"></a>
# **exportRecordsGPX**
> exportRecordsGPX(datasetId, nameField, descriptionFieldList, useExtension)

Export a dataset in GPX

Export a dataset in GPX. Specific parameters are described here

### Example
```java
// Import classes:
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.models.*;
import org.wso2.client.api.explore_api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    String nameField = "nameField_example"; // String | Sets the field that is used as the 'name' attribute in the GPX output
    String descriptionFieldList = "descriptionFieldList_example"; // String | Sets the fields to use in the 'description' attribute of the GPX output
    Boolean useExtension = true; // Boolean | Set it to true to use the `<extension>` tag for attributes (as GDAL does). Set it to false to use the `<desc>` tag for attributes. **Warning:** the default value of this parameter is `false` in v2.0 and `true` starting with v2.1
    try {
      apiInstance.exportRecordsGPX(datasetId, nameField, descriptionFieldList, useExtension);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#exportRecordsGPX");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **String**| The identifier of the dataset to be queried.  You can find it in the \&quot;Information\&quot; tab of the dataset page or in the dataset URL, right after &#x60;/datasets/&#x60;. |
 **nameField** | **String**| Sets the field that is used as the &#39;name&#39; attribute in the GPX output | [optional]
 **descriptionFieldList** | **String**| Sets the fields to use in the &#39;description&#39; attribute of the GPX output | [optional]
 **useExtension** | **Boolean**| Set it to true to use the &#x60;&lt;extension&gt;&#x60; tag for attributes (as GDAL does). Set it to false to use the &#x60;&lt;desc&gt;&#x60; tag for attributes. **Warning:** the default value of this parameter is &#x60;false&#x60; in v2.0 and &#x60;true&#x60; starting with v2.1 | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Return a file |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**429** | Too many requests |  -  |
**500** | Internal Server Error |  -  |

<a name="getDatasetAttachments"></a>
# **getDatasetAttachments**
> InlineResponse2002 getDatasetAttachments(datasetId)

List dataset attachments

Returns a list of all available attachments for a dataset. 

### Example
```java
// Import classes:
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.models.*;
import org.wso2.client.api.explore_api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    try {
      InlineResponse2002 result = apiInstance.getDatasetAttachments(datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getDatasetAttachments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **String**| The identifier of the dataset to be queried.  You can find it in the \&quot;Information\&quot; tab of the dataset page or in the dataset URL, right after &#x60;/datasets/&#x60;. |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of all available attachments |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**429** | Too many requests |  -  |
**500** | Internal Server Error |  -  |

<a name="getRecord"></a>
# **getRecord**
> RecordV21 getRecord(datasetId, recordId, select, lang, timezone)

Read a dataset record

Reads a single dataset record based on its identifier. 

### Example
```java
// Import classes:
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.models.*;
import org.wso2.client.api.explore_api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    String recordId = "recordId_example"; // String | Record identifier
    String select = "select_example"; // String | Examples: - `select=size` - Example of select, which only return the \"size\" field. - `select=size * 2 as bigger_size` - Example of a complex expression with a label, which returns a new field named \"bigger_size\" and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard ('*'): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label.
    String lang = "en"; // String | A language value.  If specified, the `lang` value override the default language, which is \"fr\". The language is used to format string, for example in the `date_format` function.
    String timezone = "UTC"; // String | Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml).
    try {
      RecordV21 result = apiInstance.getRecord(datasetId, recordId, select, lang, timezone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getRecord");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **String**| The identifier of the dataset to be queried.  You can find it in the \&quot;Information\&quot; tab of the dataset page or in the dataset URL, right after &#x60;/datasets/&#x60;. |
 **recordId** | **String**| Record identifier |
 **select** | **String**| Examples: - &#x60;select&#x3D;size&#x60; - Example of select, which only return the \&quot;size\&quot; field. - &#x60;select&#x3D;size * 2 as bigger_size&#x60; - Example of a complex expression with a label, which returns a new field named \&quot;bigger_size\&quot; and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard (&#39;*&#39;): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label. | [optional]
 **lang** | **String**| A language value.  If specified, the &#x60;lang&#x60; value override the default language, which is \&quot;fr\&quot;. The language is used to format string, for example in the &#x60;date_format&#x60; function. | [optional] [enum: en, fr, nl, pt, it, ar, de, es, ca, eu, sv]
 **timezone** | **String**| Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml). | [optional] [default to UTC]

### Return type

[**RecordV21**](RecordV21.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single record |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**429** | Too many requests |  -  |
**500** | Internal Server Error |  -  |

<a name="getRecords"></a>
# **getRecords**
> ResultsV21 getRecords(datasetId, select, where, groupBy, orderBy, limit, offset, refine, exclude, lang, timezone, includeLinks, includeAppMetas)

Query dataset records

Perform a query on dataset records.

### Example
```java
// Import classes:
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.models.*;
import org.wso2.client.api.explore_api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    String select = "select_example"; // String | Examples: - `select=size` - Example of select, which only return the \"size\" field. - `select=size * 2 as bigger_size` - Example of a complex expression with a label, which returns a new field named \"bigger_size\" and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard ('*'): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label.
    String where = "where_example"; // String | A `where` filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](<https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause>) reference documentation.
    String groupBy = "groupBy_example"; // String | Example: `group_by=city_field as city`  A group by expression defines a grouping function for an aggregation. It can be:  - a field name: group result by each value of this field  - a range function: group result by range  - a date function: group result by date  It is possible to specify a custom name with the 'as name' notation.
    String orderBy = "orderBy_example"; // String | Example: `order_by=sum(age) desc, name asc`  A comma-separated list of field names or aggregations to sort on, followed by an order (`asc` or `desc`).  Results are sorted in ascending order by default. To sort results in descending order, use the `desc` keyword.
    Integer limit = 10; // Integer | Number of items to return.  To use with the `offset` parameter to implement pagination.  The maximum possible value depends on whether the query contains a `group_by` clause or not.  For a query **without** a `group_by`:   - the maximum value for `limit` is 100,   - `offset+limit` should be less than 10000  For a query **with** a `group_by`:   - the maximum value for `limit` is 20000,   - `offset+limit` should be less than 20000  **Note:** If you need more results, please use the /exports endpoint. 
    Integer offset = 0; // Integer | Index of the first item to return (starting at 0).  To use with the `limit` parameter to implement pagination.  **Note:** the maximum value depends on the type of query, see the note on `limit` for the details 
    String refine = "refine_example"; // String | Example: `refine=modified:2020` - Return only the value `2020` from the `modified` facet.  A facet filter used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: `refine=<FACETNAME>:<FACETVALUE>`  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **`refine` must not be confused with a `where` filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.**
    String exclude = "exclude_example"; // String | Examples: - `exclude=city:Paris` - Exclude the value `Paris` from the `city` facet. Facets enumeration will display `Paris` as `excluded` without any count information. - `exclude=modified:2019/12` - Exclude the value `2019/12` from the `modified` facet. Facets enumeration will display `2020` as `excluded` without any count information.  A facet filter used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  `exclude` uses the following syntax: `exclude=<FACETNAME>:<FACETVALUE>`  **`exclude` must not be confused with a `where` filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.**
    String lang = "en"; // String | A language value.  If specified, the `lang` value override the default language, which is \"fr\". The language is used to format string, for example in the `date_format` function.
    String timezone = "UTC"; // String | Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml).
    Boolean includeLinks = false; // Boolean | If set to `true`, this parameter will add HATEOAS links in the response. 
    Boolean includeAppMetas = false; // Boolean | If set to `true`, this parameter will add application metadata to the response. 
    try {
      ResultsV21 result = apiInstance.getRecords(datasetId, select, where, groupBy, orderBy, limit, offset, refine, exclude, lang, timezone, includeLinks, includeAppMetas);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getRecords");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **String**| The identifier of the dataset to be queried.  You can find it in the \&quot;Information\&quot; tab of the dataset page or in the dataset URL, right after &#x60;/datasets/&#x60;. |
 **select** | **String**| Examples: - &#x60;select&#x3D;size&#x60; - Example of select, which only return the \&quot;size\&quot; field. - &#x60;select&#x3D;size * 2 as bigger_size&#x60; - Example of a complex expression with a label, which returns a new field named \&quot;bigger_size\&quot; and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard (&#39;*&#39;): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label. | [optional]
 **where** | **String**| A &#x60;where&#x60; filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](&lt;https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause&gt;) reference documentation. | [optional]
 **groupBy** | **String**| Example: &#x60;group_by&#x3D;city_field as city&#x60;  A group by expression defines a grouping function for an aggregation. It can be:  - a field name: group result by each value of this field  - a range function: group result by range  - a date function: group result by date  It is possible to specify a custom name with the &#39;as name&#39; notation. | [optional]
 **orderBy** | **String**| Example: &#x60;order_by&#x3D;sum(age) desc, name asc&#x60;  A comma-separated list of field names or aggregations to sort on, followed by an order (&#x60;asc&#x60; or &#x60;desc&#x60;).  Results are sorted in ascending order by default. To sort results in descending order, use the &#x60;desc&#x60; keyword. | [optional]
 **limit** | **Integer**| Number of items to return.  To use with the &#x60;offset&#x60; parameter to implement pagination.  The maximum possible value depends on whether the query contains a &#x60;group_by&#x60; clause or not.  For a query **without** a &#x60;group_by&#x60;:   - the maximum value for &#x60;limit&#x60; is 100,   - &#x60;offset+limit&#x60; should be less than 10000  For a query **with** a &#x60;group_by&#x60;:   - the maximum value for &#x60;limit&#x60; is 20000,   - &#x60;offset+limit&#x60; should be less than 20000  **Note:** If you need more results, please use the /exports endpoint.  | [optional] [default to 10]
 **offset** | **Integer**| Index of the first item to return (starting at 0).  To use with the &#x60;limit&#x60; parameter to implement pagination.  **Note:** the maximum value depends on the type of query, see the note on &#x60;limit&#x60; for the details  | [optional] [default to 0]
 **refine** | **String**| Example: &#x60;refine&#x3D;modified:2020&#x60; - Return only the value &#x60;2020&#x60; from the &#x60;modified&#x60; facet.  A facet filter used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: &#x60;refine&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **&#x60;refine&#x60; must not be confused with a &#x60;where&#x60; filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.** | [optional]
 **exclude** | **String**| Examples: - &#x60;exclude&#x3D;city:Paris&#x60; - Exclude the value &#x60;Paris&#x60; from the &#x60;city&#x60; facet. Facets enumeration will display &#x60;Paris&#x60; as &#x60;excluded&#x60; without any count information. - &#x60;exclude&#x3D;modified:2019/12&#x60; - Exclude the value &#x60;2019/12&#x60; from the &#x60;modified&#x60; facet. Facets enumeration will display &#x60;2020&#x60; as &#x60;excluded&#x60; without any count information.  A facet filter used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  &#x60;exclude&#x60; uses the following syntax: &#x60;exclude&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  **&#x60;exclude&#x60; must not be confused with a &#x60;where&#x60; filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.** | [optional]
 **lang** | **String**| A language value.  If specified, the &#x60;lang&#x60; value override the default language, which is \&quot;fr\&quot;. The language is used to format string, for example in the &#x60;date_format&#x60; function. | [optional] [enum: en, fr, nl, pt, it, ar, de, es, ca, eu, sv]
 **timezone** | **String**| Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml). | [optional] [default to UTC]
 **includeLinks** | **Boolean**| If set to &#x60;true&#x60;, this parameter will add HATEOAS links in the response.  | [optional] [default to false]
 **includeAppMetas** | **Boolean**| If set to &#x60;true&#x60;, this parameter will add application metadata to the response.  | [optional] [default to false]

### Return type

[**ResultsV21**](ResultsV21.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Records |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**429** | Too many requests |  -  |
**500** | Internal Server Error |  -  |

<a name="getRecordsFacets"></a>
# **getRecordsFacets**
> InlineResponse2001 getRecordsFacets(datasetId, where, refine, exclude, facet, lang, timezone)

List dataset facets

Enumerates facet values for records and returns a list of values for each facet. Can be used to implement guided navigation in large result sets. 

### Example
```java
// Import classes:
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.models.*;
import org.wso2.client.api.explore_api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    String where = "where_example"; // String | A `where` filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](<https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause>) reference documentation.
    String refine = "refine_example"; // String | Example: `refine=modified:2020` - Return only the value `2020` from the `modified` facet.  A facet filter used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: `refine=<FACETNAME>:<FACETVALUE>`  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **`refine` must not be confused with a `where` filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.**
    String exclude = "exclude_example"; // String | Examples: - `exclude=city:Paris` - Exclude the value `Paris` from the `city` facet. Facets enumeration will display `Paris` as `excluded` without any count information. - `exclude=modified:2019/12` - Exclude the value `2019/12` from the `modified` facet. Facets enumeration will display `2020` as `excluded` without any count information.  A facet filter used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  `exclude` uses the following syntax: `exclude=<FACETNAME>:<FACETVALUE>`  **`exclude` must not be confused with a `where` filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.**
    String facet = "facet_example"; // String | A facet is a field used for simple filtering (through the `refine` and `exclude` parameters) or exploration (with the `/facets` endpoint).  Facets can be configured in the back-office or with this parameter. 
    String lang = "en"; // String | A language value.  If specified, the `lang` value override the default language, which is \"fr\". The language is used to format string, for example in the `date_format` function.
    String timezone = "UTC"; // String | Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml).
    try {
      InlineResponse2001 result = apiInstance.getRecordsFacets(datasetId, where, refine, exclude, facet, lang, timezone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getRecordsFacets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **String**| The identifier of the dataset to be queried.  You can find it in the \&quot;Information\&quot; tab of the dataset page or in the dataset URL, right after &#x60;/datasets/&#x60;. |
 **where** | **String**| A &#x60;where&#x60; filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](&lt;https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause&gt;) reference documentation. | [optional]
 **refine** | **String**| Example: &#x60;refine&#x3D;modified:2020&#x60; - Return only the value &#x60;2020&#x60; from the &#x60;modified&#x60; facet.  A facet filter used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: &#x60;refine&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **&#x60;refine&#x60; must not be confused with a &#x60;where&#x60; filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.** | [optional]
 **exclude** | **String**| Examples: - &#x60;exclude&#x3D;city:Paris&#x60; - Exclude the value &#x60;Paris&#x60; from the &#x60;city&#x60; facet. Facets enumeration will display &#x60;Paris&#x60; as &#x60;excluded&#x60; without any count information. - &#x60;exclude&#x3D;modified:2019/12&#x60; - Exclude the value &#x60;2019/12&#x60; from the &#x60;modified&#x60; facet. Facets enumeration will display &#x60;2020&#x60; as &#x60;excluded&#x60; without any count information.  A facet filter used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  &#x60;exclude&#x60; uses the following syntax: &#x60;exclude&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  **&#x60;exclude&#x60; must not be confused with a &#x60;where&#x60; filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.** | [optional]
 **facet** | **String**| A facet is a field used for simple filtering (through the &#x60;refine&#x60; and &#x60;exclude&#x60; parameters) or exploration (with the &#x60;/facets&#x60; endpoint).  Facets can be configured in the back-office or with this parameter.  | [optional]
 **lang** | **String**| A language value.  If specified, the &#x60;lang&#x60; value override the default language, which is \&quot;fr\&quot;. The language is used to format string, for example in the &#x60;date_format&#x60; function. | [optional] [enum: en, fr, nl, pt, it, ar, de, es, ca, eu, sv]
 **timezone** | **String**| Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml). | [optional] [default to UTC]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Facets enumeration |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**429** | Too many requests |  -  |
**500** | Internal Server Error |  -  |

<a name="listDatasetExportFormats"></a>
# **listDatasetExportFormats**
> InlineResponse200 listDatasetExportFormats(datasetId)

List export formats

List available export formats

### Example
```java
// Import classes:
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.models.*;
import org.wso2.client.api.explore_api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    try {
      InlineResponse200 result = apiInstance.listDatasetExportFormats(datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#listDatasetExportFormats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **String**| The identifier of the dataset to be queried.  You can find it in the \&quot;Information\&quot; tab of the dataset page or in the dataset URL, right after &#x60;/datasets/&#x60;. |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of available export formats |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**429** | Too many requests |  -  |
**500** | Internal Server Error |  -  |

