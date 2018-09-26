import java.util.Map;
import java.util.HashMap;

class RnaTranscription {
	static Map<String, String> dictionary = new HashMap<>();
	static {
		dictionary.put("G", "C");
		dictionary.put("C", "G");
		dictionary.put("T", "A");
		dictionary.put("A", "U");
	}

    String transcribe(String dnaStrand) {
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < dnaStrand.length(); i++) {
    		sb.append(dictionary.get(String.valueOf(dnaStrand.charAt(i))));
    	}
    	return sb.toString();    
    }

}
