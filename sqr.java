import java.util.Scanner;

public class sqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sqr;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: "+ "\n");
		num=sc.nextInt();
		sqr=num*num;
		System.out.println("Square of "+num+" is: "+sqr);
		
		float temp, sqrt;
		sqrt=num/2;
		temp=0;
		while (sqrt !=temp) {
			temp=sqrt;
			sqrt=(num/temp+temp)/2;
		}
		System.out.println("Square root of "+num+" is: "+sqrt);
	}

}
