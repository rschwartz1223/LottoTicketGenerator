/**
 * Robert Schwartz --
 * Super Lotto Plus program that where user inputs the amount of lotto tickets 
 * they would like, and program outputs that many distinct lotto tickets consisting
 * of five numbers and a MEGA number
 */

import java.util.Scanner;
import java.util.Random;

public class SuperLottoPlus
{
  /**
   * Generates 6 random numbers, the first 5 from a range of 1 to 47 inclusive, 
   * and the 6th from a range of 1 to 27 inclusive.
   * @return String object "lottoNumbers" includes 5 randomly generated
   * numbers and a 6th randomly generated MEGA number
   */
  public static String generateNumbers()
  { 
    Random numberGenerator = new Random(); // object from Random class
    
    // variables for first 5 lotto numbers, range: [1,47]
    int num1 = numberGenerator.nextInt((47 - 1) + 1) + 1; 
    int num2 = numberGenerator.nextInt((47 - 1) + 1) + 1;
    int num3 = numberGenerator.nextInt((47 - 1) + 1) + 1;
    int num4 = numberGenerator.nextInt((47 - 1) + 1) + 1;
    int num5 = numberGenerator.nextInt((47 - 1) + 1) + 1;
    // MEGA number variable, range: [1,27]
    int megaNum = numberGenerator.nextInt((27 - 1) + 1) + 1;
    
    // lotto ticket String object
    String lottoNumbers = num1 + " " + num2 + " " + num3 + " " + num4 +
                          " " + num5 + " " + "MEGA: " + "(" + megaNum + ")";
    
    return lottoNumbers;
  }
  
  /**
   * Receives user input for the amount of lotto tickets to output, and
   * outputs that many lotto tickets as String objects
   */
  public static void main(String[] args)
  {
    
    Scanner keyboard = new Scanner(System.in); // Scanner object for user input
    
    System.out.println("How many Super Lotto tickets would you like?");
    int ticketAmount = keyboard.nextInt(); // amount of lotto tickets
    
    // for loop to output the amount of lotto tickets set by user
    for(int i=0; i<ticketAmount; i++)
    {
      String lottoNumbers = generateNumbers();
      System.out.println(lottoNumbers);
    }
    
    // close keyboard Scanner object
    keyboard.close();
    
  }
  
}
