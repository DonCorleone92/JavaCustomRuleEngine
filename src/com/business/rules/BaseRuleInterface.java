package com.business.rules;

public interface BaseRuleInterface<I, O> {

	public O transform(I input);

	public boolean isCriteriaMatched(I input);
}
