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


package com.sphereon.sdk.blockchain.easy.api;

import com.sphereon.sdk.blockchain.easy.handler.ApiException;
import com.sphereon.sdk.blockchain.easy.model.CommittedEntryResponse;
import com.sphereon.sdk.blockchain.easy.model.Entry;
import java.time.OffsetDateTime;
import com.sphereon.sdk.blockchain.easy.model.ErrorResponse;
import com.sphereon.sdk.blockchain.easy.model.AnchoredEntryResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EntryApi
 */
public class EntryApiTest {

    private final EntryApi api = new EntryApi();

    
    /**
     * Create a new entry in the provided chain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEntryTest() throws ApiException {
        String context = null;
        String chainId = null;
        Entry entry = null;
        OffsetDateTime currentAnchorTime = null;
        // CommittedEntryResponse response = api.createEntry(context, chainId, entry, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Get an existing entry in the provided chain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entryByIdTest() throws ApiException {
        String context = null;
        String chainId = null;
        String entryId = null;
        OffsetDateTime currentAnchorTime = null;
        // AnchoredEntryResponse response = api.entryById(context, chainId, entryId, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Get an existing entry in the provided chain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entryByRequestTest() throws ApiException {
        String context = null;
        String chainId = null;
        Entry entry = null;
        OffsetDateTime currentAnchorTime = null;
        // AnchoredEntryResponse response = api.entryByRequest(context, chainId, entry, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void firstEntryTest() throws ApiException {
        String context = null;
        String chainId = null;
        // AnchoredEntryResponse response = api.firstEntry(context, chainId);

        // TODO: test validations
    }
    
    /**
     * Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lastEntryTest() throws ApiException {
        String context = null;
        String chainId = null;
        // AnchoredEntryResponse response = api.lastEntry(context, chainId);

        // TODO: test validations
    }
    
    /**
     * Get the entry after the supplied entry Id (the next) in the provided chain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void nextEntryByIdTest() throws ApiException {
        String context = null;
        String chainId = null;
        String entryId = null;
        OffsetDateTime currentAnchorTime = null;
        // AnchoredEntryResponse response = api.nextEntryById(context, chainId, entryId, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Get the entry after the supplied entry Id (the next) in the provided chain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void nextEntryByRequestTest() throws ApiException {
        String context = null;
        String chainId = null;
        Entry entry = null;
        OffsetDateTime currentAnchorTime = null;
        // AnchoredEntryResponse response = api.nextEntryByRequest(context, chainId, entry, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Get the entry before the supplied entry Id (the previous) in the provided chain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void previousEntryByIdTest() throws ApiException {
        String context = null;
        String chainId = null;
        String entryId = null;
        OffsetDateTime currentAnchorTime = null;
        // AnchoredEntryResponse response = api.previousEntryById(context, chainId, entryId, currentAnchorTime);

        // TODO: test validations
    }
    
    /**
     * Get the entry before the supplied entry Id (the previous) in the provided chain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void previousEntryByRequestTest() throws ApiException {
        String context = null;
        String chainId = null;
        Entry entry = null;
        OffsetDateTime currentAnchorTime = null;
        // AnchoredEntryResponse response = api.previousEntryByRequest(context, chainId, entry, currentAnchorTime);

        // TODO: test validations
    }
    
}
