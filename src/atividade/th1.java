package atividade;

import java.io.File;

public class th1 extends Thread {

	@Override
	public void run(){
		
		while(true) {
	        File directory = new File("C:\\Users\\20201134040016\\Desktop\\teste");
	  	  
	        if (directory.isDirectory()) {
	            
	            String arr[] = directory.list();
	  
	            if (arr.length > 0) {
	                System.out.println("The directory "
	                                   + directory.getPath()
	                                   + " is not Empty!");
	                System.out.println("A pasta tem " + arr.length + " arquivos no total");
	            }
	            else {
	                System.out.println("The directory "
	                                   + directory.getPath()
	                                   + " is Empty!");
	            }
	        }
		}
	}

}
