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


package org.apache.fineract.scorecard.feature.api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.apache.fineract.scorecard.feature.domain.FeatureEntity;
import org.apache.fineract.scorecard.feature.model.ErrorModel;
import org.apache.fineract.scorecard.feature.model.FeatureSaveRequest;
import org.apache.fineract.scorecard.feature.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
@Component
@Path("/feature")
public class FeatureApiResource {

    @Autowired
    private  FeatureService featureService;


    public FeatureApiResource() {
    }

    public FeatureApiResource(FeatureService featureService) {
        this.featureService = featureService;
    }

    /**
     * Get a single record by Id
     */
    @POST
    @Path("/getByFeatureId")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON })
    @ApiOperation(value = "feature controller", notes = "saves the feature values in db", response = FeatureSaveRequest.class, tags={ "feature-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully Saved the values.", response = FeatureSaveRequest.class),
            @ApiResponse(code = 400, message = "Bad Request", response = ErrorModel.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class),
            @ApiResponse(code = 405, message = "Method Not Allowed", response = ErrorModel.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorModel.class) })
    public FeatureSaveRequest getByIdFunction(FeatureSaveRequest request)
    {
        FeatureEntity fe = this.featureService.getOneRecord(request.getId());
       return new FeatureSaveRequest(fe.getId(),fe.getFeature(), fe.getValue(), fe.getData(), fe.getCategory(),fe.getStatus());
    }

    /**
     * Used for getting all the details for the  Feature Screen
     * @return
     */

    @Path("/getAllFeatures")
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @ApiOperation(value = "List all Features", notes = "")
    @ApiResponses({@ApiResponse(code = 200, message = "", response = FeatureSaveRequest.class, responseContainer = "list")})
    public List<FeatureSaveRequest> getAllFeaturesFunction()
    {
        List<FeatureEntity> lst = this.featureService.getAllFeatures();
        List<FeatureSaveRequest> lstOfResponse = new ArrayList<>();
        for(FeatureEntity fe:lst){
            FeatureSaveRequest fs = new FeatureSaveRequest(fe.getId(),fe.getFeature(), fe.getValue(), fe.getData(), fe.getCategory(),fe.getStatus());
            lstOfResponse.add(fs);
        }
        return lstOfResponse;
    }

    /**
     * Used for saving details for the Feature Screen
     * @param request data for the fields
     * @return new ResponseEntity
     */


    @POST
    @Path("/saveFeature")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON })
    @ApiOperation(value = "feature controller", notes = "saves the feature values in db", response = String.class, tags={ "feature-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully Saved the values.", response = String.class),
            @ApiResponse(code = 400, message = "Bad Request", response = ErrorModel.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class),
            @ApiResponse(code = 405, message = "Method Not Allowed", response = ErrorModel.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorModel.class) })
    public ResponseEntity<String>  saveFeature(FeatureSaveRequest request){
        FeatureEntity entity = new FeatureEntity(request.getId(),request.getFeature(), request.getValueType(), request.getDataType(), request.getCategory(),request.getStatus());

        entity = this.featureService.createFeature(entity);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
