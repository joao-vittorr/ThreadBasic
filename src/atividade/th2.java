package atividade;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class th2 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Tem Um novo arquivo aqui");
		
		 Scanner in = null;
		try {
			in = new Scanner(new FileReader("E:\\Documentos\\TADS-IFRN2020.1\\SISTEMAS DISTRIBUIDOS\\Pasta01\\A2.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			while (in.hasNextLine()) {
	            String line = in.nextLine();
	            System.out.println(line);
	        }
	}

}
