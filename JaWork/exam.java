package demo;

import java.util.*;
public class exam {

	public static void main(String[] args) {
	//loop1();
	//loop2();
    loop3();
    //loop4();

	}

	public static void loop4() {
		Scanner input =  new Scanner(System.in);
		System.out.print("请输入解密的密码: ");
		String s = input.nextLine();
		s = bianMa(s);
		s= jingXiang(s);
		System.out.print("解密后的语句为: "+s);
	}

	public static void loop3() {
		Scanner input =  new Scanner(System.in);
		System.out.print("请输入加密的语句: ");
		String s = input.nextLine();
		s = jingXiang(s);
		s = bianMa(s);
		System.out.print("加密后的语句为: "+s);
		System.out.println("");
		}


	public static String bianMa(String b) {
		String n = "";
		for (int x = 0;x<b.length();x++) {
			n+=(char)((int)('z')+(int)('a')-(int)(b.charAt(x)));
		}
		
		return n;
	}

	public static String jingXiang(String a) {
		StringBuffer n = new StringBuffer(a);
		n.reverse();
		//String n = "";
		//1StringBuffer n = new StringBuffer();
		//for (int x = (a.length()-1);x>=0;x--){
			//4n=n.concat(String.valueOf(a.charAt(x)));
			//3n+=a.charAt(x);						
			//2n+=a.charAt(a.length()-(x+1));		
			//1n.append(a.charAt(a.length()-(x+1)));
	    // }
		String y = n.toString();
		return y;
	}

	private static void loop2() {
		long a = 50;
		long x = fibonacciRecursion(a);
		System.out.print("任务二：使用递归求出斐波那契数列的第50项是: "+x);
	}

	private static long fibonacciRecursion(long a) {
		if(a == 1){
			return 0;
		}
		if(a == 2){
			return 1;
		}
		return fibonacciRecursion(a-1)+fibonacciRecursion(a-2);
	}

	private static void loop1() {
		long a = 50;
		long x = fibonacciLoop(a);
		System.out.print("任务一：使用循环求出斐波那契数列的第50项是: "+x);
		System.out.println(" ");
	}

	private static long fibonacciLoop(long n) {
		long num1 = 0;
		long num2 = 1;
		long y = 0;
		for(int m = 1;m<=n-2;m++){
			 y = num1+num2;
			 num1 = num2;
			 num2 = y;
		}
		return y ;
	}

	
		
	

}
