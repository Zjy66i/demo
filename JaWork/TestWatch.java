import java.util.Scanner;

public class TestWatch {
	public static void main(String[] args) {
		Watch t = new Watch();
		
		Scanner input = new Scanner(System.in);
		System.out.print("请输入1表示比赛开始：");
		int i  = input.nextInt();		
		Watch.start();
		
		System.out.println("当运动员通过终点时输入他的序号（1.Alice 2.Bob 3.Clair）：");
		
		int x1 = input.nextInt();
		t.end();
		double t1 = t.getElapseTime();
		System.out.println("用时: "+t1+"s");
		
		int x2 = input.nextInt();
		t.end();
		double t2 = t.getElapseTime();
		System.out.println("用时: "+t2+"s");
		
		int x3 = input.nextInt();
		t.end();
		double t3 = t.getElapseTime();
		System.out.println("用时: "+t3+"s");
		
		System.out.println("比赛结束，名次如下（1.Alice 2.Bob 3.Clair）：");
		System.out.println("第一名为；"+x1+"  "+"用时"+t1+"s");
		System.out.println("第二名为；"+x2+"  "+"用时"+t2+"s");
		System.out.println("第三名为；"+x3+"  "+"用时"+t3+"s");
		
	}

}
