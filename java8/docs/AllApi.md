# AllApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chainIdExists**](AllApi.md#chainIdExists) | **GET** /blockchain/easy/0.1.0/chains/id/{chainId} | Determine whether the Id of a chain exists in the blockchain
[**createChain**](AllApi.md#createChain) | **POST** /blockchain/easy/0.1.0/chains | Create a new chain
[**createEntry**](AllApi.md#createEntry) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries | Create a new entry in the provided chain
[**determineChainId**](AllApi.md#determineChainId) | **POST** /blockchain/easy/0.1.0/chains/id | Pre determine the Id of a chain request without anchoring it in the blockchain
[**determineEntryId**](AllApi.md#determineEntryId) | **POST** /blockchain/easy/0.1.0/chains/id/{chainId}/entries | Pre determine the Id of an entry request without anchoring the entry
[**entryById**](AllApi.md#entryById) | **GET** /blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
[**entryByRequest**](AllApi.md#entryByRequest) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
[**entryIdExists**](AllApi.md#entryIdExists) | **GET** /blockchain/easy/0.1.0/chains/id/{chainId}/entries/{entryId} | Determine whether the Id of an entry exists in the blockchain
[**lastEntry**](AllApi.md#lastEntry) | **GET** /blockchain/easy/0.1.0/chains/{chainId}/entries/last | Get the last entry in the provided chain. This is the most recent entry also called the chain head


<a name="chainIdExists"></a>
# **chainIdExists**
> IdResponse chainIdExists(chainId)

Determine whether the Id of a chain exists in the blockchain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;


AllApi apiInstance = new AllApi();
String chainId = "chainId_example"; // String | chainId
try {
    IdResponse result = apiInstance.chainIdExists(chainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#chainIdExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createChain"></a>
# **createChain**
> CommittedChainResponse createChain(chain)

Create a new chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;


AllApi apiInstance = new AllApi();
Chain chain = new Chain(); // Chain | Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!
try {
    CommittedChainResponse result = apiInstance.createChain(chain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#createChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | [**Chain**](Chain.md)| Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! |

### Return type

[**CommittedChainResponse**](CommittedChainResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="createEntry"></a>
# **createEntry**
> CommittedEntryResponse createEntry(chainId, entry)

Create a new entry in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;


AllApi apiInstance = new AllApi();
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | Create a new entry for the specified chain
try {
    CommittedEntryResponse result = apiInstance.createEntry(chainId, entry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#createEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| Create a new entry for the specified chain |

### Return type

[**CommittedEntryResponse**](CommittedEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="determineChainId"></a>
# **determineChainId**
> IdResponse determineChainId(chain, checkExistence)

Pre determine the Id of a chain request without anchoring it in the blockchain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;


AllApi apiInstance = new AllApi();
Chain chain = new Chain(); // Chain | Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!
Boolean checkExistence = false; // Boolean | Check whether the id exists
try {
    IdResponse result = apiInstance.determineChainId(chain, checkExistence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#determineChainId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | [**Chain**](Chain.md)| Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network! |
 **checkExistence** | **Boolean**| Check whether the id exists | [optional] [default to false]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="determineEntryId"></a>
# **determineEntryId**
> IdResponse determineEntryId(chainId, entry, checkExistence)

Pre determine the Id of an entry request without anchoring the entry

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;


AllApi apiInstance = new AllApi();
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | The entry to determine the hash for on the specified chain
Boolean checkExistence = false; // Boolean | Check whether the id exists
try {
    IdResponse result = apiInstance.determineEntryId(chainId, entry, checkExistence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#determineEntryId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| The entry to determine the hash for on the specified chain |
 **checkExistence** | **Boolean**| Check whether the id exists | [optional] [default to false]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="entryById"></a>
# **entryById**
> AnchoredEntryResponse entryById(chainId, entryId)

Get an existing entry in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;


AllApi apiInstance = new AllApi();
String chainId = "chainId_example"; // String | chainId
String entryId = "entryId_example"; // String | entryId
try {
    AnchoredEntryResponse result = apiInstance.entryById(chainId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#entryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId |
 **entryId** | **String**| entryId |

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="entryByRequest"></a>
# **entryByRequest**
> AnchoredEntryResponse entryByRequest(chainId, entry)

Get an existing entry in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;


AllApi apiInstance = new AllApi();
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | Retrieve the entry
try {
    AnchoredEntryResponse result = apiInstance.entryByRequest(chainId, entry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#entryByRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId |
 **entry** | [**Entry**](Entry.md)| Retrieve the entry |

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="entryIdExists"></a>
# **entryIdExists**
> IdResponse entryIdExists(chainId, entryId)

Determine whether the Id of an entry exists in the blockchain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;


AllApi apiInstance = new AllApi();
String chainId = "chainId_example"; // String | chainId
String entryId = "entryId_example"; // String | entryId
try {
    IdResponse result = apiInstance.entryIdExists(chainId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#entryIdExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId |
 **entryId** | **String**| entryId |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="lastEntry"></a>
# **lastEntry**
> AnchoredEntryResponse lastEntry(chainId)

Get the last entry in the provided chain. This is the most recent entry also called the chain head

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.AllApi;


AllApi apiInstance = new AllApi();
String chainId = "chainId_example"; // String | chainId
try {
    AnchoredEntryResponse result = apiInstance.lastEntry(chainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllApi#lastEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| chainId |

### Return type

[**AnchoredEntryResponse**](AnchoredEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8
