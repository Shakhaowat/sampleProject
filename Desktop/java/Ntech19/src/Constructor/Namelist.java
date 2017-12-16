package Constructor;

public class Namelist {
	
	private String last;
	private String first;
	private static int members=0;
	public Namelist(){}
	
	public Namelist(String ln,String fn){
		last=ln;
		first=fn;
		members++;
		
		
		System.out.println(last +" "+first+" "+members);
		
	}
	
	

}
