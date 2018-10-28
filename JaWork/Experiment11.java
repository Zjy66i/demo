package demo;
import java.util.*;
public class Experiment11 {

	public static void main(String[] args) {
	//loop1();
	//loop2();
   //loop3();
    //loop4();
    //loop5();
   loop6();
	}

	private static void loop6() {	  
	  
	  for(int i = 100;i<=100;i++) {
		  double y = count(1,i);
		  System.out.println("i= "+i +" "+ "y= "+ y);
	     }
   }
	  
	private static double count(int a,int b) {
		double y = 0;
		if(a==b) 
			y = 1.0 / b;
		else
			y = 1.0/(a+count(a+1,b));	
		return y;
	}

	private static void loop5() {
	int r = 10;
	int s = r*r;
	
	for(int i = r;i>=-r;i--) {
		for(int j = -r;j<=r;j++) {
			if(s<=Math.pow(r-Math.abs(i),2)+Math.pow(r-Math.abs(j),2))
			System.out.printf("* ");
			else 
				System.out.print(" ");		        				
		    }
		System.out.println();
	  }		
	}

	private static void loop4() {
	int i = 1;
	int j = 1;
	System.out.print(j+" "+i+" ");
	for(int n=1;n<=18;n++) {
		int num = i+j;
		System.out.print(num+" ");
		i = j;
		j = num;		
	}
	System.out.println();
	}

	private static void loop3() {
	Scanner input = new Scanner(System.in);
	System.out.print("请输入金字塔的行数: ");
	int i = input.nextInt();
	int n,j,k,p; 
	
	for(n = 1;n<=i;n++) {
		
		for(j = 0;j<i-n+5;j++) {
			System.out.print(" ");										
		}
		for(k=0;k<n;k++) {
			System.out.print(i-k-j+5);			
		  }
		for(p=n-1;p>0;p--) {
			System.out.print(n+1-p);
		}
		System.out.println(" ");
		}
	  }


	private static void loop2() {
		
	for (int i = 0;i<=100;i++) {
		if ((i%5==0||i%6==0)&&i%30!=0){
			System.out.print(i+" ");
		}		
	  }	
	System.out.println(" ");
	}

	private static void loop1() {
    int i = 0;
    int n = 1;
    while(n<=10) {
    	if((i%5==0||i%6==0)&&i%30!=0) {
    		n++;
    		System.out.print(i+" ");
    	}
    	i++;
    }
    System.out.println(" ");		
	}

}
