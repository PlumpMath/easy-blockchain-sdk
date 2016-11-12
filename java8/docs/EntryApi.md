# EntryApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEntry**](EntryApi.md#createEntry) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries | Create a new entry in the provided chain
[**entryById**](EntryApi.md#entryById) | **GET** /blockchain/easy/0.1.0/chains/{chainId}/entries/{entryId} | Get an existing entry in the provided chain
[**entryByRequest**](EntryApi.md#entryByRequest) | **POST** /blockchain/easy/0.1.0/chains/{chainId}/entries/entry | Get an existing entry in the provided chain
[**lastEntry**](EntryApi.md#lastEntry) | **GET** /blockchain/easy/0.1.0/chains/{chainId}/entries/last | Get the last entry in the provided chain. This is the most recent entry also called the chain head


<a name="createEntry"></a>
# **createEntry**
> CommittedEntryResponse createEntry(chainId, entry)

Create a new entry in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.EntryApi;


EntryApi apiInstance = new EntryApi();
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | Create a new entry for the specified chain
try {
    CommittedEntryResponse result = apiInstance.createEntry(chainId, entry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#createEntry");
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

<a name="entryById"></a>
# **entryById**
> AnchoredEntryResponse entryById(chainId, entryId)

Get an existing entry in the provided chain

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.EntryApi;


EntryApi apiInstance = new EntryApi();
String chainId = "chainId_example"; // String | chainId
String entryId = "entryId_example"; // String | entryId
try {
    AnchoredEntryResponse result = apiInstance.entryById(chainId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#entryById");
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
//import com.sphereon.sdk.blockchain.easy.api.EntryApi;


EntryApi apiInstance = new EntryApi();
String chainId = "chainId_example"; // String | chainId
Entry entry = new Entry(); // Entry | Retrieve the entry
try {
    AnchoredEntryResponse result = apiInstance.entryByRequest(chainId, entry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#entryByRequest");
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

<a name="lastEntry"></a>
# **lastEntry**
> AnchoredEntryResponse lastEntry(chainId)

Get the last entry in the provided chain. This is the most recent entry also called the chain head

### Example
```java
// Import classes:
//import com.sphereon.sdk.blockchain.easy.handler.ApiException;
//import com.sphereon.sdk.blockchain.easy.api.EntryApi;


EntryApi apiInstance = new EntryApi();
String chainId = "chainId_example"; // String | chainId
try {
    AnchoredEntryResponse result = apiInstance.lastEntry(chainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#lastEntry");
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
