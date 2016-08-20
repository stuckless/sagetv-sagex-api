package org.jdna.sage.api.generator;

import java.util.HashMap;
import java.util.Map;

public class APIRules {
	public Map<String, APIRule> rules = new HashMap<String, APIRule>();
	
	public APIRules() {
		newRule("GetEpisodeNumber").renameTo("GetShowEpisodeNumber");
		newRule("GetSeasonNumber").renameTo("GetShowSeasonNumber");
		// sagetv 9 briefly changed to Object and caused some issues
		newRule("GetFavoritePerson").setReturnType("String");
	}
	
	public APIRule newRule(String api) {
		if (rules.containsKey(api)) {
			return rules.get(api);
		}
		
		APIRule rule = new APIRule(api);
		rules.put(api, rule);
		return rule;
	}
	
	public APIRule getRule(String api) {
		return rules.get(api);
	}
}
