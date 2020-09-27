import java.rmi.Naming;
public class AddServer{
	public static void main(String[] args) {
		try{
			Naming.rebind("doit",new Add("Hello,Suranga....✋"));
			System.out.println("Server is Connected..ready to operations...");

		}
		catch(Exception e){
			System.out.println("Server is not connected..." + e);
		}
	}
}