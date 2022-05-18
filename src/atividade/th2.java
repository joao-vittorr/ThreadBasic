package atividade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class th2 extends Thread{
	
	@Override
	public void run() {
		
		 Scanner in = null;
		 int soma = 0;
		try {
			
			
			while(true) {
				
		        File diretorio = new File("E:\\\\Documentos\\\\TADS-IFRN2020.1\\\\SISTEMAS DISTRIBUIDOS\\\\Pasta02");
		        File diretorioResult = new File("E:\\\\Documentos\\\\TADS-IFRN2020.1\\\\SISTEMAS DISTRIBUIDOS\\\\Pasta03");
		        
		        if (diretorio.isDirectory()) {
		            
		            String arr[] = diretorio.list();
		            
		  
		            if (arr.length > 0) {
		            	for (int i=0; i<arr.length; i++) {
		        			in = new Scanner(new FileReader("E:\\\\Documentos\\\\TADS-IFRN2020.1\\\\SISTEMAS DISTRIBUIDOS\\\\Pasta02\\\\" + arr[i]));
		        			String line = in.nextLine();
		        			char[] numero;
		        			numero = line.toCharArray();
		        			for(int x=0; x<numero.length; x++) {
		        				int num = Character.getNumericValue(numero[x]);
		        				soma = num + soma;
		        			}
		        			in.close();
		        			File resultado = new File("E:\\\\Documentos\\\\TADS-IFRN2020.1\\\\SISTEMAS DISTRIBUIDOS\\\\Pasta03\\\\Resultado.txt");
		        			if(resultado.exists()) {
		        				FileWriter fileWriter = new FileWriter(resultado, true);
		        				PrintWriter printWriter = new PrintWriter(fileWriter);
		        				printWriter.println(arr[i] + "=" + soma);
		        				printWriter.flush();
		        				printWriter.close();
		        			}else {
		        				File arq = new File(diretorioResult, "Resultado.txt");
		        				arq.createNewFile();
		        				FileWriter fileWriter = new FileWriter(resultado, false);
		        				PrintWriter printWriter = new PrintWriter(fileWriter);
		        				printWriter.println(arr[i] + "=" + soma);
		        				printWriter.flush();
		        				printWriter.close();
		        				
		        			}
		        			File arquivo = new File("E:\\Documentos\\TADS-IFRN2020.1\\SISTEMAS DISTRIBUIDOS\\Pasta02\\" + arr[i]);
		        			if(arquivo.delete()) {
		        				System.out.println("Arquivo Excluido:");
		        				System.out.println(arquivo);
		        			}else {
		        				System.out.println("Erro na Exclusão!");
		        				System.out.println(arquivo);
		        			}
		        			soma = 0;
		        			}
		                }
		            }
		        
		        Thread.sleep(10000);
		       }
		 	
		} catch (IOException | InterruptedException e) {
		
			e.printStackTrace();
		}

	}

}
