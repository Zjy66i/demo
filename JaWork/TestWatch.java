import java.util.Scanner;

public class TestWatch {
	public static void main(String[] args) {
		Watch t = new Watch();
		
		Scanner input = new Scanner(System.in);
		System.out.print("������1��ʾ������ʼ��");
		int i  = input.nextInt();		
		Watch.start();
		
		System.out.println("���˶�Աͨ���յ�ʱ����������ţ�1.Alice 2.Bob 3.Clair����");
		
		int x1 = input.nextInt();
		t.end();
		double t1 = t.getElapseTime();
		System.out.println("��ʱ: "+t1+"s");
		
		int x2 = input.nextInt();
		t.end();
		double t2 = t.getElapseTime();
		System.out.println("��ʱ: "+t2+"s");
		
		int x3 = input.nextInt();
		t.end();
		double t3 = t.getElapseTime();
		System.out.println("��ʱ: "+t3+"s");
		
		System.out.println("�����������������£�1.Alice 2.Bob 3.Clair����");
		System.out.println("��һ��Ϊ��"+x1+"  "+"��ʱ"+t1+"s");
		System.out.println("�ڶ���Ϊ��"+x2+"  "+"��ʱ"+t2+"s");
		System.out.println("������Ϊ��"+x3+"  "+"��ʱ"+t3+"s");
		
	}

}
