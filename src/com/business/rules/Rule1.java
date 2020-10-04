package com.business.rules;

import com.business.dto.Payment;
import com.business.utility.Constants.NonPhysicalProductType;
import com.business.utility.Constants.PhysicalProductType;
import com.business.dto.PackagingSlipForShipping;

public class Rule1<I, O> implements BaseRuleInterface<Payment, Payment> {

	@Override
	public Payment transform(Payment input) {

		input.setProductType(Boolean.TRUE);
		input.setPhysicalProductType(PhysicalProductType.NA);
		input.setNonPhysicalProductType(NonPhysicalProductType.NA);
		new PackagingSlipForShipping();
		return input;
	}

	@Override
	public boolean isCriteriaMatched(Payment input) {
		return ((input.getProductType() == true) && input.getPhysicalProductType().equals(PhysicalProductType.NA)
				&& input.getNonPhysicalProductType().equals(NonPhysicalProductType.NA));
	}

}
