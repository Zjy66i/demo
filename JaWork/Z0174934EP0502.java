//author:张峻瑜
package JaWork;

import java.util.Scanner;

public class Z0174934EP0502 {

	public static void main(String[] args) {
		System.out.print("请输入一个整数: ");
		int i = new Scanner(System.in).nextInt();
		StackOfInteger stack = new StackOfInteger();
		
		int prime = 1;
		while (i != 1) {
			prime = nextPrime(prime);
			while (i % prime == 0) {
				if (i % prime == 0) {
					stack.push(prime);
					i = i / prime;
				}
			}

		}
		System.out.print("它的所有素数因子为: ");
		stack.diplay();

	}

	public static int nextPrime(int num) {
		num++;
		while (isPrime(num) != true) {
			num++;
		}

		return num;
	}

	public static boolean isPrime(int num) {
		if (num == 1)
			return false;

		int max = (int) Math.sqrt(num);
		for (int i = 2; i <= max; i++)
			if (num % i == 0)
				return false;

		return true;

	}

}

class StackOfInteger {
	private Node top;

	public void push(Object x) {
		Node p = new Node(x);
		p.next = top;
		top = p;
	}

	public void diplay() {
		Node p = top;
		while (p != null) {
			System.out.print(p.data.toString() + " ");
			p = p.next;
		}
	}
}

