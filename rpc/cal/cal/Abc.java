import java.rmi.*;
import java.rmi.server.*;

public class Abc extends UnicastRemoteObject implements AbcInterface{
	public Abc() throws RemoteException{}

	public int summ(int a,int b) throws RemoteException{
	System.out.println("Summerization for numbers" + a + "and" + b);
	return a + b;
	}

	public int divv(int a,int b) throws RuntimeException{
	System.out.println("Division for numbers" + a + "and" + b );
	return a + b;
	}
}