
public class SotpWatch {
	private long startTime;
	private long endTime;
	
	public SotpWatch(){
		startTime = 0;
		endTime = 0;
	}
	
	public long start(){
		java.util.Date date = new java.util.Date();
		startTime = date.getTime();
		return startTime;
		
	}
	public long stop() {
		java.util.Date date = new java.util.Date();
		endTime = date.getTime();
		return endTime;
		
	}
	public int getElapseTime() {
		
		return (int) (this.endTime - this.startTime);
		
	}
	

}
