/*
 * Easy Blockchain API
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom or Multichain. The latter also allows for a private blockchain. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a context is available using the / POST endpoint. Normally you only need one context. This is the place where backend providers and blockchain implementations are being specified.  2. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is a relative expensive operation.  3. Store entries on the chain from step 2. The entries will contain the content and metadata you want to store forever on the specified chain.  4. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.blockchain.easy.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Access
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-27T12:46:49.139+01:00")
public class Access {
  /**
   * Gets or Sets modes
   */
  public enum ModesEnum {
    NONE("NONE"),
    
    READ("READ"),
    
    WRITE("WRITE");

    private String value;

    ModesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModesEnum fromValue(String text) {
      for (ModesEnum b : ModesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("modes")
  private List<ModesEnum> modes = null;

  @JsonProperty("public")
  private Boolean _public = null;

  @JsonProperty("blackList")
  private List<String> blackList = null;

  @JsonProperty("whiteList")
  private List<String> whiteList = null;

  public Access modes(List<ModesEnum> modes) {
    this.modes = modes;
    return this;
  }

  public Access addModesItem(ModesEnum modesItem) {
    if (this.modes == null) {
      this.modes = new ArrayList<ModesEnum>();
    }
    this.modes.add(modesItem);
    return this;
  }

   /**
   * Get modes
   * @return modes
  **/
  @ApiModelProperty(value = "")
  public List<ModesEnum> getModes() {
    return modes;
  }

  public void setModes(List<ModesEnum> modes) {
    this.modes = modes;
  }

  public Access _public(Boolean _public) {
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @ApiModelProperty(value = "")
  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public Access blackList(List<String> blackList) {
    this.blackList = blackList;
    return this;
  }

  public Access addBlackListItem(String blackListItem) {
    if (this.blackList == null) {
      this.blackList = new ArrayList<String>();
    }
    this.blackList.add(blackListItem);
    return this;
  }

   /**
   * Get blackList
   * @return blackList
  **/
  @ApiModelProperty(value = "")
  public List<String> getBlackList() {
    return blackList;
  }

  public void setBlackList(List<String> blackList) {
    this.blackList = blackList;
  }

  public Access whiteList(List<String> whiteList) {
    this.whiteList = whiteList;
    return this;
  }

  public Access addWhiteListItem(String whiteListItem) {
    if (this.whiteList == null) {
      this.whiteList = new ArrayList<String>();
    }
    this.whiteList.add(whiteListItem);
    return this;
  }

   /**
   * Get whiteList
   * @return whiteList
  **/
  @ApiModelProperty(value = "")
  public List<String> getWhiteList() {
    return whiteList;
  }

  public void setWhiteList(List<String> whiteList) {
    this.whiteList = whiteList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Access access = (Access) o;
    return Objects.equals(this.modes, access.modes) &&
        Objects.equals(this._public, access._public) &&
        Objects.equals(this.blackList, access.blackList) &&
        Objects.equals(this.whiteList, access.whiteList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modes, _public, blackList, whiteList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Access {\n");
    
    sb.append("    modes: ").append(toIndentedString(modes)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    blackList: ").append(toIndentedString(blackList)).append("\n");
    sb.append("    whiteList: ").append(toIndentedString(whiteList)).append("\n");
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

