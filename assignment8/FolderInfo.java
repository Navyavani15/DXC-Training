package assignment_8;

import java.io.File;
import java.util.Scanner;

public class FolderInfo {

	
		      void printDirectory(String folderPath)
		      {  
		    	  File folder=new File(folderPath);
		    	  File[] files1 = folder.listFiles();  
		      if(folder.exists())
		      {
		      System.out.println("Details of files in the given folder  :");
		      for(File file : files1) 
		      {
		        if(file.isFile())
		        {
		          System.out.println("File  : "+file.getName());
		          System.out.println("Absolute File path : "+file.getAbsolutePath());
		          System.out.println("Folder Path : "+file.getParent());
		          System.out.println();
		        }
		       
		    }
		      
		      System.out.println("Details of sub folder in the given folder : ");
		      
		      for(File f : files1)
		      {
		       if(f.isDirectory())
		      {
		    	  System.out.println("Directory : "+f.getName());
		    	  System.out.println("Path : "+f.getParent()); 
		      }
		      }
		      }
		      else
		      {
		    	  System.out.println("No Folder exists with the given name");
		      }
	}
		      public static void main(String[] args) {
		  		// TODO Auto-generated method stub
		    	  Scanner sc=new Scanner(System.in); 
		    	  FolderInfo f=new FolderInfo();
		    	  System.out.println("Enter folder path :");
		    	 String folderPath=sc.next();
		  		   f.printDirectory(folderPath);
		  		   sc.close();
		  		     
		      }   

}
