package ReadingText;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;

public class ReadText {
    private ArrayList<String> sentences;

    public ReadText() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/ReadingText/ProgrammingHistory.txt"));
        sentences = new ArrayList<>();
        String line = reader.readLine();
        while (line != null) {
            if (line.isEmpty()) {
                line = reader.readLine();
                continue;
            }
            while (line.charAt(0) != '\n') {
                int sentence = line.indexOf('.');
                if (sentence >= line.length() - 1) {
                    sentences.add(line);
                    break;
                }
                while (line.charAt(sentence + 1) != '\n' && line.charAt(sentence + 1) != ' ') {
                    sentence++;
                    if (sentence >= line.length() - 1) {
                        break;
                    }
                }
                sentences.add(line.substring(0, sentence + 1));
                line = line.substring(sentence + 1);
                if (!line.isEmpty()) {
                    if (line.charAt(0) == ' ') {
                        line = line.substring(1);
                    }
                }
                if (line.length() == 0) {
                    break;
                }
            }
            line = reader.readLine();
        }
    }

    public ArrayList<ArrayList<Integer>> findWord(String word) {
        ArrayList<ArrayList<Integer>> wordIndexes = new ArrayList<>();
        for (int i = 0; i < sentences.size(); i++) {
            String temp = sentences.get(i);
            while (temp.contains(word)) {
                wordIndexes.add(new ArrayList<>());
                wordIndexes.get(wordIndexes.size() - 1).add(i);
                wordIndexes.get(wordIndexes.size() - 1).add(temp.indexOf(word));
                temp = temp.substring(temp.indexOf(word) + word.length() + 1);
            }
        }
        return wordIndexes;
    }

    public ArrayList<String> getSentences() {
        return sentences;
    }

    public void setSentences(ArrayList<String> sentences) {
        this.sentences = sentences;
    }
}
