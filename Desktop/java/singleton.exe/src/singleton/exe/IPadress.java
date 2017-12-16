package singleton.exe;

public class IPadress {
	
	private static IPadress instance =new IPadress();
	
	private IPadress(){}
	
	public static IPadress getIP(){
		
		
		return instance;
		
	}	
	public void ConnectIP(){
		
		
		System.out.println("Please wait a few minutes to get respond");
		
		
		
		
	}
	

}
