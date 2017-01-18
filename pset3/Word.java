// Bluej project: lesson5-2/plurals

public class Word
{
    private String letters;

    public Word(String letters)
    {
        this.letters = letters.toLowerCase();
    }

    /**
        Forms the plural of this word.
        @return the plural, using the rules for regular nouns
    */
    public String getPluralForm()
    {
        if(is(letters.length() - 1, "y") &&
        isConsonant(letters.length() - 2)){
            letters = letters.substring(0, letters.length() -1) + "ies";
        }
        else if(is(letters.length() - 1, "y") &&
        isVowel(letters.length() - 2)) {
            letters = letters + "s";
        }
        else if(is(letters.length() - 1, "o") ||
        is(letters.length() - 1, "s")||
        is(letters.length() - 1, "h") && is(letters.length() - 2, "s")||
        is(letters.length() - 1, "h") && is(letters.length() - 2, "c")) {
            letters = letters + "es";
        }
        else {
            letters = letters + "s";
        }
        return letters;
            
             // TODO: Complete this method
        // If the word ends in y preceded by a consonant you take away the y and add ies.
        // If the word ends in y preceded by a vowel, you just add an s.
        // You add an es when a word ends in o, or s, or sh, or ch.
        // In all the other case just add an s.
        // you can use the
        //  isVowel
        //  isConsonant
        //  is
        // methods from below.
    
    }
    /**
       Tests whether the ith letter is a vowel.
       @param i the index of the letter to test
       @return true if the ith letter is a vowel
    */
    public boolean isVowel(int i)
    {
        return is(i, "a")
               || is(i, "e")
               || is(i, "i")
               || is(i, "o")
               || is(i, "u");
    }

    /**
       Tests whether the ith letter is a consonant.
       @param i the index of the letter to test
       @return true if the ith letter is a consonant
    */
    public boolean isConsonant(int i)
    {
        return !isVowel(i);
    }

    /**
     * Checks what letter is in position i
     * @return true when the the letter of letters is the given letter.
     *         false otherwise.
     * @param i index in letters
     * @param letter the letter to match with. must be one character long.
     */
    public boolean is(int i, String letter)
    {
        return letters.substring(i, i + 1).equals(letter);
    }
}
