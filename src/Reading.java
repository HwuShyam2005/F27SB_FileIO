import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Reading {
	// File path for conversation 
	private static final String FILE_PATH = "conversation.txt";
	//Method to read with Scanner
	public static void main(String[] args) {
		// Calling the methods
		Reading.readWithScanner();                                                               //READING OF SCANNER
		System.out.print(System.lineSeparator());                                                //LINE SEPERATOR
	    Reading.readWithBufferedReader();                                                        //READING WITH BUFFEREDREADER
	}
	public static void readWithScanner() {
		try (Scanner scanner = new Scanner(new FileReader(FILE_PATH))) {                         // IMPLEMENTATION OF SCANNER
			// To check if the file has a next line
			while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());                                          //CODE HELPS TO FIND NEXT LINE 
            }
		}
		// To throw an exception for accessing the file.
		catch (IOException e) {
            System.err.println("Error in reading file: " + e.getMessage());
        }
	}
	// Method to read with buffered reader                                                       //CATCHING THE ERROR WHILE DOING TRY AND
	public static void readWithBufferedReader() {                                                //CATCH METHOD WHILE USING BUFFEREADER
		try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
			//Variable for the line 
			String textLine;
			//Variable to keep track of the line count which is set to 0 initially.
			int textLineCount = 0;
			while((textLine = reader.readLine()) != null) {
				textLineCount++;
                System.out.println(textLine);
				if (textLineCount % 2 == 0) {
                    System.out.print("Press Enter to continue...");
                    new Scanner(System.in).nextLine();
                }
			}
		}
		catch (IOException e) {
            System.err.println("Error in reading file: " + e.getMessage());
        }
	}

}