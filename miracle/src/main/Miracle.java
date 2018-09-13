package main;

import main.model.DataSource;
import main.model.Gamer;
import main.model.MaskedWord;
import main.utils.UIUtil;

public class Miracle {
    private DataSource dataSource = new DataSource("c:/w/words.txt");
    private Gamer gamer = new Gamer();

    public void start() {
        String word = dataSource.getRandomWord();

        MaskedWord maskedWord = new MaskedWord(word);

        do {
            UIUtil.print(maskedWord.getMaskedWord());

            String letter = UIUtil.readInput("Please type your letter: ");

            if (word.indexOf(letter) != -1) {
                UIUtil.print("Letter is in word");

                maskedWord.addLetter(letter);
            } else {
                UIUtil.print("Letter is not in word");

                gamer.decreaseLives();
            }
        } while (gamer.getLives() > 0 && maskedWord.isMaskedLetter());

        UIUtil.print( gamer.getLives() > 0 ? "You win, the word is: " + word : "You lose");
    }
}
