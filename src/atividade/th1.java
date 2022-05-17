package atividade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class th1 extends Thread {

	@Override
	public void run(){
		
		
		try {
		while(true) {
			
	        File diretorio = new File("E:\\Documentos\\TADS-IFRN2020.1\\SISTEMAS DISTRIBUIDOS\\Pasta01");
	  	    File diretorio2 = new File("E:\\Documentos\\TADS-IFRN2020.1\\SISTEMAS DISTRIBUIDOS\\Pasta02");
	        if (diretorio.isDirectory()) {
	            
	            String arr[] = diretorio.list();
	  
	            if (arr.length > 0) {
	            	for (int i=0; i<arr.length; i++) {
	                    File arquivo = new File("E:\\\\\\\\Documentos\\\\\\\\TADS-IFRN2020.1\\\\\\\\SISTEMAS DISTRIBUIDOS\\\\\\\\Pasta01\\\\\\\\" + arr[i]);
	                    System.out.println(arquivo);
	                    boolean transferir = arquivo.renameTo(new File(diretorio2, arquivo.getName()));
	                }
	                	                 
	               /* File file = new File("E:\\Documentos\\TADS-IFRN2020.1\\SISTEMAS DISTRIBUIDOS\\Pasta01");
	                File[] arquivos = file.listFiles();

	                for (int i=0; i<file.length(); i++) {
	                    System.out.println(arquivos[i]);
	                }*/
	                
	            }else {
	            	System.out.println("Pasta Vázia!");
	            }

	            
	           
				
	        }
	        Thread.sleep(3000); 
		}
	        
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace(); 
			
		}
	       
	        
		}
	}


