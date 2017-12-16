package ReadText;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadingFile {

	
	public static void main(String[] args) throws IOException {
		String path="C:\\SELENIUM\\TestFile.exe";
		
	    FileReader fr=null;
	    BufferedReader br=null;
	    fr=new FileReader(path);
	    br=new BufferedReader(fr);
	    String text="";
		
	    while((text=br.readLine())!=null){
	    	System.out.println(text);
	    }
	    
		br.close();
		fr.close();
		
		
		

	}

}
