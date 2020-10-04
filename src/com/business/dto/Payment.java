package com.business.dto;

import com.business.utility.Constants.NonPhysicalProductType;
import com.business.utility.Constants.PhysicalProductType;

public class Payment {

	private boolean isproductTypePhysical;
	private PhysicalProductType physicalProductType;
	private NonPhysicalProductType nonPhysicalProductType;

	public Payment(boolean isproductTypePhysical, PhysicalProductType physicalProductType,
			NonPhysicalProductType nonPhysicalProductType) {
		this.isproductTypePhysical = isproductTypePhysical;
		this.physicalProductType = physicalProductType;
		this.nonPhysicalProductType = nonPhysicalProductType;
	}

	public boolean getProductType() {
		return isproductTypePhysical;
	}

	public void setProductType(boolean isproductTypePhysical) {
		this.isproductTypePhysical = isproductTypePhysical;
	}

	public PhysicalProductType getPhysicalProductType() {
		return physicalProductType;
	}

	public void setPhysicalProductType(PhysicalProductType physicalProductType) {
		this.physicalProductType = physicalProductType;
	}

	public NonPhysicalProductType getNonPhysicalProductType() {
		return nonPhysicalProductType;
	}

	public void setNonPhysicalProductType(NonPhysicalProductType nonPhysicalProductType) {
		this.nonPhysicalProductType = nonPhysicalProductType;
	}

}
