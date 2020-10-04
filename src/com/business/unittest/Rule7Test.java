package com.business.unittest;

import org.junit.BeforeClass;
import org.junit.Test;

import com.business.RuleEngine;
import com.business.dto.Payment;
import com.business.rules.Rule1;
import com.business.rules.Rule2;
import com.business.rules.Rule3;
import com.business.rules.Rule4;
import com.business.rules.Rule5;
import com.business.rules.Rule6;
import com.business.rules.Rule7;
import com.business.utility.Constants.NonPhysicalProductType;
import com.business.utility.Constants.PhysicalProductType;

public class Rule7Test {

	private static RuleEngine ruleEngine = new RuleEngine();

	@BeforeClass
	public static void initializeRules() {
		ruleEngine.registerRule(new Rule1<Payment, Payment>()).registerRule(new Rule2<Payment, Payment>())
				.registerRule(new Rule3<Payment, Payment>()).registerRule(new Rule4<Payment, Payment>())
				.registerRule(new Rule5<Payment, Payment>()).registerRule(new Rule6<Payment, Payment>())
				.registerRule(new Rule7<Payment, Payment>());
	}

	@Test
	public void positiveTest1() {
		Payment testPayment = new Payment(Boolean.TRUE, PhysicalProductType.NA, NonPhysicalProductType.NA);
		ruleEngine.checkMyRule(testPayment);
	}

	@Test
	public void positiveTest2() {
		Payment testPayment = new Payment(Boolean.TRUE, PhysicalProductType.Book, NonPhysicalProductType.NA);
		ruleEngine.checkMyRule(testPayment);
	}

	@Test(expected = RuntimeException.class)
	public void negativeTestProductTypeIsFalse1() {
		Payment testPayment = new Payment(Boolean.FALSE, PhysicalProductType.NA, NonPhysicalProductType.NA);
		ruleEngine.checkMyRule(testPayment);
	}

	@Test(expected = RuntimeException.class)
	public void negativeTestProductTypeIsFalse2() {
		Payment testPayment = new Payment(Boolean.FALSE, PhysicalProductType.Book, NonPhysicalProductType.NA);
		ruleEngine.checkMyRule(testPayment);
	}

	@Test(expected = RuntimeException.class)
	public void negativeTestPhysicalProductTypeIsFalse1() {
		Payment testPayment = new Payment(Boolean.TRUE, PhysicalProductType.NonBook, NonPhysicalProductType.NA);
		ruleEngine.checkMyRule(testPayment);
	}

	@Test(expected = RuntimeException.class)
	public void negativeTestPhysicalProductTypeIsFalse2() {
		Payment testPayment = new Payment(Boolean.TRUE, PhysicalProductType.NonBook, NonPhysicalProductType.NA);
		ruleEngine.checkMyRule(testPayment);
	}

	@Test(expected = RuntimeException.class)
	public void negativeTestNonPhysicalProductTypeIsFalse() {
		Payment testPayment = new Payment(Boolean.TRUE, PhysicalProductType.NA,
				NonPhysicalProductType.UpgradeMembership);
		ruleEngine.checkMyRule(testPayment);
	}

}
