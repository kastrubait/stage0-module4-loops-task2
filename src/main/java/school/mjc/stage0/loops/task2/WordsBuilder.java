package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int whileCounter = 0;
        String phrase = "";
        while (whileCounter < chars.length){
            String temp = Character.toString(chars[whileCounter]);
            System.out.print(phrase.concat(temp));
            whileCounter++;
        }

    }
}
