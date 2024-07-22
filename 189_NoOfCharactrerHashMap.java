import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "example string";
        Map<Character, Integer> charCountMap = countCharacters(input);
        
        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCharacters(String s) {
        // Initialize an empty HashMap to store the counts
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the string to a char array and iterate through each character
        for (char c : s.toCharArray()) {
            // If the character is already in the map, increment its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If the character is not in the map, add it with a count of 1
                charCountMap.put(c, 1);
            }
        }
        
        return charCountMap;
    }
}
