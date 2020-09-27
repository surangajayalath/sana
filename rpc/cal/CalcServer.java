import java.rmi.*;
import java.rmi.server.*;

public class CalcServer{
	public static void main(String[] args)  throws RemoteException{
		Calc A2 = new Calc();
		try{
			Naming.rebind("CalGen",A2);
		}
		catch(Exception e){}
		System.out.println("Server Started....😊😊😊");
	}
}