class Acronym {

	private String acronym;

    Acronym(String phrase) {
        this.acronym = buildAcronym(phrase);
    }

    String get() {
        return this.acronym;
    }

    private String buildAcronym(String phrase) {
    	StringBuilder sb = new StringBuilder();
    	String[] arr = phrase.split("\\s|-");
    	for (String word : arr) {
    		sb.append(String.valueOf(word.charAt(0)).toUpperCase());
    	}
    	return sb.toString();
    }

}
