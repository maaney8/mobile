/**
 * Format Contact List - This class assignment will update the existing contact list
 * Copyright 2023 Howard Coummunity Community College
 *Kohil M Shakya
 */

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner; 

public class ContactList {
	
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/chris/Desktop/contacts.txt");
		Scanner input = new Scanner(file);
		
		FileWriter outputFile = new FileWriter("/Users/chris/Desktop/formatted-contacts.txt");
		
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			String[] field = line.split(",");
			
			String lastName = field[2];
			String firstName = field[1];
			String email = field[3];
			
			String formattedLine = lastName + ", " + firstName + " <" + email;
			outputFile.write(formattedLine + ">\n");
		}
		input.close();
		outputFile.close();
		}
	
}