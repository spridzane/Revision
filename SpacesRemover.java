package Revision;
/*
 Extra work on Characters, Strings and StringBuffers.
 Write an application which reads in a sentence and then creates a new  word with all the spaces removed from the sentence
 Use instantiable classes.
 For example, if input is "I learn Java"
 the output is:
 "IlearnJava"
 SpacesRemover -- the instantiable class: given a sentence, creates a new word by removing all the spaces from the sentence
 */
public class SpacesRemover {
    // declare data members / instance variables
    private String sentence;
    private String word;

    // declare a constructor without parameters
    // initialize the sentence with the empty string, otherwise the sentence instance variable is initialized with null
    // initialize the word with the empty string, otherwise the word instance variable is initialized with null
    public SpacesRemover() {
        this.sentence = "";
        this.word = "";
    }

    // declare setter methods
    public void setSentence(String s) {
        this.sentence = s;
    }

    // declare getter methods
    public String getWord() {
        return word;
    }

    // processing: given a sentence, creates a new word by removing all the spaces from the sentence
    public void removeSpaces() {
    int len = sentence.length();
    // declare a variable named sb of type StringBuffer AND create an instance/object of StringBuffer to be
        // able to build a new word (remember: Strings are immutable -- i.e. cannot be modified)
    StringBuffer sb = new StringBuffer();
    // traverse the entire sentence in for loop,
   for(int i = 0; i < len; i++){
       // retrieve the current character at the index i
        char l = sentence.charAt(i);
       // in each iteration check whether the current character is a space, if it isn't add the character to the buffer sb
        if (l != ' '){
            sb.append(l);
        }
    }//for
        // save in the instance variable named word the String representation of the sb buffer
        word = sb.toString();
    }

}
