package projeto1;

import java.io.*;
import java.util.*;

public class AnalyzerWriter {
	public void writeFiles(Map<String, Set<String>> adjacencyLists, String filePath) throws IOException {		
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        	
            for (Map.Entry<String, Set<String>> entry : adjacencyLists.entrySet()) {
                String source = entry.getKey();
                Set<String> targets = entry.getValue();
                String targetsString = String.join(", ", targets);

                writer.write(source + ", " + targetsString);
                writer.newLine();
            }
        }
        System.out.println("Output file generated successfully: " + filePath);
    }
}
