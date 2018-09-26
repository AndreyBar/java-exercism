import java.util.Set;
import java.util.HashSet;

public class PangramChecker {

    public boolean isPangram(String input) {
    	Set<Character> set = new HashSet<>();
    	String lowerInput = input.toLowerCase();
    	for (int i = 0; i < input.length(); i++) {
    		char c = lowerInput.charAt(i);
    		if (c >= 97 && c <= 122) {
    			set.add(c);
    		}
    	}
    	return set.size() == 26;
    }

}
