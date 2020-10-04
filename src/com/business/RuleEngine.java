package com.business;

import java.util.ArrayList;
import java.util.List;

import com.business.dto.Payment;
import com.business.rules.BaseRuleInterface;

public class RuleEngine {

	List<BaseRuleInterface<Payment, Payment>> rules;

	public RuleEngine() {
		rules = new ArrayList<>();
	}

	public RuleEngine registerRule(BaseRuleInterface<Payment, Payment> rule) {
		rules.add(rule);
		return this;
	}

	public Payment checkMyRule(Payment input) {

		return rules
				.stream()
				.filter(myrule -> myrule.isCriteriaMatched(input))
				.map(myrule -> myrule.transform(input))
				.findAny().orElseThrow(() -> new RuntimeException("No Matching rule found"));
	}

}
