package com.business;

import com.business.dto.Payment;
import com.business.rules.Rule1;
import com.business.rules.Rule2;
import com.business.rules.Rule3;
import com.business.rules.Rule4;
import com.business.rules.Rule5;
import com.business.rules.Rule6;
import com.business.rules.Rule7;

public class RunnerClass {

	public static void main(String args[]) {

		RuleEngine ruleEngine = new RuleEngine();
		ruleEngine
				.registerRule(new Rule1<Payment, Payment>())
				.registerRule(new Rule2<Payment, Payment>())
				.registerRule(new Rule3<Payment, Payment>())
				.registerRule(new Rule4<Payment, Payment>())
				.registerRule(new Rule5<Payment, Payment>())
				.registerRule(new Rule6<Payment, Payment>())
				.registerRule(new Rule7<Payment, Payment>())
				;

	}
}
