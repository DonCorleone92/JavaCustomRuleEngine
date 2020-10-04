package com.business;

import com.business.dto.Payment;
import com.business.rules.Rule1;
import com.business.utility.Constants.NonPhysicalProductType;
import com.business.utility.Constants.PhysicalProductType;

public class RunnerClass {
	
	public static void main(String args[]) {
		 
		RuleEngine ruleEngine = new RuleEngine();
		ruleEngine
			.registerRule(new Rule1())
			.registerRule(new Rule1());
		
		Payment testPayment = new Payment(Boolean.TRUE, 
				PhysicalProductType.NA, 
				NonPhysicalProductType.NA);
		
		Payment result = ruleEngine.checkMyRule(testPayment);
				   
	}
}
