

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProChanger
{
    
    public static void main(String[] args) throws InterruptedException
    {	
        File file;
        File files;
        File filess;
    
    	try{
            
    		
                while(true){
                   file = new File("C:\\Users\\mert\\Downloads\\160201046-160201045.txt"); 
                   if(file.exists()){
                       Thread.sleep(1000);
                    file.delete();
                    break;
                }
                   else{
                       
                   }
                }
                
                
               
                files=new File("C:\\or\\160201046-160201045.txt"); //Tasinacak dosya
                while(true){
                    if(files.exists()){
                         files.renameTo(new File("C:\\Users\\mert\\Downloads\\160201046-160201045.txt"));
                Thread.sleep(1000);
                break;
                    }
                }
               
    		filess = new File("C:\\Users\\mert\\Downloads\\160201046-160201045.txt"); //Tarihi degisecek dosya
    		
    		//print the original last modified date
    		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                
    		
    		//set this date 
    		String newLastModified = "01/31/2000";
    		
    		//need convert the above date to milliseconds in long value 
    		Date newDate = sdf.parse(newLastModified);
    		filess.setLastModified(newDate.getTime());
    		
    		
    		
    	}catch(ParseException e){
    		
    		
    		
    	}
    	
    }
}