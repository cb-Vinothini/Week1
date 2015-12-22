package Addition;

/**
* Sum class implemented to carry out the addition operation
*/
public class Sum{
  public static void main(String[] args){
    int FirstNumber, SecondNember; // variable to store two numbers
    FirstNumber = Integer.parseInt(args[0]);
    SecondNember = Integer.parseInt(args[1]);
    String output = String.format("sum of %d + %d = %d", FirstNumber, SecondNember,Sum.addToNumbers(FirstNumber,SecondNember));
    System.out.println(output);
    // Display their sum
  }

  /**
  * function to add two numbers and Display their results
  */
  static int addToNumbers(int n1, int n2){
    return(n1+n2);
  }
}
