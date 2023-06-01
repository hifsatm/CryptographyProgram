/* 
Done By: 
Hifsa Tayyab Malik 
*/

import java.util.*;

public class Cryptography 
{
   public static void main(String[] args) throws Exception
   {
      Scanner console = new Scanner(System.in);
      
      int key =0;          //initializing all variables required
      char c;
      String text;      
      String encrypt="";
      String decrypt="";
     
        try {          //errors are handled using try and catch
      System.out.println("Done By: Hifsa Tayyab Malik");
      System.out.println();
      
      System.out.println("Enter the plaintext: ");   //asking user to input plaintext and key
      text=console.nextLine();
      
      System.out.println("Enter your key: ");
      key= console.nextInt();
      System.out.println();
      
       if (key == 0)// if the user enters 0 as the key value, then the following message will be displayed
       System.out.println("With key 0, No Shifting Takes Place and The Encrypted text is same as the Plaintext.\n");

//encrypting plaintext

/* here, we're looping through all the characters of the string, at each iteration a character is retrieved from the string, 
   stored in the variable 'c',shifted according to the key value using the formula and each character is then appended to the variable 'encrypt'.
   Finally, we print the encrypted text. */
 
for (int i=0; i < text.length(); i++) // loops through all the characters of the string
{
       c=text.charAt(i);           //retrieving a character and storing it in c
       c=(char)((c + key)%128);   //we use the formula to add key to characters and take its modulus with the total number of ASCII characters (128)
       encrypt= encrypt + c;      //adding the calculated c to encrypt

}
System.out.println("The encrypted text is: " + encrypt);  //printing the encrypted text
System.out.println();


//now we decrypt this encrypted text back to its original form
for (int i=0; i < encrypt.length(); i++)
{
         c=encrypt.charAt(i);              //retrieving the first encrypted character and storing in c
         c=(char)((c - key + 128)%128); //we use the formula to subtract key from characters and take its modulus with the total number of ASCII characters (128) to return to original form
         decrypt= decrypt + c;         //adding the calculated c to decrypt
}
System.out.println("The decrypted text is: " + decrypt);  //printing the decrypted text
}

catch(InputMismatchException e)
 { System.out.println("Key can only be an Integer");}

catch(Exception e)
 { System.out.println(e.getMessage());}
 
}}





      