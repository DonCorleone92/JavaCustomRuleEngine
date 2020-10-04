package com.business.unittest;

import org.junit.BeforeClass;
import org.junit.Test;

import com.business.RuleEngine;
import com.business.dto.Payment;
import com.business.rules.Rule1;
import com.business.utility.Constants.NonPhysicalProductType;
import com.business.utility.Constants.PhysicalProductType;

public class Rule1Test {
	
	    private static RuleEngine ruleEngine = new RuleEngine();	
	    @BeforeClass
	    public static void initializeRules()
	    {
	    	ruleEngine
			.registerRule(new Rule1<Payment, Payment>())
			.registerRule(new Rule1<Payment,Payment>());
	    }
	    
	    @Test
	    public void positiveTest() {
	        Payment testPayment = new Payment(Boolean.TRUE, 
					PhysicalProductType.NA, 
					NonPhysicalProductType.NA);
	        ruleEngine.checkMyRule(testPayment);
	    }
	    
	    @Test(expected = RuntimeException.class)
	    public void negativeTest() {
	        Payment testPayment = new Payment(Boolean.TRUE, 
					PhysicalProductType.NA, 
					NonPhysicalProductType.UpgradeMembership);
	        ruleEngine.checkMyRule(testPayment);
	    }
	}
