/**
 * Easy Blockchain API
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom or Multichain. The latter also allows for a private blockchain. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a context is available using the / POST endpoint. Normally you only need one context. This is the place where backend providers and blockchain implementations are being specified.  2. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is a relative expensive operation.  3. Store entries on the chain from step 2. The entries will contain the content and metadata you want to store forever on the specified chain.  4. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['SphereonSDKBlockchainEasy/ApiClient', 'SphereonSDKBlockchainEasy/model/Access'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Access'));
  } else {
    // Browser globals (root is window)
    if (!root.EasyBlockchainApi) {
      root.EasyBlockchainApi = {};
    }
    root.EasyBlockchainApi.RpcProvider = factory(root.EasyBlockchainApi.ApiClient, root.EasyBlockchainApi.Access);
  }
}(this, function(ApiClient, Access) {
  'use strict';




  /**
   * The RpcProvider model module.
   * @module SphereonSDKBlockchainEasy/model/RpcProvider
   * @version 0.9
   */

  /**
   * Constructs a new <code>RpcProvider</code>.
   * RpcProvider
   * @alias module:SphereonSDKBlockchainEasy/model/RpcProvider
   * @class
   */
  var exports = function() {
    var _this = this;









  };

  /**
   * Constructs a <code>RpcProvider</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSDKBlockchainEasy/model/RpcProvider} obj Optional instance to populate.
   * @return {module:SphereonSDKBlockchainEasy/model/RpcProvider} The populated <code>RpcProvider</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('ownerType')) {
        obj['ownerType'] = ApiClient.convertToType(data['ownerType'], 'String');
      }
      if (data.hasOwnProperty('password')) {
        obj['password'] = ApiClient.convertToType(data['password'], 'String');
      }
      if (data.hasOwnProperty('access')) {
        obj['access'] = Access.constructFromObject(data['access']);
      }
      if (data.hasOwnProperty('resourceFiles')) {
        obj['resourceFiles'] = ApiClient.convertToType(data['resourceFiles'], {'String': 'String'});
      }
      if (data.hasOwnProperty('host')) {
        obj['host'] = ApiClient.convertToType(data['host'], 'String');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
      if (data.hasOwnProperty('username')) {
        obj['username'] = ApiClient.convertToType(data['username'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {module:SphereonSDKBlockchainEasy/model/RpcProvider.OwnerTypeEnum} ownerType
   */
  exports.prototype['ownerType'] = undefined;
  /**
   * @member {String} password
   */
  exports.prototype['password'] = undefined;
  /**
   * @member {module:SphereonSDKBlockchainEasy/model/Access} access
   */
  exports.prototype['access'] = undefined;
  /**
   * @member {Object.<String, String>} resourceFiles
   */
  exports.prototype['resourceFiles'] = undefined;
  /**
   * @member {String} host
   */
  exports.prototype['host'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {module:SphereonSDKBlockchainEasy/model/RpcProvider.TypeEnum} type
   */
  exports.prototype['type'] = undefined;
  /**
   * @member {String} username
   */
  exports.prototype['username'] = undefined;


  /**
   * Allowed values for the <code>ownerType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.OwnerTypeEnum = {
    /**
     * value: "PROVIDER"
     * @const
     */
    "PROVIDER": "PROVIDER",
    /**
     * value: "CUSTOMER"
     * @const
     */
    "CUSTOMER": "CUSTOMER"  };

  /**
   * Allowed values for the <code>type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TypeEnum = {
    /**
     * value: "API"
     * @const
     */
    "API": "API",
    /**
     * value: "WALLET"
     * @const
     */
    "WALLET": "WALLET"  };


  return exports;
}));


