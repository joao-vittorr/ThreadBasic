package atividade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class th1 extends Thread {

	@Override
	public void run(){
		
		while(true) {
	        File directory = new File("E:\\Documentos\\TADS-IFRN2020.1\\SISTEMAS DISTRIBUIDOS\\Pasta01");
	  	  
	        if (directory.isDirectory()) {
	            
	            String arr[] = directory.list();
	  
	            if (arr.length > 0) {
	                System.out.println("The directory "
	                                   + directory.getPath()
	                                   + " is not Empty!");
	                System.out.println("A pasta tem " + arr.length + " arquivos no total");
	                
	                //File arquivo = new File("E:\\\\Documentos\\\\TADS-IFRN2020.1\\\\SISTEMAS DISTRIBUIDOS\\\\Pasta01\\\\A1.txt");

	    	        // diretorio de destino
	    	        //File dir = new File("E:\\\\Documentos\\\\TADS-IFRN2020.1\\\\SISTEMAS DISTRIBUIDOS\\\\Pasta02");

	    	        // move o arquivo para o novo diretorio
	    	        //boolean ok = arquivo.renameTo(new File(dir, arquivo.getName()));
	    	        /*if(ok){
	    	            System.out.println("Arquivo foi movido com sucesso");
	    	        }
	    	        else{
	    	            System.out.println("Nao foi possivel mover o arquivo");
	    	        }*/
	                 
	                File file = new File("E:\\Documentos\\TADS-IFRN2020.1\\SISTEMAS DISTRIBUIDOS\\Pasta01");
	                File[] arquivos = file.listFiles();

	                for (int i=0; i<file.length(); i++) {
	                    System.out.println(arquivos[i]);
	                }
	    	        
	            }
	            else {
	                System.out.println("The directory "
	                                   + directory.getPath()
	                                   + " is Empty!");
	            }
	        }
	        
	       
	        
			try {
				Scanner in = new Scanner(new FileReader("E:\\Documentos\\TADS-IFRN2020.1\\SISTEMAS DISTRIBUIDOS\\Pasta01\\A2.txt"));
				while (in.hasNextLine()) {
		            String line = in.nextLine();
		            System.out.println(line);
		        }
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			}
	        
		}
	}

}
