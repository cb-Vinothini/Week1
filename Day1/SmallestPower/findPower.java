package SmallestPower;

public class findPower{
  /*
  *program execution starts here
  */
  public static void main(String[] args){
    Operation operation = new Operation();
    int firstNum, secondNum;
    firstNum = Integer.parseInt(args[0]);
    secondNum = Integer.parseInt(args[1]);
    int smallPower = operation.SmallestPower(firstNum, secondNum); //compute the smallest power
    String output = String.format("smalles power of %d greater than %d is : %d ",firstNum, secondNum, smallPower);
    System.out.println(output);
  }
}
/**
* Operation class implement the smallest power of number1 that is greater than number2
*/
class Operation{
  /**
  * SmallestPower funtion finds the smallest power
  */
  public int SmallestPower(int number1, int number2){
    int smallPower = 0;
    int temp = number2;
    while(temp>0)
    {
      smallPower++;
      temp = temp/number1;
    }
    return smallPower;
  }
}
