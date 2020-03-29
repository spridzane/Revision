package Revision;
/*
 Extra work on Characters, Strings and StringBuffers.
 Write an application which reads in a sentence and then creates a new  word with all the spaces removed from the sentence. Use instantiable classes.
 For example, if input is "I learn Java"
 the output is:
 "IlearnJava"
 SpacesRemoverApp is an application which does the following tasks
 -- prompts the user to input a sentence
 -- uses the instantiable class SpacesRemover to create a word by removing all the spaces from the sentence
 -- retrieves the word and dipslays it
 */
import java.util.Scanner;
public class SpacesRemoverApp {
    public static void main(String[] args) {
        // declare local variables
        String w;
        String sen;
        // input
        Scanner input = new Scanner(System.in);
        // input: prompt the user to provide a sentence
        System.out.println("Please enter the sentence: ");
        sen = input.nextLine();
        // use the setter method to set the remover object's instance variable called sentence to the sentence provided by the user
        SpacesRemover remover = new SpacesRemover();
        remover.setSentence(sen);
        // processing: remove the spaces from the sentence
        remover.removeSpaces();
        // output the word created from the sentence:
        // first, retrieve the word using the getter getWord() on the object remover
        w = remover.getWord();
        // second, display the wor
        System.out.println("the word is: " + w);
        // Alternatively, we could write the above 2 statements in one line
        //System.out.println("the word is: " + remover.getWord());
    }
}
