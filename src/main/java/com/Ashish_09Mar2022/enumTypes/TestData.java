package com.Ashish_09Mar2022.enumTypes;

public enum TestData {

	TEST_URL(0), PRODUCT_CATEGORY(1);

	TestData(int columnNumber) {
		columnNumber_ = columnNumber;
	}

	public int getColumnNumber() {
		return columnNumber_;
	}

	private final int columnNumber_;

}
