package com.business.rules;

import com.business.dto.Payment;
import com.business.dto.TriggerEmail;
import com.business.utility.Constants.NonPhysicalProductType;
import com.business.utility.Constants.PhysicalProductType;

public class Rule5<I, O> implements BaseRuleInterface<Payment, Payment> {

	@Override
	public Payment transform(Payment input) {

		input.setProductType(Boolean.FALSE);
		input.setPhysicalProductType(PhysicalProductType.NA);
		new TriggerEmail();
		return input;
	}

	@Override
	public boolean isCriteriaMatched(Payment input) {

		return ((input.getProductType() == false) && input.getPhysicalProductType().equals(PhysicalProductType.NA)
				&& (input.getNonPhysicalProductType().equals(NonPhysicalProductType.UpgradeMembership)
						|| input.getNonPhysicalProductType().equals(NonPhysicalProductType.Membership)));
	}

}
