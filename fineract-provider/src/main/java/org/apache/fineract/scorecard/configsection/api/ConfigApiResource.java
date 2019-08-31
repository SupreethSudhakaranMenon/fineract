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


package org.apache.fineract.scorecard.configsection.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.fineract.scorecard.configsection.domain.ConfigEntity;
import org.apache.fineract.scorecard.configsection.model.ConfigSaveRequest;
import org.apache.fineract.scorecard.configsection.model.ErrorModel;
import org.apache.fineract.scorecard.configsection.service.ConfigureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Component
@Path("/config")
public class ConfigApiResource {

    @Autowired
    private ConfigureService configureService;



    public ConfigApiResource() {
    }

    public ConfigApiResource(ConfigureService configureService) {
        this.configureService = configureService;
    }
    @Path("/getAllConfig")
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @ApiOperation(value = "List all Configuration", notes = "")
    @ApiResponses({@ApiResponse(code = 200, message = "", response = ConfigSaveRequest.class, responseContainer = "list")})
    public List<ConfigSaveRequest> getAllConfigFunction()
    {

        List<ConfigEntity> lst = this.configureService.getAllConfigs();
        List<ConfigSaveRequest> lstOfResponse = new ArrayList<>();
        for(ConfigEntity fs:lst){
            ConfigSaveRequest fe = new ConfigSaveRequest( fs.getFeature(), fs.getProduct(),fs.getCategory(),fs.getWeightage(),fs.getGreenmax(),fs.getGreenmin(),fs.getRedmax(),fs.getRedmin(),fs.getAmbermax(),
                    fs.getAmbermin());
            lstOfResponse.add(fe);
        }
        return lstOfResponse;
    }

    @POST
    @Path("/saveConfig")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON })
    @ApiOperation(value = "configuration controller", notes = "saves the feature values in db", response = String.class, tags={ "feature-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully Saved the values.", response = String.class),
            @ApiResponse(code = 400, message = "Bad Request", response = ErrorModel.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class),
            @ApiResponse(code = 405, message = "Method Not Allowed", response = ErrorModel.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorModel.class) })
    public ResponseEntity<String> saveConfiguration(ConfigSaveRequest fs){
        ConfigEntity entity = new ConfigEntity(    fs.getFeature(), fs.getProduct(),fs.getCategory(),fs.getWeightage(),fs.getGreenmax(),fs.getGreenmin(),fs.getRedmax(),fs.getRedmin(),fs.getAmbermax(),
                fs.getAmbermin()
            );

        entity = this.configureService.createConfiguration(entity);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
