package springBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springBootApp.entities.User;

import java.util.HashMap;
import java.util.Map;


@Controller
public class JspController {
    int wordCount;
    int length;
    String pigLatin;
    String reverse;
    String googleEach;
    private Map<String, User> userMap = new HashMap<>();


    @RequestMapping(value="/")
    public String jspIndex() {
        return "index";
    }



//@RequestMapping(value = "/jspCount", method = RequestMethod.GET)
//public String jspCount(@RequestParam String userSentence) {


    @RequestMapping(value = "/jspCount", method = RequestMethod.GET)
    public String jspCount(@ModelAttribute("user") User user,
                           BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("userSentence", user.getUserSentence());
        userMap.put(user.getUserSentence(), user);
        String userSentence = user.getUserSentence();
    System.out.println(userSentence);
    if (userSentence == null) {
        return String.valueOf(0);
    }
    String input = userSentence.trim();
    wordCount = input.isEmpty() ? 0 : input.split("\\s+").length;
    System.out.println("Word count in RequestMapping: " + wordCount);
    length = userSentence.length();
    reverse = new StringBuilder(userSentence).reverse().toString();


    String[] google = userSentence.split(" ");
        for (int i = 0; i < google.length; i++) {
            googleEach = google[i] + " ";
//            System.out.print(googleEach);
            final String vowels = "aeiouAEIOU";
            final String punctuation = ",;.!?:";
            String word = google[i];
            char endPunctuation = ' ';

            String beforeVowel = "";
            int cut = 0;
            while (cut < word.length() && !vowels.contains("" + word.charAt(cut))) {
                beforeVowel += word.charAt(cut);
                cut++;
            }
            if (cut == 0)
                word += "w";
            if (punctuation.contains("" + word.charAt(word.length() - 1))) {
                endPunctuation = word.charAt(word.length() - 1);
                word = word.substring(0, word.length() - 1);
                pigLatin = (word.substring(cut) + beforeVowel + "ay" + endPunctuation + " ");

            } else
                pigLatin = (word.substring(cut) + beforeVowel + "ay" + " ");
            System.out.print(pigLatin);
        }
            model.addAttribute("wordCount", wordCount);
            userMap.put(String.valueOf(wordCount), user);
            model.addAttribute("length", length);
            userMap.put(String.valueOf(length), user);
            model.addAttribute("pigLatin", pigLatin);
            userMap.put(pigLatin, user);
            model.addAttribute("reverse", reverse);
            userMap.put(reverse, user);
            model.addAttribute("googleEach", googleEach);
            userMap.put(googleEach, user);


 /*   getWordCount();
    getLength();
    getPigLatin();
    getReverse();
    getGoogleEach();*/

    return "count";
    }

 /*   @ModelAttribute("wordCount")
    public int getWordCount(){
        System.out.println("Word count in ModelAttribute: " + wordCount);
        return wordCount;
    }
    @ModelAttribute("length")
    public int getLength(){
        return length;
    }
    @ModelAttribute("pigLatin")
    public String getPigLatin(){
        return pigLatin;
    }
    @ModelAttribute("reverse")
    public String getReverse(){
        return reverse;

    }@ModelAttribute("googleEach")
    public String getGoogleEach(){
        return googleEach;
    }
*/
}
