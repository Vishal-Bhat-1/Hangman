import java.util.StringJoiner;    //imports String Joiner package
import java.util.*;        //imports Java scanner package
import java.awt.Graphics;    //imports graphics package
import java.awt.Color;        //imports color package
import javax.swing.JFrame;    //imports Java Frame package
public class Main extends JFrame
{                //Name of file and links this file to the frame created
  public static void main (String[]args)
  {                //Main method
    String resume = "";        //Created for do while loop. Must be defined outside of loop.
    int a = 0;
    int i = 0;            //Must be defined outside of for loops
    int x = 0;
    int count = 0;
    String hint = "No Hint Provided";
    int words = 0;
    int nameLength = 0;
    int b = 0;
    int newIndex = 0;        //Multiple occurences
    int n = 1;
    int sum = 0;
    int fullLength = 0;
    int trigger = 0;
    String letter = "";
    int maxwrongguess = 10;    // maximum wrong guess
      String[] Phrase = new String[3];
    String guessWord = "";
    String updated = "";    //was a string with ""
    StringJoiner joiner = new StringJoiner ("");
    String fullWord = "";
    Scanner console = new Scanner (System.in);
      System.out.println ("How many words are in your phrase?");
      words = console.nextInt ();
      String[] phrase1 = new String[words];
    for (i = 0; i < words; i++)
      {
    System.out.println ("What is Word " + (i + 1));
    phrase1[i] = console.next ();
    nameLength = phrase1[i].length ();
    Phrase = new String[nameLength];
    fullLength = fullLength + nameLength;
    if (i == 0)
      {
        fullWord = phrase1[i].toString ();
      }
    else
      {
        fullWord = fullWord + " " + phrase1[i].toString ();
      }
    System.out.println ("Word " + (i + 1) + ":");
    for (x = 0; x < nameLength; x++)
      {
        String saveTime = "_";
        System.out.print (saveTime);
        if (x + 1 == nameLength)
          {
        Phrase[x] = (saveTime + " ");
        joiner.add (Phrase[x]);
          }
        else
          {
        Phrase[x] = (saveTime);
        joiner.add (Phrase[x]);
          }
        System.out.print (" ");
      }
      }
    System.out.print (fullWord);
    guessWord = joiner.toString ();    //The phrase altogether
    // System.out.println(fullLength);
    //  System.out.print(me);
    // System.out.println("\n\nPhrase: " + me);
    System.out.println ("Would you like to include a hint to make it easier?");
    String addhint = console.next ();
    if (addhint.equals ("yes") || addhint.equals ("Yes"))
      {
    System.out.println ("Enter your hint");
    hint = console.next ();
      }

    EntirePhrase (words, nameLength, i, hint, phrase1, Phrase, guessWord, updated, fullWord, letter, x, count, n, newIndex, maxwrongguess, b, fullLength, trigger);
//    Testing8 y = new Testing8 ();
//    y.paint (null);
//    console.close ();         //closes the scanner package
  }
  public static void EntirePhrase (int words, int nameLength, int i, String hint, String[]phrase1, String[]Phrase, String guessWord, String updated, String fullWord, String letter, int x, int count, int n,  int newIndex, int maxwrongguess, int b,   int fullLength, int trigger) {
 
    int sum = 0;
    Scanner player2console = new Scanner (System.in);
    String[]lettersArray = new String[100];
    fullWord = fullWord.toLowerCase(); //Converts all characters in string to lowercase
    guessWord = guessWord.toLowerCase();
    System.out.println("full word: " + fullWord + " guess word: " + guessWord);
    for (int z = 0; z < maxwrongguess; z++)
      {
        System.out.println ("The number of guesses left: " +(maxwrongguess - z));
        System.out.print("Type a letter");
        letter = player2console.next();
        b = 0;
        count = 0;
        int notFound = 0;
        int repeatedLetter = 0;
       
        for (int f = 0; f < (lettersArray.length); f++)
        {       
        //  String letters_Array_String = lettersArray[f].toString();
          if(lettersArray[f]==null) {
          }
          else if (lettersArray[f].equals(letter)) //since no value is assigned is
            {
                System.out.println("lettersArray[f] is: " +lettersArray[f]);
                repeatedLetter++;
            }
            } if (repeatedLetter > 0)
             
            {
                System.out.println ("Letter is already guessed");
                x = fullLength+1;
                count++;
            }
            else
            {
            lettersArray[z] = letter;    //increase maxwrongguess if letter is there
            if(count==0) { //Because this should not output if the letter is already guessed.
            System.out.println ("\n\n\nPhrase: ");
            }
            for (x = 0; x <= fullLength; x++)
              {
         //   System.out.println ("fullWord is " + fullWord);
            String a = Character.toString (fullWord.charAt (x));
         //   System.out.println ("A is " + a);
            boolean res = a.equals (letter);
            if (res == true)
              {
              //  System.out.println ("New A is equal to " + a);
                int index = fullWord.indexOf (letter, x);
              //  System.out.println ("Index is " + index);
                guessWord =    guessWord.substring (0, index) + letter + guessWord.substring (index + 1);
                System.out.println ("Updated string is : " + guessWord);
                notFound = 1;
              }
         }
         if (notFound == 0)
          {
                System.out.println ("Letter not found");
                System.out.println ("Oh no! The Snowman is growing");
                sum++;
                //Testing8 y = new Testing8();
                //y.paint(null, sum);
              //  paint(g, sum);
               // Testing8 callClass = new Testing8();
               // GUI GUIObject = new GUI();
              //  GUIObject.paint(sum, g);
       //   callClass.paint(sum, Graphics); //This is the area where I am blocked......
      //    paint(g, sum); //trying to pass the value of sum into a method
                //break;
          }
           else
          {
            if (guessWord.indexOf("_")<0) //Problem Solved!!!
            {   
                System.out.println ("Congratulations! You have solved the phrase");
                z=maxwrongguess;
                break;
               
            }
            else
            {
            //    System.out.println ("Guessed word is :" +guessWord);
            //    System.out.println ("fullWord word is :" +fullWord);
                maxwrongguess++;    //Increased so that it does not decrease the number of guesses possible
                System.out.println ("Updated Phrase " + guessWord);    //updated phrase
                System.out.println ("\nHint: " + hint);
                System.out.print ("Do you want to guess the word");
                String decisionToGuess = player2console.next ();
                System.out.println(decisionToGuess);
                if ((decisionToGuess.equals("yes")) || (decisionToGuess.equals("Yes"))) //Weird problem occurs when it enters this loop
                {
                    System.out.print("Enter your guess");
                    String guess = player2console.next ();
                    String full_Word_String = fullWord.toString();
                    boolean matchCheck = guess.equals(full_Word_String);
                    System.out.println("Full word is: " + fullWord);
                    if (matchCheck == true) //No idea why this is not working
                    {
                        System.out.println ("Congratulations! You have solved the phrase");
                        break;
                    }
                 }
             }
            }
          }
       
      }
  }
  }