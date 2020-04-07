package chainOfResponsibiltiy;

public class Main {
	LeaveRequest lr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILeaveRequestHandler c1 = new Supervisor();
		ILeaveRequestHandler c2 = new ProjectManager();
		ILeaveRequestHandler c3 = new HR();
		
		c1.setHandler(c2);
		c2.setHandler(c3);
		
		c1.Handlerequest(new LeaveRequest("Suresh",1)); 
        c1.Handlerequest(new LeaveRequest("Ram",4)); 
        c1.Handlerequest(new LeaveRequest("Suresh",8));		
	}

}
