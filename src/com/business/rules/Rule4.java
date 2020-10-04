package com.business.rules;

import com.business.dto.ActivateMembershipUpgrade;
import com.business.dto.Payment;
import com.business.utility.Constants.NonPhysicalProductType;
import com.business.utility.Constants.PhysicalProductType;

public class Rule4<I, O> implements BaseRuleInterface<Payment, Payment> {

	@Override
	public Payment transform(Payment input) {

		input.setProductType(Boolean.FALSE);
		input.setPhysicalProductType(PhysicalProductType.NA);
		input.setNonPhysicalProductType(NonPhysicalProductType.UpgradeMembership);
		new ActivateMembershipUpgrade();
		return input;
	}

	@Override
	public boolean isCriteriaMatched(Payment input) {

		return ((input.getProductType() == false) && input.getPhysicalProductType().equals(PhysicalProductType.NA)
				&& input.getNonPhysicalProductType().equals(NonPhysicalProductType.UpgradeMembership));
	}

}
