import java.rmi.Naming;
public class HelloServer{
	public static void main(String[] args) {
		try{
			Naming.rebind("Hello",new Hello("Hello,Welcome to RMI..."));
			System.out.println("Server is Connected Ready for Operation...");
		}
		catch(Exception e){
			System.out.println("Server not Connected" + e);
		}
	}
}