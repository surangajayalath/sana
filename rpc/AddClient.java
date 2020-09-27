import java.rmi.Naming;
import java.util.Scanner;
public class AddClient{
	public static void main(String[] args) {
		try{
			AddInterface Add = (AddInterface)Naming.lookup("doit");
			System.out.println("Answer is: " + Add.AD());
		}
		catch(Exception e){
			System.out.println("AddClient Exception:" + e);
		}
	}
}