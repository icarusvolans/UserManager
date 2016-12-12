package springBootApp;

/**
 * Created by icarusvolans on 12/9/16.
 */
public class Count {
    public int countWord(String sentence) {
        if (sentence == null) {
            return 0;
        }
        String input = sentence.trim();
        int count = input.isEmpty() ? 0 : input.split("\\s+").length;
        System.out.println(count);
        return count;

    }
}
