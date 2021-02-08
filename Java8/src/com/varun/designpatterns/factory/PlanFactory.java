package com.varun.designpatterns.factory;

import java.util.HashMap;
import java.util.Map;

public class PlanFactory {
	private static Map<String, Plan> planMap = new HashMap<String, Plan>();
	
	static {
		planMap.put("International", new InternationalPlan());
		planMap.put("Domestic", new DomesticPlan());
		planMap.put("Institutional", new InstitutionalPlan());
	}
	
	public Plan getPlan(String planType) {
		if (planType.equalsIgnoreCase("International")) {
			return new InternationalPlan();
		}else if (planType.equalsIgnoreCase("Domestic")) {
			return new DomesticPlan();
		}else {
			return new InstitutionalPlan();
		}
	}
}
