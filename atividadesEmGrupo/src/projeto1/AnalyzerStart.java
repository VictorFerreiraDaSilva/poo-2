package projeto1;

import java.io.File;
import java.util.ArrayList;


public class AnalyzerStart {
	public static ArrayList<File> files = new ArrayList<File>();
	public static AnalyzerController ac;
	public static void main(String[] args) {		
        if (args.length == 0) {
            System.out.println("Please provide file names");
            return;
        }

        try {
            for (String filename : args) {
                valida(filename);
            }
            ac = new AnalyzerController(files);
        } catch(Exception ex) {
        	System.out.println("error: " + ex);
        }
        
    }	
	
	public static void valida(String filename) {
		File file = new File(filename);

        if (file.exists() && file.isFile()) {
            files.add(file);
        } else {
            System.out.println("Invalid or not found file: " + filename);
        }
	}
}
