package main.model;

import main.utils.MathUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private List<String> words = new ArrayList<>();

    public DataSource(String filePath) {
        Path path = Paths.get(filePath);

        try {
            Files.lines(path).forEach(word -> words.add(word));
        } catch (IOException e) {
            System.out.println("Error when read file");
        }
    }

    public String getRandomWord() {
        return words.get(MathUtil.generateRandomNumber(words.size()));
    }
}
