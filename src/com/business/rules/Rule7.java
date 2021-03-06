package com.business.rules;

import com.business.dto.GenerateCommision;
import com.business.dto.Payment;
import com.business.utility.Constants.NonPhysicalProductType;
import com.business.utility.Constants.PhysicalProductType;

public class Rule7<I, O> implements BaseRuleInterface<Payment, Payment> {

	@Override
	public Payment transform(Payment input) {

		input.setProductType(Boolean.TRUE);
		input.setNonPhysicalProductType(NonPhysicalProductType.NA);
		new GenerateCommision();
		return input;
	}

	@Override
	public boolean isCriteriaMatched(Payment input) {

		return ((input.getProductType() == true)
				&& (input.getPhysicalProductType().equals(PhysicalProductType.Book)
						|| input.getPhysicalProductType().equals(PhysicalProductType.NA))
				&& input.getNonPhysicalProductType().equals(NonPhysicalProductType.NA));
	}

}
