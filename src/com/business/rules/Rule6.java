package com.business.rules;

import com.business.dto.FirstAidVideo;
import com.business.dto.Payment;
import com.business.utility.Constants.NonPhysicalProductType;
import com.business.utility.Constants.PhysicalProductType;

public class Rule6<I, O> implements BaseRuleInterface<Payment, Payment> {

	@Override
	public Payment transform(Payment input) {

		input.setProductType(Boolean.FALSE);
		input.setPhysicalProductType(PhysicalProductType.NA);
		input.setNonPhysicalProductType(NonPhysicalProductType.videoSki);
		new FirstAidVideo();
		return input;
	}

	@Override
	public boolean isCriteriaMatched(Payment input) {

		return ((input.getProductType() == false) && input.getPhysicalProductType().equals(PhysicalProductType.NA)
				&& input.getNonPhysicalProductType().equals(NonPhysicalProductType.videoSki));
	}

}
