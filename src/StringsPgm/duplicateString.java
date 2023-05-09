package StringsPgm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expression  = "Hi, I am Hritik and I am a programmer string string";
    String[] words = expression.split(" ");
    Map<String, Integer> word_map = new HashMap<>();
    for (String word : words) {
        if (word_map.get(word) != null) {
            word_map.put(word, word_map.get(word) + 1);
        }

        else {
            word_map.put(word, 1);
        }
    }

    Set<String> word_set = word_map.keySet();
    for (String word : word_set) {
        if (word_map.get(word) > 1)
            System.out.println(word);
    }

	}

}
