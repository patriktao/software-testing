package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringSearch {

	public static void main(String[] args) {
		try {
			//Hej
			if(args[0] == null || args[1] == null ||  args[2] == null){
				throw new Error();
			}
			String command = args[0];
			String pattern = args[1];
			String fileName = args[2];
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			 
			for (String line = reader.readLine(); line != null; line = reader.readLine()) {
				if(line.contains(pattern)) {
					System.out.println(line);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
