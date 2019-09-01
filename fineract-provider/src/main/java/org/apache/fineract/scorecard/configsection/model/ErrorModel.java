package org.apache.fineract.scorecard.configsection.model;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Error Handling code for Configuration Screen.
 * Listed below properties can be used for Server Side Validation
 * For Client Side Validation :
 * It can be used as a response message on the frontend
 */

public class ErrorModel   {
    @JsonProperty("developerMessage")
    private String developerMessage = null;

    @JsonProperty("errorCode")
    private Integer errorCode = null;

    @JsonProperty("fault")
    private FaultModel fault = null;

    @JsonProperty("message")
    private String message = null;

    @JsonProperty("moreInfo")
    private String moreInfo = null;

    @JsonProperty("userMessage")
    private String userMessage = null;

    public ErrorModel developerMessage(String developerMessage) {
        this.developerMessage = developerMessage;
        return this;
    }

    /**
     * Get developerMessage
     * @return developerMessage
     **/
    @ApiModelProperty(value = "")
    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public ErrorModel errorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get errorCode
     * @return errorCode
     **/
    @ApiModelProperty(value = "")
    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorModel fault(FaultModel fault) {
        this.fault = fault;
        return this;
    }

    /**
     * Get fault
     * @return fault
     **/
    @ApiModelProperty(value = "")
    public FaultModel getFault() {
        return fault;
    }

    public void setFault(FaultModel fault) {
        this.fault = fault;
    }

    public ErrorModel message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     **/
    @ApiModelProperty(value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorModel moreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
        return this;
    }

    /**
     * Get moreInfo
     * @return moreInfo
     **/
    @ApiModelProperty(value = "")
    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public ErrorModel userMessage(String userMessage) {
        this.userMessage = userMessage;
        return this;
    }

    /**
     * Get userMessage
     * @return userMessage
     **/
    @ApiModelProperty(value = "")
    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorModel errorModel = (ErrorModel) o;
        return Objects.equals(this.developerMessage, errorModel.developerMessage) &&
                Objects.equals(this.errorCode, errorModel.errorCode) &&
                Objects.equals(this.fault, errorModel.fault) &&
                Objects.equals(this.message, errorModel.message) &&
                Objects.equals(this.moreInfo, errorModel.moreInfo) &&
                Objects.equals(this.userMessage, errorModel.userMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(developerMessage, errorCode, fault, message, moreInfo, userMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorModel {\n");

        sb.append("    developerMessage: ").append(toIndentedString(developerMessage)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    moreInfo: ").append(toIndentedString(moreInfo)).append("\n");
        sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
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
