/*
 * Easy Blockchain API
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom or Multichain. The latter also allows for a private blockchain. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a context is available using the / POST endpoint. Normally you only need one context. This is the place where backend providers and blockchain implementations are being specified.  2. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is a relative expensive operation.  3. Store entries on the chain from step 2. The entries will contain the content and metadata you want to store forever on the specified chain.  4. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9.1
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.blockchain.easy.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sphereon.sdk.blockchain.easy.model.RpcProvider;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Backend
 */
@ApiModel(description = "Backend")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-09T13:08:27.372+02:00")
public class Backend {
  @JsonProperty("apiVersion")
  private Integer apiVersion = null;

  /**
   * Gets or Sets dataStructure
   */
  public enum DataStructureEnum {
    FACTOM("Factom"),
    
    MULTICHAIN("Multichain");

    private String value;

    DataStructureEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DataStructureEnum fromValue(String text) {
      for (DataStructureEnum b : DataStructureEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("dataStructure")
  private DataStructureEnum dataStructure = null;

  @JsonProperty("end")
  private OffsetDateTime end = null;

  @JsonProperty("id")
  private String id = null;

  /**
   * Gets or Sets implementation
   */
  public enum ImplementationEnum {
    BITCOIN("Bitcoin"),
    
    NONE("None");

    private String value;

    ImplementationEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ImplementationEnum fromValue(String text) {
      for (ImplementationEnum b : ImplementationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("implementation")
  private ImplementationEnum implementation = null;

  @JsonProperty("ledgerName")
  private String ledgerName = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("rpcProviders")
  private List<RpcProvider> rpcProviders = new ArrayList<RpcProvider>();

  @JsonProperty("start")
  private OffsetDateTime start = null;

  public Backend apiVersion(Integer apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Get apiVersion
   * @return apiVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(Integer apiVersion) {
    this.apiVersion = apiVersion;
  }

  public Backend dataStructure(DataStructureEnum dataStructure) {
    this.dataStructure = dataStructure;
    return this;
  }

   /**
   * Get dataStructure
   * @return dataStructure
  **/
  @ApiModelProperty(example = "null", value = "")
  public DataStructureEnum getDataStructure() {
    return dataStructure;
  }

  public void setDataStructure(DataStructureEnum dataStructure) {
    this.dataStructure = dataStructure;
  }

  public Backend end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public Backend id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Backend implementation(ImplementationEnum implementation) {
    this.implementation = implementation;
    return this;
  }

   /**
   * Get implementation
   * @return implementation
  **/
  @ApiModelProperty(example = "null", value = "")
  public ImplementationEnum getImplementation() {
    return implementation;
  }

  public void setImplementation(ImplementationEnum implementation) {
    this.implementation = implementation;
  }

  public Backend ledgerName(String ledgerName) {
    this.ledgerName = ledgerName;
    return this;
  }

   /**
   * Get ledgerName
   * @return ledgerName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLedgerName() {
    return ledgerName;
  }

  public void setLedgerName(String ledgerName) {
    this.ledgerName = ledgerName;
  }

  public Backend owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Backend rpcProviders(List<RpcProvider> rpcProviders) {
    this.rpcProviders = rpcProviders;
    return this;
  }

  public Backend addRpcProvidersItem(RpcProvider rpcProvidersItem) {
    this.rpcProviders.add(rpcProvidersItem);
    return this;
  }

   /**
   * Get rpcProviders
   * @return rpcProviders
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<RpcProvider> getRpcProviders() {
    return rpcProviders;
  }

  public void setRpcProviders(List<RpcProvider> rpcProviders) {
    this.rpcProviders = rpcProviders;
  }

  public Backend start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Backend backend = (Backend) o;
    return Objects.equals(this.apiVersion, backend.apiVersion) &&
        Objects.equals(this.dataStructure, backend.dataStructure) &&
        Objects.equals(this.end, backend.end) &&
        Objects.equals(this.id, backend.id) &&
        Objects.equals(this.implementation, backend.implementation) &&
        Objects.equals(this.ledgerName, backend.ledgerName) &&
        Objects.equals(this.owner, backend.owner) &&
        Objects.equals(this.rpcProviders, backend.rpcProviders) &&
        Objects.equals(this.start, backend.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, dataStructure, end, id, implementation, ledgerName, owner, rpcProviders, start);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Backend {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    dataStructure: ").append(toIndentedString(dataStructure)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    implementation: ").append(toIndentedString(implementation)).append("\n");
    sb.append("    ledgerName: ").append(toIndentedString(ledgerName)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    rpcProviders: ").append(toIndentedString(rpcProviders)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

