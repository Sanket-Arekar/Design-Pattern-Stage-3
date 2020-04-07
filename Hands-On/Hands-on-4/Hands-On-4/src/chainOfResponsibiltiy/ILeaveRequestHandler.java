package chainOfResponsibiltiy;

public interface ILeaveRequestHandler {
	 public abstract void setHandler(ILeaveRequestHandler nextInChain); 
	 public abstract void Handlerequest(LeaveRequest request); 
}
