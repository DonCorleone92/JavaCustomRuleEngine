package com.business;

import com.business.dto.Payment;
import com.business.rules.Rule1;

public class RunnerClass {

	public static void main(String args[]) {

		RuleEngine ruleEngine = new RuleEngine();
		ruleEngine
				.registerRule(new Rule1<Payment, Payment>())
				.registerRule(new Rule1<Payment, Payment>());

	}
}
