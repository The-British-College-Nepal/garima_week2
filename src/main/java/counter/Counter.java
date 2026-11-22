
package counter;

/**
 * Step 1: Complete the Counter interface contract.
 *
 * An interface defines a set of operations that classes must provide.
 * Methods declared in an interface have no body and are implicitly
 * public and abstract.
 */
public interface Counter {

    /**
     * Counts the number of words in a sentence.
     *
     * @param sentence the sentence to analyse
     * @return the number of words
     */
    int countWords(String sentence);

    /**
     * Counts the total number of alphabetic letters in a sentence.
     *
     * @param sentence the sentence to analyse
     * @return the number of letters
     */
    int countLetters(String sentence);

    /**
     * Returns the total length of a sentence, including spaces
     * and punctuation.
     *
     * @param sentence the sentence to measure
     * @return the total sentence length
     */
    int getLength(String sentence);

}
