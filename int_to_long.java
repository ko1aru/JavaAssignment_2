import java.util.Scanner;
public class int_to_long {

	public static void main(String[] args) {
		
		int intnum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a integer number: "+"\n");
		intnum = sc.nextInt();
		//int to long
		long longnum = intnum;
		System.out.println("After converting to long: "+longnum);
		System.out.println("Datatype: "+((Object)longnum).getClass().getSimpleName()+"\n");
		//long to float
		float floatnum=longnum;
		System.out.println("After converting to float: "+floatnum);
		System.out.println("Datatype: "+((Object)floatnum).getClass().getSimpleName());
	}

}
