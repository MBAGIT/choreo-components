# CatalogApi

All URIs are relative to *https://equipements.sports.gouv.fr/api/explore/v2.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportCatalogCSV**](CatalogApi.md#exportCatalogCSV) | **GET** /catalog/exports/csv | Export a catalog in CSV
[**exportCatalogDCAT**](CatalogApi.md#exportCatalogDCAT) | **GET** /catalog/exports/dcat{dcat_ap_format} | Export a catalog in RDF/XML (DCAT)
[**exportDatasets**](CatalogApi.md#exportDatasets) | **GET** /catalog/exports/{format} | Export a catalog
[**getDataset**](CatalogApi.md#getDataset) | **GET** /catalog/datasets/{dataset_id} | Show dataset information
[**getDatasets**](CatalogApi.md#getDatasets) | **GET** /catalog/datasets | Query catalog datasets
[**getDatasetsFacets**](CatalogApi.md#getDatasetsFacets) | **GET** /catalog/facets | List facet values
[**listExportFormats**](CatalogApi.md#listExportFormats) | **GET** /catalog/exports | List export formats


<a name="exportCatalogCSV"></a>
# **exportCatalogCSV**
> exportCatalogCSV(delimiter, listSeparator, quoteAll, withBom)

Export a catalog in CSV

Export a catalog in CSV (Comma Separated Values). Specific parameters are described here

### Example
```java
// Import classes:
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.models.*;
import org.wso2.client.api.explore_api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    String delimiter = ";"; // String | Sets the field delimiter of the CSV export
    String listSeparator = ","; // String | Sets the separator character used for multivalued strings
    Boolean quoteAll = false; // Boolean | Set it to true to force quoting all strings, i.e. surrounding all strings with quote characters
    Boolean withBom = true; // Boolean | Set it to true to force the first characters of the CSV file to be a Unicode Byte Order Mask (0xFEFF). It usually makes Excel correctly open the output CSV file without warning. **Warning:** the default value of this parameter is `false` in v2.0 and `true` starting with v2.1
    try {
      apiInstance.exportCatalogCSV(delimiter, listSeparator, quoteAll, withBom);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#exportCatalogCSV");
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

<a name="exportCatalogDCAT"></a>
# **exportCatalogDCAT**
> exportCatalogDCAT(dcatApFormat, includeExports)

Export a catalog in RDF/XML (DCAT)

Export a catalog in RDF/XML described with DCAT (Data Catalog Vocabulary). Specific parameters are described here

### Example
```java
// Import classes:
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.models.*;
import org.wso2.client.api.explore_api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    String dcatApFormat = "_ap_ch"; // String | 
    EnumFormatDatasetsV21 includeExports = EnumFormatDatasetsV21.fromValue("json"); // EnumFormatDatasetsV21 | Sets the datasets exports exposed in the DCAT export. By default, all exports are exposed.
    try {
      apiInstance.exportCatalogDCAT(dcatApFormat, includeExports);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#exportCatalogDCAT");
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
 **dcatApFormat** | **String**|  | [enum: _ap_ch, _ap_de, _ap_se, _ap_sp, _ap_it, _ap_vl, _ap_benap]
 **includeExports** | [**EnumFormatDatasetsV21**](.md)| Sets the datasets exports exposed in the DCAT export. By default, all exports are exposed. | [optional] [enum: json, geojson, shp, csv, xlsx, kml, jsonl, jsonld, rdfxml, turtle, n3]

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

<a name="exportDatasets"></a>
# **exportDatasets**
> exportDatasets(format, select, where, orderBy, groupBy, limit, offset, refine, exclude, lang, timezone)

Export a catalog

Export a catalog in the desired format.

### Example
```java
// Import classes:
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.models.*;
import org.wso2.client.api.explore_api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    String format = "json"; // String | 
    String select = "select_example"; // String | Examples: - `select=size` - Example of select, which only return the \"size\" field. - `select=size * 2 as bigger_size` - Example of a complex expression with a label, which returns a new field named \"bigger_size\" and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard ('*'): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label.
    String where = "where_example"; // String | A `where` filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](<https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause>) reference documentation.
    String orderBy = "orderBy_example"; // String | Example: `order_by=sum(age) desc, name asc`  A comma-separated list of field names or aggregations to sort on, followed by an order (`asc` or `desc`).  Results are sorted in ascending order by default. To sort results in descending order, use the `desc` keyword.
    String groupBy = "groupBy_example"; // String | Example: `group_by=city_field as city`  A group by expression defines a grouping function for an aggregation. It can be:  - a field name: group result by each value of this field  - a range function: group result by range  - a date function: group result by date  It is possible to specify a custom name with the 'as name' notation.
    Integer limit = -1; // Integer | Number of items to return in export.  Use -1 (default) to retrieve all records 
    Integer offset = 0; // Integer | Index of the first item to return (starting at 0).  To use with the `limit` parameter to implement pagination.  **Note:** the maximum value depends on the type of query, see the note on `limit` for the details 
    String refine = "refine_example"; // String | Example: `refine=modified:2020` - Return only the value `2020` from the `modified` facet.  A facet filter used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: `refine=<FACETNAME>:<FACETVALUE>`  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **`refine` must not be confused with a `where` filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.**
    String exclude = "exclude_example"; // String | Examples: - `exclude=city:Paris` - Exclude the value `Paris` from the `city` facet. Facets enumeration will display `Paris` as `excluded` without any count information. - `exclude=modified:2019/12` - Exclude the value `2019/12` from the `modified` facet. Facets enumeration will display `2020` as `excluded` without any count information.  A facet filter used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  `exclude` uses the following syntax: `exclude=<FACETNAME>:<FACETVALUE>`  **`exclude` must not be confused with a `where` filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.**
    String lang = "en"; // String | A language value.  If specified, the `lang` value override the default language, which is \"fr\". The language is used to format string, for example in the `date_format` function.
    String timezone = "UTC"; // String | Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml).
    try {
      apiInstance.exportDatasets(format, select, where, orderBy, groupBy, limit, offset, refine, exclude, lang, timezone);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#exportDatasets");
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
 **format** | **String**|  | [enum: json, csv, xlsx, rdf, ttl, data.json, rss, dcat, dcat_ap_ch, dcat_ap_de, dcat_ap_se, dcat_ap_sp, dcat_ap_it, dcat_ap_vl, dcat_ap_benap]
 **select** | **String**| Examples: - &#x60;select&#x3D;size&#x60; - Example of select, which only return the \&quot;size\&quot; field. - &#x60;select&#x3D;size * 2 as bigger_size&#x60; - Example of a complex expression with a label, which returns a new field named \&quot;bigger_size\&quot; and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard (&#39;*&#39;): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label. | [optional]
 **where** | **String**| A &#x60;where&#x60; filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](&lt;https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause&gt;) reference documentation. | [optional]
 **orderBy** | **String**| Example: &#x60;order_by&#x3D;sum(age) desc, name asc&#x60;  A comma-separated list of field names or aggregations to sort on, followed by an order (&#x60;asc&#x60; or &#x60;desc&#x60;).  Results are sorted in ascending order by default. To sort results in descending order, use the &#x60;desc&#x60; keyword. | [optional]
 **groupBy** | **String**| Example: &#x60;group_by&#x3D;city_field as city&#x60;  A group by expression defines a grouping function for an aggregation. It can be:  - a field name: group result by each value of this field  - a range function: group result by range  - a date function: group result by date  It is possible to specify a custom name with the &#39;as name&#39; notation. | [optional]
 **limit** | **Integer**| Number of items to return in export.  Use -1 (default) to retrieve all records  | [optional] [default to -1]
 **offset** | **Integer**| Index of the first item to return (starting at 0).  To use with the &#x60;limit&#x60; parameter to implement pagination.  **Note:** the maximum value depends on the type of query, see the note on &#x60;limit&#x60; for the details  | [optional] [default to 0]
 **refine** | **String**| Example: &#x60;refine&#x3D;modified:2020&#x60; - Return only the value &#x60;2020&#x60; from the &#x60;modified&#x60; facet.  A facet filter used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: &#x60;refine&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **&#x60;refine&#x60; must not be confused with a &#x60;where&#x60; filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.** | [optional]
 **exclude** | **String**| Examples: - &#x60;exclude&#x3D;city:Paris&#x60; - Exclude the value &#x60;Paris&#x60; from the &#x60;city&#x60; facet. Facets enumeration will display &#x60;Paris&#x60; as &#x60;excluded&#x60; without any count information. - &#x60;exclude&#x3D;modified:2019/12&#x60; - Exclude the value &#x60;2019/12&#x60; from the &#x60;modified&#x60; facet. Facets enumeration will display &#x60;2020&#x60; as &#x60;excluded&#x60; without any count information.  A facet filter used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  &#x60;exclude&#x60; uses the following syntax: &#x60;exclude&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  **&#x60;exclude&#x60; must not be confused with a &#x60;where&#x60; filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.** | [optional]
 **lang** | **String**| A language value.  If specified, the &#x60;lang&#x60; value override the default language, which is \&quot;fr\&quot;. The language is used to format string, for example in the &#x60;date_format&#x60; function. | [optional] [enum: en, fr, nl, pt, it, ar, de, es, ca, eu, sv]
 **timezone** | **String**| Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml). | [optional] [default to UTC]

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

<a name="getDataset"></a>
# **getDataset**
> DatasetV21 getDataset(datasetId, select, lang, timezone, includeLinks, includeAppMetas)

Show dataset information

Returns a list of available endpoints for the specified dataset, with metadata and endpoints.  The response includes the following links: * the attachments endpoint * the files endpoint * the records endpoint * the catalog endpoint.

### Example
```java
// Import classes:
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.models.*;
import org.wso2.client.api.explore_api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    String select = "select_example"; // String | Examples: - `select=size` - Example of select, which only return the \"size\" field. - `select=size * 2 as bigger_size` - Example of a complex expression with a label, which returns a new field named \"bigger_size\" and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard ('*'): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label.
    String lang = "en"; // String | A language value.  If specified, the `lang` value override the default language, which is \"fr\". The language is used to format string, for example in the `date_format` function.
    String timezone = "UTC"; // String | Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml).
    Boolean includeLinks = false; // Boolean | If set to `true`, this parameter will add HATEOAS links in the response. 
    Boolean includeAppMetas = false; // Boolean | If set to `true`, this parameter will add application metadata to the response. 
    try {
      DatasetV21 result = apiInstance.getDataset(datasetId, select, lang, timezone, includeLinks, includeAppMetas);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#getDataset");
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
 **lang** | **String**| A language value.  If specified, the &#x60;lang&#x60; value override the default language, which is \&quot;fr\&quot;. The language is used to format string, for example in the &#x60;date_format&#x60; function. | [optional] [enum: en, fr, nl, pt, it, ar, de, es, ca, eu, sv]
 **timezone** | **String**| Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml). | [optional] [default to UTC]
 **includeLinks** | **Boolean**| If set to &#x60;true&#x60;, this parameter will add HATEOAS links in the response.  | [optional] [default to false]
 **includeAppMetas** | **Boolean**| If set to &#x60;true&#x60;, this parameter will add application metadata to the response.  | [optional] [default to false]

### Return type

[**DatasetV21**](DatasetV21.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8json, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The dataset |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**429** | Too many requests |  -  |
**500** | Internal Server Error |  -  |

<a name="getDatasets"></a>
# **getDatasets**
> ResultsDatasetV21 getDatasets(select, where, orderBy, limit, offset, refine, exclude, lang, timezone, groupBy, includeLinks, includeAppMetas)

Query catalog datasets

Retrieve available datasets.

### Example
```java
// Import classes:
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.models.*;
import org.wso2.client.api.explore_api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    String select = "select_example"; // String | Examples: - `select=size` - Example of select, which only return the \"size\" field. - `select=size * 2 as bigger_size` - Example of a complex expression with a label, which returns a new field named \"bigger_size\" and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard ('*'): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label.
    String where = "where_example"; // String | A `where` filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](<https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause>) reference documentation.
    String orderBy = "orderBy_example"; // String | Example: `order_by=sum(age) desc, name asc`  A comma-separated list of field names or aggregations to sort on, followed by an order (`asc` or `desc`).  Results are sorted in ascending order by default. To sort results in descending order, use the `desc` keyword.
    Integer limit = 10; // Integer | Number of items to return.  To use with the `offset` parameter to implement pagination.  The maximum possible value depends on whether the query contains a `group_by` clause or not.  For a query **without** a `group_by`:   - the maximum value for `limit` is 100,   - `offset+limit` should be less than 10000  For a query **with** a `group_by`:   - the maximum value for `limit` is 20000,   - `offset+limit` should be less than 20000  **Note:** If you need more results, please use the /exports endpoint. 
    Integer offset = 0; // Integer | Index of the first item to return (starting at 0).  To use with the `limit` parameter to implement pagination.  **Note:** the maximum value depends on the type of query, see the note on `limit` for the details 
    String refine = "refine_example"; // String | Example: `refine=modified:2020` - Return only the value `2020` from the `modified` facet.  A facet filter used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: `refine=<FACETNAME>:<FACETVALUE>`  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **`refine` must not be confused with a `where` filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.**
    String exclude = "exclude_example"; // String | Examples: - `exclude=city:Paris` - Exclude the value `Paris` from the `city` facet. Facets enumeration will display `Paris` as `excluded` without any count information. - `exclude=modified:2019/12` - Exclude the value `2019/12` from the `modified` facet. Facets enumeration will display `2020` as `excluded` without any count information.  A facet filter used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  `exclude` uses the following syntax: `exclude=<FACETNAME>:<FACETVALUE>`  **`exclude` must not be confused with a `where` filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.**
    String lang = "en"; // String | A language value.  If specified, the `lang` value override the default language, which is \"fr\". The language is used to format string, for example in the `date_format` function.
    String timezone = "UTC"; // String | Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml).
    String groupBy = "groupBy_example"; // String | Example: `group_by=city_field as city`  A group by expression defines a grouping function for an aggregation. It can be:  - a field name: group result by each value of this field  - a range function: group result by range  - a date function: group result by date  It is possible to specify a custom name with the 'as name' notation.
    Boolean includeLinks = false; // Boolean | If set to `true`, this parameter will add HATEOAS links in the response. 
    Boolean includeAppMetas = false; // Boolean | If set to `true`, this parameter will add application metadata to the response. 
    try {
      ResultsDatasetV21 result = apiInstance.getDatasets(select, where, orderBy, limit, offset, refine, exclude, lang, timezone, groupBy, includeLinks, includeAppMetas);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#getDatasets");
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
 **select** | **String**| Examples: - &#x60;select&#x3D;size&#x60; - Example of select, which only return the \&quot;size\&quot; field. - &#x60;select&#x3D;size * 2 as bigger_size&#x60; - Example of a complex expression with a label, which returns a new field named \&quot;bigger_size\&quot; and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard (&#39;*&#39;): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label. | [optional]
 **where** | **String**| A &#x60;where&#x60; filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](&lt;https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause&gt;) reference documentation. | [optional]
 **orderBy** | **String**| Example: &#x60;order_by&#x3D;sum(age) desc, name asc&#x60;  A comma-separated list of field names or aggregations to sort on, followed by an order (&#x60;asc&#x60; or &#x60;desc&#x60;).  Results are sorted in ascending order by default. To sort results in descending order, use the &#x60;desc&#x60; keyword. | [optional]
 **limit** | **Integer**| Number of items to return.  To use with the &#x60;offset&#x60; parameter to implement pagination.  The maximum possible value depends on whether the query contains a &#x60;group_by&#x60; clause or not.  For a query **without** a &#x60;group_by&#x60;:   - the maximum value for &#x60;limit&#x60; is 100,   - &#x60;offset+limit&#x60; should be less than 10000  For a query **with** a &#x60;group_by&#x60;:   - the maximum value for &#x60;limit&#x60; is 20000,   - &#x60;offset+limit&#x60; should be less than 20000  **Note:** If you need more results, please use the /exports endpoint.  | [optional] [default to 10]
 **offset** | **Integer**| Index of the first item to return (starting at 0).  To use with the &#x60;limit&#x60; parameter to implement pagination.  **Note:** the maximum value depends on the type of query, see the note on &#x60;limit&#x60; for the details  | [optional] [default to 0]
 **refine** | **String**| Example: &#x60;refine&#x3D;modified:2020&#x60; - Return only the value &#x60;2020&#x60; from the &#x60;modified&#x60; facet.  A facet filter used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: &#x60;refine&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **&#x60;refine&#x60; must not be confused with a &#x60;where&#x60; filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.** | [optional]
 **exclude** | **String**| Examples: - &#x60;exclude&#x3D;city:Paris&#x60; - Exclude the value &#x60;Paris&#x60; from the &#x60;city&#x60; facet. Facets enumeration will display &#x60;Paris&#x60; as &#x60;excluded&#x60; without any count information. - &#x60;exclude&#x3D;modified:2019/12&#x60; - Exclude the value &#x60;2019/12&#x60; from the &#x60;modified&#x60; facet. Facets enumeration will display &#x60;2020&#x60; as &#x60;excluded&#x60; without any count information.  A facet filter used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  &#x60;exclude&#x60; uses the following syntax: &#x60;exclude&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  **&#x60;exclude&#x60; must not be confused with a &#x60;where&#x60; filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.** | [optional]
 **lang** | **String**| A language value.  If specified, the &#x60;lang&#x60; value override the default language, which is \&quot;fr\&quot;. The language is used to format string, for example in the &#x60;date_format&#x60; function. | [optional] [enum: en, fr, nl, pt, it, ar, de, es, ca, eu, sv]
 **timezone** | **String**| Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml). | [optional] [default to UTC]
 **groupBy** | **String**| Example: &#x60;group_by&#x3D;city_field as city&#x60;  A group by expression defines a grouping function for an aggregation. It can be:  - a field name: group result by each value of this field  - a range function: group result by range  - a date function: group result by date  It is possible to specify a custom name with the &#39;as name&#39; notation. | [optional]
 **includeLinks** | **Boolean**| If set to &#x60;true&#x60;, this parameter will add HATEOAS links in the response.  | [optional] [default to false]
 **includeAppMetas** | **Boolean**| If set to &#x60;true&#x60;, this parameter will add application metadata to the response.  | [optional] [default to false]

### Return type

[**ResultsDatasetV21**](ResultsDatasetV21.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of available datasets |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**429** | Too many requests |  -  |
**500** | Internal Server Error |  -  |

<a name="getDatasetsFacets"></a>
# **getDatasetsFacets**
> InlineResponse2001 getDatasetsFacets(facet, refine, exclude, where, timezone)

List facet values

Enumerate facet values for datasets and returns a list of values for each facet. Can be used to implement guided navigation in large result sets.

### Example
```java
// Import classes:
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.models.*;
import org.wso2.client.api.explore_api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    String facet = "facet_example"; // String | A facet is a field used for simple filtering (through the `refine` and `exclude` parameters) or exploration (with the `/facets` endpoint).  Facets can be configured in the back-office or with this parameter. 
    String refine = "refine_example"; // String | Example: `refine=modified:2020` - Return only the value `2020` from the `modified` facet.  A facet filter used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: `refine=<FACETNAME>:<FACETVALUE>`  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **`refine` must not be confused with a `where` filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.**
    String exclude = "exclude_example"; // String | Examples: - `exclude=city:Paris` - Exclude the value `Paris` from the `city` facet. Facets enumeration will display `Paris` as `excluded` without any count information. - `exclude=modified:2019/12` - Exclude the value `2019/12` from the `modified` facet. Facets enumeration will display `2020` as `excluded` without any count information.  A facet filter used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  `exclude` uses the following syntax: `exclude=<FACETNAME>:<FACETVALUE>`  **`exclude` must not be confused with a `where` filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.**
    String where = "where_example"; // String | A `where` filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](<https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause>) reference documentation.
    String timezone = "UTC"; // String | Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml).
    try {
      InlineResponse2001 result = apiInstance.getDatasetsFacets(facet, refine, exclude, where, timezone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#getDatasetsFacets");
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
 **facet** | **String**| A facet is a field used for simple filtering (through the &#x60;refine&#x60; and &#x60;exclude&#x60; parameters) or exploration (with the &#x60;/facets&#x60; endpoint).  Facets can be configured in the back-office or with this parameter.  | [optional]
 **refine** | **String**| Example: &#x60;refine&#x3D;modified:2020&#x60; - Return only the value &#x60;2020&#x60; from the &#x60;modified&#x60; facet.  A facet filter used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: &#x60;refine&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **&#x60;refine&#x60; must not be confused with a &#x60;where&#x60; filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.** | [optional]
 **exclude** | **String**| Examples: - &#x60;exclude&#x3D;city:Paris&#x60; - Exclude the value &#x60;Paris&#x60; from the &#x60;city&#x60; facet. Facets enumeration will display &#x60;Paris&#x60; as &#x60;excluded&#x60; without any count information. - &#x60;exclude&#x3D;modified:2019/12&#x60; - Exclude the value &#x60;2019/12&#x60; from the &#x60;modified&#x60; facet. Facets enumeration will display &#x60;2020&#x60; as &#x60;excluded&#x60; without any count information.  A facet filter used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  &#x60;exclude&#x60; uses the following syntax: &#x60;exclude&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  **&#x60;exclude&#x60; must not be confused with a &#x60;where&#x60; filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.** | [optional]
 **where** | **String**| A &#x60;where&#x60; filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](&lt;https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause&gt;) reference documentation. | [optional]
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
**200** | An enumeration of facets |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**429** | Too many requests |  -  |
**500** | Internal Server Error |  -  |

<a name="listExportFormats"></a>
# **listExportFormats**
> InlineResponse200 listExportFormats()

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
import org.wso2.client.api.explore_api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://equipements.sports.gouv.fr/api/explore/v2.1");
    
    // Configure OAuth2 access token for authorization: default
    OAuth default = (OAuth) defaultClient.getAuthentication("default");
    default.setAccessToken("YOUR ACCESS TOKEN");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    try {
      InlineResponse200 result = apiInstance.listExportFormats();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#listExportFormats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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

