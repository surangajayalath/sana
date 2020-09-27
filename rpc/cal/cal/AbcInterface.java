import java.rmi.*;
public interface AbcInterface extends Remote{
	public int summ(int a , int b) throws RemoteException;
	public int divv(int a ,  int b)throws RemoteException;
}