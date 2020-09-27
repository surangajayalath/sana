import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;
public class AddClient{

	public static void main(String[] args) throws Exception{
		//Scanner sn = new Scanner(System.in);
		//System.out.println("Enter First Number: ");
		//int num1 = sn.nextInt();
		//System.out.println("Enter Second Number: ");
		//int num2 = sn.nextInt();

		AbcInterface A1 = (AbcInterface)Naming.lookup("CalGen");
		System.out.println("The sum is: " +A1.summ(1,2));
		System.out.println("The div is: " +A1.divv(2,3));
	}
}