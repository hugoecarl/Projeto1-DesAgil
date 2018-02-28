package br.pro.hashi.ensino.desagil.tequilada;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
public static void main(String[] args) {
	BufferedReader reader = null;

	try {
	    File file = new File("C:\\Users\\Hugo\\Desktop\\Insper\\Des Ag\\Projeto1-DesAgil\\labirinto.txt");
	    reader = new BufferedReader(new FileReader(file));

	    String line;
	    while ((line = reader.readLine()) != null) {
	    	for (int i=0; i<line.length(); i++) {
	    		   char c = line.charAt(i);
	    		   if (c == '#') {
	    			   char[] lineChars = line.toCharArray();
	    			   lineChars[i] = 'X';
	    			   line = String.valueOf(lineChars);
	    			   
	    		   }
	    		}
	    	System.out.println(line);
	    }

	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    try {
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	
	
	
	}
}