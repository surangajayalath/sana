import java.rmi.*;
public interface CalcInterface extends Remote{
	public int sum(int a,int b) throws RemoteException;
	public int mul(int a,int b) throws RemoteException;
}