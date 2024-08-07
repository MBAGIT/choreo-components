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


package org.wso2.client.model.explore_api;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.wso2.client.model.explore_api.DatasetV21Attachments;
import org.wso2.client.model.explore_api.DatasetV21Fields;
import org.wso2.client.model.explore_api.Links;

/**
 * DatasetV21
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-07T09:20:08.114975Z[GMT]")
public class DatasetV21 {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Links> links = null;

  public static final String SERIALIZED_NAME_DATASET_ID = "dataset_id";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;

  public static final String SERIALIZED_NAME_DATASET_UID = "dataset_uid";
  @SerializedName(SERIALIZED_NAME_DATASET_UID)
  private String datasetUid;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<DatasetV21Attachments> attachments = null;

  public static final String SERIALIZED_NAME_HAS_RECORDS = "has_records";
  @SerializedName(SERIALIZED_NAME_HAS_RECORDS)
  private Boolean hasRecords;

  public static final String SERIALIZED_NAME_DATA_VISIBLE = "data_visible";
  @SerializedName(SERIALIZED_NAME_DATA_VISIBLE)
  private Boolean dataVisible;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<String> features = null;

  public static final String SERIALIZED_NAME_METAS = "metas";
  @SerializedName(SERIALIZED_NAME_METAS)
  private Object metas;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<DatasetV21Fields> fields = null;

  public static final String SERIALIZED_NAME_ADDITIONAL_PROPERTIES = "additionalProperties";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PROPERTIES)
  private Object additionalProperties = null;

  public DatasetV21() { 
  }

  
  public DatasetV21(
     String datasetUid
  ) {
    this();
    this.datasetUid = datasetUid;
  }

  public DatasetV21 links(List<Links> links) {
    
    this.links = links;
    return this;
  }

  public DatasetV21 addLinksItem(Links linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Links>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Links> getLinks() {
    return links;
  }


  public void setLinks(List<Links> links) {
    this.links = links;
  }


  public DatasetV21 datasetId(String datasetId) {
    
    this.datasetId = datasetId;
    return this;
  }

   /**
   * Get datasetId
   * @return datasetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatasetId() {
    return datasetId;
  }


  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


   /**
   * Get datasetUid
   * @return datasetUid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatasetUid() {
    return datasetUid;
  }




  public DatasetV21 attachments(List<DatasetV21Attachments> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public DatasetV21 addAttachmentsItem(DatasetV21Attachments attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<DatasetV21Attachments>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DatasetV21Attachments> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<DatasetV21Attachments> attachments) {
    this.attachments = attachments;
  }


  public DatasetV21 hasRecords(Boolean hasRecords) {
    
    this.hasRecords = hasRecords;
    return this;
  }

   /**
   * Get hasRecords
   * @return hasRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasRecords() {
    return hasRecords;
  }


  public void setHasRecords(Boolean hasRecords) {
    this.hasRecords = hasRecords;
  }


  public DatasetV21 dataVisible(Boolean dataVisible) {
    
    this.dataVisible = dataVisible;
    return this;
  }

   /**
   * Get dataVisible
   * @return dataVisible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDataVisible() {
    return dataVisible;
  }


  public void setDataVisible(Boolean dataVisible) {
    this.dataVisible = dataVisible;
  }


  public DatasetV21 features(List<String> features) {
    
    this.features = features;
    return this;
  }

  public DatasetV21 addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<String>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * A map of available features for a dataset, with the fields they apply to. 
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A map of available features for a dataset, with the fields they apply to. ")

  public List<String> getFeatures() {
    return features;
  }


  public void setFeatures(List<String> features) {
    this.features = features;
  }


  public DatasetV21 metas(Object metas) {
    
    this.metas = metas;
    return this;
  }

   /**
   * Get metas
   * @return metas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMetas() {
    return metas;
  }


  public void setMetas(Object metas) {
    this.metas = metas;
  }


  public DatasetV21 fields(List<DatasetV21Fields> fields) {
    
    this.fields = fields;
    return this;
  }

  public DatasetV21 addFieldsItem(DatasetV21Fields fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<DatasetV21Fields>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DatasetV21Fields> getFields() {
    return fields;
  }


  public void setFields(List<DatasetV21Fields> fields) {
    this.fields = fields;
  }


  public DatasetV21 additionalProperties(Object additionalProperties) {
    
    this.additionalProperties = additionalProperties;
    return this;
  }

   /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAdditionalProperties() {
    return additionalProperties;
  }


  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetV21 datasetV21 = (DatasetV21) o;
    return Objects.equals(this.links, datasetV21.links) &&
        Objects.equals(this.datasetId, datasetV21.datasetId) &&
        Objects.equals(this.datasetUid, datasetV21.datasetUid) &&
        Objects.equals(this.attachments, datasetV21.attachments) &&
        Objects.equals(this.hasRecords, datasetV21.hasRecords) &&
        Objects.equals(this.dataVisible, datasetV21.dataVisible) &&
        Objects.equals(this.features, datasetV21.features) &&
        Objects.equals(this.metas, datasetV21.metas) &&
        Objects.equals(this.fields, datasetV21.fields) &&
        Objects.equals(this.additionalProperties, datasetV21.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, datasetId, datasetUid, attachments, hasRecords, dataVisible, features, metas, fields, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetV21 {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    datasetUid: ").append(toIndentedString(datasetUid)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    hasRecords: ").append(toIndentedString(hasRecords)).append("\n");
    sb.append("    dataVisible: ").append(toIndentedString(dataVisible)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    metas: ").append(toIndentedString(metas)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

