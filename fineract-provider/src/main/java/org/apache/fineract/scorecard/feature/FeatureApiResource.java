///**
// * Licensed to the Apache Software Foundation (ASF) under one
// * or more contributor license agreements. See the NOTICE file
// * distributed with this work for additional information
// * regarding copyright ownership. The ASF licenses this file
// * to you under the Apache License, Version 2.0 (the
// * "License"); you may not use this file except in compliance
// * with the License. You may obtain a copy of the License at
// *
// * http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing,
// * software distributed under the License is distributed on an
// * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// * KIND, either express or implied. See the License for the
// * specific language governing permissions and limitations
// * under the License.
// */
//
//package org.apache.fineract.scorecard.feature;
//
//import java.io.InputStream;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import javax.ws.rs.core.UriInfo;
//
//import io.swagger.annotations.*;
//import com.sun.jersey.core.header.FormDataContentDisposition;
//import com.sun.jersey.multipart.FormDataParam;
//import org.apache.commons.lang.StringUtils;
//import org.apache.fineract.commands.domain.CommandWrapper;
//import org.apache.fineract.commands.service.CommandWrapperBuilder;
//import org.apache.fineract.commands.service.PortfolioCommandSourceWritePlatformServiceImpl;
//import org.apache.fineract.commands.service.PortfolioCommandSourceWritePlatformService;
//import org.apache.fineract.infrastructure.core.api.ApiRequestParameterHelper;
//import org.apache.fineract.infrastructure.core.serialization.DefaultToApiJsonSerializer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//
//
//
//@Path("/feature")
//@Component
//@Scope("singleton")
//@Api (value = "Feature" , description = "This UI provides addition of new features")
//
//
//public class FeatureApiResource {
//    private static final Set<String> RESPONSE_DATA_PARAMETERS = new HashSet<>(Arrays.asList("id","feature", "value", "data", "category" ));
//
////    private final FeatureReadPlatformService featureReadPlatformService;
//    private final DefaultToApiJsonSerializer<Object> apiJsonSerializerService;
//    private final ApiRequestParameterHelper apiRequestParameterHelper;
//    private final PortfolioCommandSourceWritePlatformService commandSourceWritePlatformService;
//
//    @Autowired
//    public FeatureApiResource(
//            final DepfaultToApiJsonSerializer<Object> toApiJsonSerializer,
//            final ApiRequestParameterHelper apiRequestParameterHelper,
//            final PortfolioCommandSourceWritePlatformService commandsSourceWritePlatformService){
//        this.apiRequestParameterHelper = apiRequestParameterHelper;
//        this.commandSourceWritePlatformService = commandsSourceWritePlatformService;
//        this.apiJsonSerializerService = toApiJsonSerializerService;
//    }
//
//    @POST
//    @Consumes({ MediaType.APPLICATION_JSON })
//    @Produces({ MediaType.APPLICATION_JSON })
//    @ApiOperation(value = "Create Feature", notes = "feature")
//    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", value = "body", dataType = "body" , dataTypeClass = FeatureCommand.class)})
////    Here in @ApiImplicitParam dataTypeClass is missing do check JournalEntriesApiResource
//    @ApiResponses({@ApiResponse(code=200, message = "", response = FeatureApiResourceSwagger.PostFeatureResponse.class)})
//
//
//
//
//
//}
