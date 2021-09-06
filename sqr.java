import java.util.Scanner;

public class sqr {

	public static void main(String[] args) {
		
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: "+ "\n");
		num=sc.nextInt();
		
//calculating square of the number
		int sqr;
		sqr=num*num;
		System.out.println("Square of "+num+" is: "+sqr);
		
//calculating square root of the number		
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
