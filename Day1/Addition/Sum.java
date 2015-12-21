package Addition;
/**
* Sum class implemented to carry out the addition operation
*/
public class Sum{
  public static void main(String[] args){
    int FirstNumber, SecondNember; // variable to store two numbers
    FirstNumber = 10;
    SecondNember = 20;
    System.out.println("sum of 10+20 = "+Sum.addToNumbers(FirstNumber,SecondNember));
    // Display their sum
  }

  /**
  * function to add two numbers and Display their results
  */
  static int addToNumbers(int n1, int n2){
    return(n1+n2);
  }
}
