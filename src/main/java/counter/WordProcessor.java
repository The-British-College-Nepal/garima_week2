
package counter;

/**
 * WordProcessor implements the Counter interface.
 * It analyzes sentences and uses fallback text when null is provided.
 */
public class WordProcessor implements Counter {

    // Encapsulated fallback text attribute
    private String text = "";

    // Getter for fallback text
    public String getText() {
        return this.text;
    }

    // Setter for fallback text
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int countWords(String sentence) {

        // Use fallback text if sentence is null
        if (sentence == null) {
            sentence = this.text;
        }

        if (sentence.isEmpty()) {
            return 0;
        }

        return sentence.split(" ").length;
    }

    @Override
    public int countLetters(String sentence) {

        // Use fallback text if sentence is null
        if (sentence == null) {
            sentence = this.text;
        }

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int getLength(String sentence) {

        // Use fallback text if sentence is null
        if (sentence == null) {
            sentence = this.text;
        }

        return sentence.length();
    }
}
