package main.model;

public class MaskedWord {
    private static String MASKED_SYMBOL="X";
    private String maskedWord = "";
    private String word = "";

    public MaskedWord(String word) {
        this.word = word;

        for (int i = 0; i < word.length(); i++) {
            maskedWord += MASKED_SYMBOL;
        }
    }

    public String getMaskedWord() {
        return maskedWord;
    }

    public String getWord() {
        return word;
    }

    public void addLetter(String letter) {

        StringBuilder maskedWord = new StringBuilder(this.maskedWord);

        for (int i = 0; i < word.length(); i++) {
            if (letter.charAt(0) == word.charAt(i)) {
                maskedWord.setCharAt(i, letter.charAt(0));
            }
        }

        this.maskedWord = maskedWord.toString();
    }

    public boolean isMaskedLetter() {
        return maskedWord.indexOf(MASKED_SYMBOL) != -1;
    }

}
