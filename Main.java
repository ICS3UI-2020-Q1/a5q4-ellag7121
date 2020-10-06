import java.util.Scanner;
/**
 * asks user for a starting value, an iterest rate and a number of years to invest for, then tell the user their final balance based on the given values
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //make a new scanner to get the user's input
    Scanner input = new Scanner(System.in);

    //initialize variables
    double balance; //the value given by the user to be their starting balance
    double investRate; //the invest rate given by the user
    int years; //the number of years the user will invest

    //ask user for values
    //ask user for starting balance
    System.out.println("Please enter a starting balance");
    balance = input.nextDouble();

    //ask user for the invest rate
    System.out.println("Please enter your interest rate");
    investRate = input.nextInt();

    //ask user for years to invest
    System.out.println("Please enter the number of years you will invest for");
    years = input.nextInt();

    //turn the invest rate into a decimal so that we can multiply it by the balance each year
    investRate *= 0.01;

    //start a for loop that will update the balance, this will repeat once for every year that the user entered
    for(int i = 1; i <= years; i++){
      //get how much money to add to the balance variable
      balance += balance * investRate;
    }
    //tell the user their final balance
    System.out.println("Your final balance would be $" + balance);
  }
}
