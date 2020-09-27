import java.rmi.*;
import java.rmi.server.*;
public class CalcClient{

	public static void main(String[] args) throws Exception{
		/*
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = sn.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = sn.nextInt();
		CalcInterface A1 = (CalcInterface)Naming.lookup("CalGen");
		System.out.println("The sum is: " +A1.sum(num1,num2));
		System.out.println("The mul is: " +A1.mul(num1,num2));
		*/
		CalcInterface A1 = (CalcInterface)Naming.lookup("CalGen");
		System.out.println("The sum is: " +A1.sum(1,2));
		System.out.println("The mul is: " +A1.mul(1,2));
	}
}