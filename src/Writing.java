import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
	private String folder;
	
	public Writing(String folder) {
        this.folder = folder;
    }
	
	public void write(String text) {                                                 
        try {
            BufferedWriter writing = new BufferedWriter(new FileWriter(folder));
            writing.write(text);
            writing.close();
        } 
        // To throw an exception for accessing the file.
        catch (IOException e) {
            e.printStackTrace();
        }
    }

	public static void main(String[] args) {                                         //THE STRING TEXT THAT MUST BE PRINTED AS OUTPUT FROM CONVERSATION.TXT
		// Text is the variable for all the text.
		 String text = "What took you so long?\n" +
	                "Well, you know, Master, I couldn't find a speeder that I really liked...\n" +
	                "There he is.\n" +
	                "...with an open cockpit and the right speed capabilities.\n" +
	                "If you spent as much time practicing your saber techniques as you did your wit,\n" +
	                "you'd rival Master Yoda as a swordsman.\n" +
	                "I thought I already did.\n" +
	                "Only in your mind, my very young apprentice.";
		 Writing writer = new Writing("conversation.txt");
	     writer.write(text);

	}

}
