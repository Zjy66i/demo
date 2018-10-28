
public class Watch {
	static long startTime;
	private long endTime;

	Watch() {
		startTime = 0;
		endTime = 0;
	}

	static void start() {
		java.util.Date date = new java.util.Date();
		startTime = date.getTime();
		System.out.println("比赛开始！");
	}

	public void  end() {
		java.util.Date date = new java.util.Date();
		endTime = date.getTime();	
	}

	public double getElapseTime() {

		return  ((this.endTime - startTime)/1000);

	}

}
