package projeto1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnalyzerReader {
	 private List<String> tokens;

	    public AnalyzerReader(String filename) throws IOException {
	        tokens = new ArrayList<>();
	        readFileAndTokenize(filename);
	    }

	    private void readFileAndTokenize(String filename) throws IOException {
	        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] words = line.split("\\s+");
	                for (String word : words) {
	                    tokens.add(word.toLowerCase());
	                }
	            }
	        } catch (IOException e) {
	            throw new IOException("Error reading file: " + filename, e);
	        }
	    }

	    public List<String> getTokens() {
	        return tokens;
	    }
}
