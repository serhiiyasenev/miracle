package main.model;

public class Gamer {
    private static int DEFAULT_LIVES=6;
    private int lives;

    public Gamer() {
        this.lives = DEFAULT_LIVES;
    }

    public Gamer(int lives) {
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }

    public void decreaseLives() {
        lives--;
    }
}
