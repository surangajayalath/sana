import java.rmi.*;
import java.rmi.server.*;

public class Calc extends UnicastRemoteObject implements CalcInterface{
	public Calc() throws RemoteException{};

	public int sum(int a,int b) throws RemoteException{
		System.out.println("Summation for number " + a + " and " + b);
		return a + b;
	}

	public int mul(int a,int b) throws RemoteException{
		System.out.println("Summation for number " + a + " and " + b);
		return a * b;
	}
}