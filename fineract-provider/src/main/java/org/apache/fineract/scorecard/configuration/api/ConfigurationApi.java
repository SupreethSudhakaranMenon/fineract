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




package org.apache.fineract.scorecard.configuration.api;



import io.swagger.annotations.*;
import org.apache.fineract.scorecard.configuration.data.SaveRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-20T18:36:28.410+05:30")

@Api(value="save",description = "the save API")
public interface ConfigurationApi {


    @ApiOperation(value = "configuration controller", notes = "save the configuration values in db", response = SaveRequest.class, tags={ "configuration-controller" ,})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully saved the values.", response = SaveRequest.class),
            @ApiResponse(code = 200, message = "Bad Request", response = SaveRequest.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = SaveRequest.class),
            @ApiResponse(code = 405, message = "Method Not Allowed", response = SaveRequest.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = SaveRequest.class) })
    @RequestMapping(value = "/save",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<SaveRequest> saveConfigurationUsingPOST(@ApiParam(value = "Save Configuration request", required = true) @RequestBody SaveRequest saveConfigurationRequest);

    @ApiOperation(value = "get all configurations from databases", notes = "get all configurations from database", response = SaveRequest.class, responseContainer = "List", tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = SaveRequest.class),
            @ApiResponse(code = 400, message = "Invalid status value", response = SaveRequest.class) })
    @RequestMapping(value = "/getallconfigurations",
            method = RequestMethod.GET)
    ResponseEntity<List<SaveRequest>> getallconfigurationsGet();
}

