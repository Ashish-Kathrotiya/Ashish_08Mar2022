package com.Ashish_09Mar2022.enumTypes;

public enum TestData {

	TEST_URL(0), PRODUCT_CATEGORY(1),SIZE(2),THREAD_COLOR(3),UPDATED_SIZE(4),UPDATED_THREAD_COLOR(5);

	TestData(int columnNumber) {
		columnNumber_ = columnNumber;
	}

	public int getColumnNumber() {
		return columnNumber_;
	}

	private final int columnNumber_;

}
