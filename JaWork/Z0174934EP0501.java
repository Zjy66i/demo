//author:张峻瑜
package JaWork;

public class Z0174934EP0501 {

	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time(555550000);

		System.out.println(time1.getHour() + "小时  " + time1.getMinute() + "分钟  " + time1.getSecond() + "秒  ");
		System.out.println(time2.getHour() + "小时  " + time2.getMinute() + "分钟  " + time2.getSecond() + "秒  ");

	}

}

class Time {
	private long hour;
	private long minute;
	private long second;

	Time() {
		long T = System.currentTimeMillis();
		this.setTime(T);
	}

	Time(long time) {
		this.setTime(time);
	}

	public void setTime(long elspseTime) {
		long totalMinutes = (elspseTime / 1000) / 60;
		long aSecond = (elspseTime / 1000) % 60;
		long aMinutes = totalMinutes % 60;
		long aHour = totalMinutes / 60;
		this.hour = aHour;
		this.minute = aMinutes;
		this.second = aSecond;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}
}
