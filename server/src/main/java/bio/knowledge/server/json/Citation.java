package bio.knowledge.server.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import bio.knowledge.server.impl.Util;

/**
 * Contains citation data. Optionally contains citation text.
 * 
 * @author Meera Godden
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Citation extends IdentifiedObject {
	
	private String citationId;
	
	private List<Support> supports = new ArrayList<>();

	@JsonProperty("dc:identifier")
	public String getCitationId() {
		return citationId;
	}

	@JsonProperty("dc:identifier")
	public void setCitationId(String citationId) {
		this.citationId = citationId;
	}
	
	public List<Support> getSupports() {
		return supports;
	}
	
	public void addSupport(Support support) {
		supports.add(support);
	}
	
	public String getFullText() {
		List<String> texts = Util.map(Support::getText, supports);
		String text = String.join(" ", texts);
		return text;
	}

}
