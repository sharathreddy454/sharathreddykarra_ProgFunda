package com.gradedproject.q1;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		return "Welcome to Admin Department";
	}
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}

}
