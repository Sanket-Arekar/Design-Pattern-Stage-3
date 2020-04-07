package chainOfResponsibiltiy;

public class LeaveRequest {
	String Employee_name;
	int LeaveDays;
	
	public LeaveRequest(String employee_name, int leaveDays) {
		super();
		Employee_name = employee_name;
		LeaveDays = leaveDays;
	}

	public String getEmployee_name() {
		return Employee_name;
	}

	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}

	public int getLeaveDays() {
		return LeaveDays;
	}

	public void setLeaveDays(int leaveDays) {
		LeaveDays = leaveDays;
	}
}
