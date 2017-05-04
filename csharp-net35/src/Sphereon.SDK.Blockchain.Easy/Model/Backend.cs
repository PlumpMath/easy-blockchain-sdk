/* 
 * Easy Blockchain API
 *
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom or Multichain. The latter also allows for a private blockchain. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a context is available using the / POST endpoint. Normally you only need one context. This is the place where backend providers and blockchain implementations are being specified.  2. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is a relative expensive operation.  3. Store entries on the chain from step 2. The entries will contain the content and metadata you want to store forever on the specified chain.  4. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9.1
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
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Sphereon.SDK.Blockchain.Easy.Model
{
    /// <summary>
    /// Backend
    /// </summary>
    [DataContract]
    public partial class Backend :  IEquatable<Backend>
    {
        /// <summary>
        /// Gets or Sets Implementation
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ImplementationEnum
        {
            
            /// <summary>
            /// Enum Bitcoin for "Bitcoin"
            /// </summary>
            [EnumMember(Value = "Bitcoin")]
            Bitcoin,
            
            /// <summary>
            /// Enum None for "None"
            /// </summary>
            [EnumMember(Value = "None")]
            None
        }

        /// <summary>
        /// Gets or Sets DataStructure
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DataStructureEnum
        {
            
            /// <summary>
            /// Enum Factom for "Factom"
            /// </summary>
            [EnumMember(Value = "Factom")]
            Factom,
            
            /// <summary>
            /// Enum Multichain for "Multichain"
            /// </summary>
            [EnumMember(Value = "Multichain")]
            Multichain
        }

        /// <summary>
        /// Gets or Sets Implementation
        /// </summary>
        [DataMember(Name="implementation", EmitDefaultValue=false)]
        public ImplementationEnum? Implementation { get; set; }
        /// <summary>
        /// Gets or Sets DataStructure
        /// </summary>
        [DataMember(Name="dataStructure", EmitDefaultValue=false)]
        public DataStructureEnum? DataStructure { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Backend" /> class.
        /// </summary>
        /// <param name="Owner">Owner.</param>
        /// <param name="RpcProviders">RpcProviders.</param>
        /// <param name="ApiVersion">ApiVersion.</param>
        /// <param name="LedgerName">LedgerName.</param>
        /// <param name="Implementation">Implementation.</param>
        /// <param name="Start">Start.</param>
        /// <param name="End">End.</param>
        /// <param name="DataStructure">DataStructure.</param>
        /// <param name="Id">Id.</param>
        public Backend(string Owner = null, List<RpcProvider> RpcProviders = null, int? ApiVersion = null, string LedgerName = null, ImplementationEnum? Implementation = null, DateTime? Start = null, DateTime? End = null, DataStructureEnum? DataStructure = null, string Id = null)
        {
            this.Owner = Owner;
            this.RpcProviders = RpcProviders;
            this.ApiVersion = ApiVersion;
            this.LedgerName = LedgerName;
            this.Implementation = Implementation;
            this.Start = Start;
            this.End = End;
            this.DataStructure = DataStructure;
            this.Id = Id;
        }
        
        /// <summary>
        /// Gets or Sets Owner
        /// </summary>
        [DataMember(Name="owner", EmitDefaultValue=false)]
        public string Owner { get; set; }
        /// <summary>
        /// Gets or Sets RpcProviders
        /// </summary>
        [DataMember(Name="rpcProviders", EmitDefaultValue=false)]
        public List<RpcProvider> RpcProviders { get; set; }
        /// <summary>
        /// Gets or Sets ApiVersion
        /// </summary>
        [DataMember(Name="apiVersion", EmitDefaultValue=false)]
        public int? ApiVersion { get; set; }
        /// <summary>
        /// Gets or Sets LedgerName
        /// </summary>
        [DataMember(Name="ledgerName", EmitDefaultValue=false)]
        public string LedgerName { get; set; }
        /// <summary>
        /// Gets or Sets Start
        /// </summary>
        [DataMember(Name="start", EmitDefaultValue=false)]
        public DateTime? Start { get; set; }
        /// <summary>
        /// Gets or Sets End
        /// </summary>
        [DataMember(Name="end", EmitDefaultValue=false)]
        public DateTime? End { get; set; }
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Backend {\n");
            sb.Append("  Owner: ").Append(Owner).Append("\n");
            sb.Append("  RpcProviders: ").Append(RpcProviders).Append("\n");
            sb.Append("  ApiVersion: ").Append(ApiVersion).Append("\n");
            sb.Append("  LedgerName: ").Append(LedgerName).Append("\n");
            sb.Append("  Implementation: ").Append(Implementation).Append("\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
            sb.Append("  DataStructure: ").Append(DataStructure).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as Backend);
        }

        /// <summary>
        /// Returns true if Backend instances are equal
        /// </summary>
        /// <param name="other">Instance of Backend to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Backend other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Owner == other.Owner ||
                    this.Owner != null &&
                    this.Owner.Equals(other.Owner)
                ) && 
                (
                    this.RpcProviders == other.RpcProviders ||
                    this.RpcProviders != null &&
                    this.RpcProviders.SequenceEqual(other.RpcProviders)
                ) && 
                (
                    this.ApiVersion == other.ApiVersion ||
                    this.ApiVersion != null &&
                    this.ApiVersion.Equals(other.ApiVersion)
                ) && 
                (
                    this.LedgerName == other.LedgerName ||
                    this.LedgerName != null &&
                    this.LedgerName.Equals(other.LedgerName)
                ) && 
                (
                    this.Implementation == other.Implementation ||
                    this.Implementation != null &&
                    this.Implementation.Equals(other.Implementation)
                ) && 
                (
                    this.Start == other.Start ||
                    this.Start != null &&
                    this.Start.Equals(other.Start)
                ) && 
                (
                    this.End == other.End ||
                    this.End != null &&
                    this.End.Equals(other.End)
                ) && 
                (
                    this.DataStructure == other.DataStructure ||
                    this.DataStructure != null &&
                    this.DataStructure.Equals(other.DataStructure)
                ) && 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.Owner != null)
                    hash = hash * 59 + this.Owner.GetHashCode();
                if (this.RpcProviders != null)
                    hash = hash * 59 + this.RpcProviders.GetHashCode();
                if (this.ApiVersion != null)
                    hash = hash * 59 + this.ApiVersion.GetHashCode();
                if (this.LedgerName != null)
                    hash = hash * 59 + this.LedgerName.GetHashCode();
                if (this.Implementation != null)
                    hash = hash * 59 + this.Implementation.GetHashCode();
                if (this.Start != null)
                    hash = hash * 59 + this.Start.GetHashCode();
                if (this.End != null)
                    hash = hash * 59 + this.End.GetHashCode();
                if (this.DataStructure != null)
                    hash = hash * 59 + this.DataStructure.GetHashCode();
                if (this.Id != null)
                    hash = hash * 59 + this.Id.GetHashCode();
                return hash;
            }
        }
    }

}