/* 
 * Easy Blockchain API
 *
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is an expensive operation.  2. Store entries on the chain from step 1. The entries will contain the content and metadata you want to store forever on the specified chain.  3. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.1.0
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Sphereon.SDK.Blockchain.Easy.Test
{
    /// <summary>
    ///  Class for testing IdApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class IdApiTests
    {
        private IdApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new IdApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of IdApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' IdApi
            //Assert.IsInstanceOfType(typeof(IdApi), instance, "instance is a IdApi");
        }

        
        /// <summary>
        /// Test ChainIdExists
        /// </summary>
        [Test]
        public void ChainIdExistsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //var response = instance.ChainIdExists(chainId);
            //Assert.IsInstanceOf<IdResponse> (response, "response is IdResponse");
        }
        
        /// <summary>
        /// Test DetermineChainId
        /// </summary>
        [Test]
        public void DetermineChainIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Chain chain = null;
            //bool? checkExistence = null;
            //var response = instance.DetermineChainId(chain, checkExistence);
            //Assert.IsInstanceOf<IdResponse> (response, "response is IdResponse");
        }
        
        /// <summary>
        /// Test DetermineEntryId
        /// </summary>
        [Test]
        public void DetermineEntryIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //Entry entry = null;
            //bool? checkExistence = null;
            //var response = instance.DetermineEntryId(chainId, entry, checkExistence);
            //Assert.IsInstanceOf<IdResponse> (response, "response is IdResponse");
        }
        
        /// <summary>
        /// Test EntryIdExists
        /// </summary>
        [Test]
        public void EntryIdExistsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string chainId = null;
            //string entryId = null;
            //var response = instance.EntryIdExists(chainId, entryId);
            //Assert.IsInstanceOf<IdResponse> (response, "response is IdResponse");
        }
        
    }

}