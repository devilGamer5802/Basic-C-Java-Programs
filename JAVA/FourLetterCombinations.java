import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FourLetterCombinations {

    public static void main(String[] args) {
        // Define characters to use in combinations
        String chars = "0123456789";
        
        // Generate combinations
        List<String> combinations = generateCombinations(chars, 4);
        
        // Save combinations to file
        try {
            saveToFile("combinations.txt", combinations);
            System.out.println("Combinations saved to combinations.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static List<String> generateCombinations(String chars, int length) {
        List<String> results = new ArrayList<>();
        generateCombinationsHelper(chars, length, "", results);
        return results;
    }

    private static void generateCombinationsHelper(String chars, int length, String prefix, List<String> results) {
        if (prefix.length() == length) {
            results.add(prefix);
            return;
        }

        for (int i = 0; i < chars.length(); i++) {
            generateCombinationsHelper(chars, length, prefix + chars.charAt(i), results);
        }
    }

    private static void saveToFile(String fileName, List<String> combinations) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String combination : combinations) {
                writer.write(combination);
                writer.newLine();
            }
        }
    }
}
