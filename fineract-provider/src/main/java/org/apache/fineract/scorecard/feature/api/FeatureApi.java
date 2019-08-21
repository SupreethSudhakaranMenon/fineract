package org.apache.fineract.scorecard.feature.api;



import io.swagger.annotations.*;
import org.apache.fineract.scorecard.feature.data.SaveRequest;
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

@Api(value = "save", description = "the save API")
public interface FeatureApi {

    @ApiOperation(value = "feature controller", notes = "saves the feature values in db", response = SaveRequest.class, tags={ "feature-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully Saved the values.", response = SaveRequest.class),
        @ApiResponse(code = 400, message = "Bad Request", response = SaveRequest.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = SaveRequest.class),
        @ApiResponse(code = 405, message = "Method Not Allowed", response = SaveRequest.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = SaveRequest.class) })
    @RequestMapping(value = "/save",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<SaveRequest> saveFeatureUsingPOST(@ApiParam(value = "Save Feature request", required = true) @RequestBody SaveRequest saveFeatureRequest);

    @ApiOperation(value = "get all features from databases", notes = "get all fetures from database", response = SaveRequest.class, responseContainer = "List", tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = SaveRequest.class),
            @ApiResponse(code = 400, message = "Invalid status value", response = SaveRequest.class) })
    @RequestMapping(value = "/getallfeatures",
            method = RequestMethod.GET)
    ResponseEntity<List<SaveRequest>> getallfeaturesGet();
}
