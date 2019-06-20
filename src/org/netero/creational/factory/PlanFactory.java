package org.netero.creational.factory;

public class PlanFactory {
	public Plan getPlan(String planType) {
		switch(planType) {
			case "DOMESTICPLAN":
				return new DomesticPlan();
			case "COMMERCIALPLAN":
				return new CommercialPlan();
			case "INSTITUTIONALPLAN":
				return new InstitutionalPlan();
			default:
				return null;
		}
	}
}
