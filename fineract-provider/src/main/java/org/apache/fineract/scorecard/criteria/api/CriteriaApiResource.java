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


package org.apache.fineract.scorecard.criteria.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.fineract.scorecard.criteria.domain.CriteriaEntity;
import org.apache.fineract.scorecard.criteria.model.CriteriaSaveRequest;
import org.apache.fineract.scorecard.criteria.model.ErrorModel;
import org.apache.fineract.scorecard.criteria.service.CriteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Component
@Path("/criteria")
public class CriteriaApiResource {

    @Autowired
    private CriteriaService criteriaService;



    public CriteriaApiResource() {
    }

    public CriteriaApiResource(CriteriaService criteriaService) {
        this.criteriaService = criteriaService;
    }

    /**
     * Used for getting all the details for the Criteria Screen
     * @return
     */

    @Path("/getAllCriterias")
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @ApiOperation(value = "List all Features", notes = "")
    @ApiResponses({@ApiResponse(code = 200, message = "", response = CriteriaSaveRequest.class, responseContainer = "list")})
    public List<CriteriaSaveRequest> getAllFeaturesFunction()
    {
        List<CriteriaEntity> lst = this.criteriaService.getAllCriterias();
        List<CriteriaSaveRequest> lstOfResponse = new ArrayList<>();
        for(CriteriaEntity fe:lst){
            CriteriaSaveRequest fs = new CriteriaSaveRequest(fe.getId(),fe.getFeature(), fe.getKeyvalue(), fe.getSqlapi(), fe.getCategory(),fe.getProduct(), fe.getDatasource());
            lstOfResponse.add(fs);
        }
        return lstOfResponse;
    }

    /**
     * Used for saving details for the Criteria Screen
     * @param request data for the fields
     * @return new ResponseEntity
     */

    @POST
    @Path("/saveCriteria")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON })
    @ApiOperation(value = "feature controller", notes = "saves the feature values in db", response = String.class, tags={ "feature-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully Saved the values.", response = String.class),
            @ApiResponse(code = 400, message = "Bad Request", response = ErrorModel.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class),
            @ApiResponse(code = 405, message = "Method Not Allowed", response = ErrorModel.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorModel.class) })
    public ResponseEntity<String> saveFeature(CriteriaSaveRequest request){
        CriteriaEntity entity = new CriteriaEntity(request.getFeature(), request.getKeyvalue(), request.getSqlapi(), request.getCategory(), request.getProduct(), request.getDatasource());

        entity = this.criteriaService.createCriteria(entity);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
