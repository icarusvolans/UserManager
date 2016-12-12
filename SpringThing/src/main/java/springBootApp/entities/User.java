package springBootApp.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

    private String userSentence;
    private String wordCount;
    private String length;
    private String pigLatin;
    private String reverse;
    private String googleEach;


    public User() {

    }

    public String getUserSentence() {
        return userSentence;
    }

    public void setUserSentence(String userSentence) {
        this.userSentence = userSentence;
    }

    public String getWordCount() {
        return wordCount;
    }

    public void setWordCount(String wordCount) {
        this.wordCount = wordCount;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getPigLatin() {
        return pigLatin;
    }

    public void setPigLatin(String pigLatin) {
        this.pigLatin = pigLatin;
    }

    public String getReverse() {
        return reverse;
    }

    public void setReverse(String reverse) {
        this.reverse = reverse;
    }

    public String getGoogleEach() {
        return googleEach;
    }

    public void setGoogleEach(String googleEach) {
        this.googleEach = googleEach;
    }

}
