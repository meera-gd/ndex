package bio.knowledge.server.api;

import bio.knowledge.server.impl.ControllerImpl;
import bio.knowledge.server.model.InlineResponse2001;
import bio.knowledge.server.model.InlineResponse2002;

import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-26T09:57:13.188-07:00")

@Controller
public class ConceptsApiController implements ConceptsApi {

	@Autowired ControllerImpl ctrl;

    public ResponseEntity<List<InlineResponse2001>> getConceptDetails(@ApiParam(value = "(url-encoded) CURIE identifier of concept of interest",required=true ) @PathVariable("conceptId") String conceptId) {
        // do some magic!
        return ctrl.getConceptDetails(conceptId);
    }

    public ResponseEntity<List<InlineResponse2002>> getConcepts( @NotNull @ApiParam(value = "a (urlencoded) space delimited set of keywords or substrings against which to match concept names and synonyms", required = true) @RequestParam(value = "keywords", required = true) String keywords,
         @ApiParam(value = "a (url-encoded) space-delimited set of semantic groups (specified as codes CHEM, GENE, ANAT, etc.) to which to constrain concepts matched by the main keyword search (see [SemGroups](https://metamap.nlm.nih.gov/Docs/SemGroups_2013.txt) for the full list of codes) ") @RequestParam(value = "semgroups", required = false) String semgroups,
         @ApiParam(value = "(1-based) number of the page to be returned in a paged set of query results ") @RequestParam(value = "pageNumber", required = false) Integer pageNumber,
         @ApiParam(value = "number of concepts per page to be returned in a paged set of query results ") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        // do some magic!
        return ctrl.getConcepts(keywords, semgroups, pageNumber, pageSize);
    }

}
