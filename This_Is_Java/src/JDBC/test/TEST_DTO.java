package JDBC.test;

public class TEST_DTO {
	
	private int testNum;
	private String testName;
	private String testTitle;
	private String testDate;
	
	public int getTestNum() {
		return testNum;
	}
	public void setTestNum(int testNum) {
		this.testNum = testNum;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestTitle() {
		return testTitle;
	}
	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}
	public String getTestDate() {
		return testDate;
	}
	public void setTestDate(String testDate) {
		this.testDate = testDate;
	}
	@Override
	public String toString() {
		return "TEST_DTO [testNum=" + testNum + ", testName=" + testName + ", testTitle=" + testTitle + ", testDate="
				+ testDate + "]";
	}
	
	
	
	
	
}
