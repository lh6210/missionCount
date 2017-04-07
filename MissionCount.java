import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MissionCount
{
    // returns an InputStream that gets data from the named file
    private static InputStream getFileInputStream(String fileName) throws Exception
    {
	InputStream inputStream;

	try {
	    inputStream = new FileInputStream(new File(fileName));
	}
	catch (FileNotFoundException e) {		// no file with this name exists
	    inputStream = null;
	    throw new Exception("unable to open the file -- " + e.getMessage());
	}
	return inputStream;
    }
    

    public static void main(String[] args) {
	
	if (args.length != 1) {
	    System.out.println("USage: MissionCount <datafile>");
	    System.exit(1);
	}

	try {
	    System.out.printf("CS261 - MissionCount - Ensign Your Name%n%n");

	    InputStream log = getFileInputStream(args[0]);
	    Scanner sc = new Scanner(log);
	    sc.useDelimiter(Pattern.compile(",|\n"));
	    while (sc.hasNext())
		{
		    String crewMember = sc.next();
		    String mission = sc.next();

		    // Add code to read in the data and store it in a data structure here
			
		}
	    sc.close();

	    // Add code to print the report here
	    

	} catch (Exception e) {
	    System.out.println("Error: " + e.getMessage());
	}
    }
}
