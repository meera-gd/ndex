package bio.knowledge.server.model;

import java.util.Objects;
import bio.knowledge.server.model.ConceptsconceptIdDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-26T09:57:13.188-07:00")

public class InlineResponse2001   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("semanticGroup")
  private String semanticGroup = null;

  @JsonProperty("synonyms")
  private List<String> synonyms = new ArrayList<String>();

  @JsonProperty("definition")
  private String definition = null;

  @JsonProperty("details")
  private List<ConceptsconceptIdDetails> details = new ArrayList<ConceptsconceptIdDetails>();

  public InlineResponse2001 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * local object identifier for the concept in the specified knowledge source database 
   * @return id
  **/
  @ApiModelProperty(value = "local object identifier for the concept in the specified knowledge source database ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse2001 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * canonical human readable name of the concept 
   * @return name
  **/
  @ApiModelProperty(value = "canonical human readable name of the concept ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse2001 semanticGroup(String semanticGroup) {
    this.semanticGroup = semanticGroup;
    return this;
  }

   /**
   * concept semantic type 
   * @return semanticGroup
  **/
  @ApiModelProperty(value = "concept semantic type ")
  public String getSemanticGroup() {
    return semanticGroup;
  }

  public void setSemanticGroup(String semanticGroup) {
    this.semanticGroup = semanticGroup;
  }

  public InlineResponse2001 synonyms(List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  public InlineResponse2001 addSynonymsItem(String synonymsItem) {
    this.synonyms.add(synonymsItem);
    return this;
  }

   /**
   * list of synonyms for concept 
   * @return synonyms
  **/
  @ApiModelProperty(value = "list of synonyms for concept ")
  public List<String> getSynonyms() {
    return synonyms;
  }

  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }

  public InlineResponse2001 definition(String definition) {
    this.definition = definition;
    return this;
  }

   /**
   * concept definition 
   * @return definition
  **/
  @ApiModelProperty(value = "concept definition ")
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public InlineResponse2001 details(List<ConceptsconceptIdDetails> details) {
    this.details = details;
    return this;
  }

  public InlineResponse2001 addDetailsItem(ConceptsconceptIdDetails detailsItem) {
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<ConceptsconceptIdDetails> getDetails() {
    return details;
  }

  public void setDetails(List<ConceptsconceptIdDetails> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.id, inlineResponse2001.id) &&
        Objects.equals(this.name, inlineResponse2001.name) &&
        Objects.equals(this.semanticGroup, inlineResponse2001.semanticGroup) &&
        Objects.equals(this.synonyms, inlineResponse2001.synonyms) &&
        Objects.equals(this.definition, inlineResponse2001.definition) &&
        Objects.equals(this.details, inlineResponse2001.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, semanticGroup, synonyms, definition, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    semanticGroup: ").append(toIndentedString(semanticGroup)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

