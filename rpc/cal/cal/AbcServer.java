import java.rmi.*;
import java.rmi.server.*;

public class AbcServer{
	public static void main(String[] args) throws RemoteException{
		Abc A2 = new Abc();
		try{
			Naming.rebind("CalGen",A2);
		}
		catch(Exception e){
			System.out.println("Server is Connected......😊");
		}
	}
}