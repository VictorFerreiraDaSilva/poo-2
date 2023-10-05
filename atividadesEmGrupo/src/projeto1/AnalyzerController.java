package projeto1;

import java.io.*;
import java.util.*;

public class AnalyzerController {
	ArrayList<File> files = new ArrayList<File>();

	public AnalyzerController(ArrayList<File> files) throws IOException {
		this.files = files;
		for(File f: files) processFile(f);
	}	
	
	public void processFile(File f) throws IOException {
		String filePath = f.getPath();
		AnalyzerReader reader = new AnalyzerReader(filePath);
        AnalyzerWriter writer = new AnalyzerWriter();

        List<String> tokens = reader.getTokens();
        Map<String, Set<String>> adjacencyLists = buildAdjacencyLists(tokens);

        String outputFileName = filePath.replace(".txt", ".csv");
        writer.writeFiles(adjacencyLists, outputFileName);
        
        /*for (File f: files) {
            if (!f.getName().endsWith(".txt")) {
                System.out.println("Input file name must end with '.txt' extension");
                return;
            }

            String inFile = f.getPath();
            String outFile = f.getPath().replace(".txt", ".csv");

            generateWordGraph(inFile, outFile);
        }*/
    }
	
	 private Map<String, Set<String>> buildAdjacencyLists(List<String> tokens) {
	        Map<String, Set<String>> adjacencyLists = new TreeMap<>();

	        for (int i = 0; i < tokens.size() - 1; i++) {
	            String source = tokens.get(i);
	            String target = tokens.get(i + 1);

	            adjacencyLists.computeIfAbsent(source, k -> new HashSet<>()).add(target);
	        }

	        return adjacencyLists;
	    }

    /*protected static void generateWordGraph(String inFile, String outFile) throws IOException {
        TextScanner scanner = new TextScanner();
        WordGraph graph = new WordGraph();

        String prev = "";
        for (String word : scanner.scan(inFile)) {
            if (!prev.isEmpty()) {
                graph.connect(prev, word);
            }
            prev = word;
        }

        graph.exportCSV(outFile);
    }*/
}
