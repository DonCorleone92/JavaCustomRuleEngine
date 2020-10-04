package com.business.rules;

import com.business.dto.DuplicatePackagingSlip;
import com.business.dto.Payment;
import com.business.utility.Constants.NonPhysicalProductType;
import com.business.utility.Constants.PhysicalProductType;

public class Rule2<I, O> implements BaseRuleInterface<Payment, Payment> {

	@Override
	public Payment transform(Payment input) {

		input.setProductType(Boolean.TRUE);
		input.setPhysicalProductType(PhysicalProductType.Book);
		input.setNonPhysicalProductType(NonPhysicalProductType.NA);
		new DuplicatePackagingSlip();
		return input;
	}

	@Override
	public boolean isCriteriaMatched(Payment input) {

		return ((input.getProductType() == true)
				&& input.getPhysicalProductType().equals(PhysicalProductType.Book)
				&& input.getNonPhysicalProductType().equals(NonPhysicalProductType.NA));
	}

}
