
public class findPower{
  /*
  *program execution starts here
  */
  public static void main(String[] agrs){
    Operation operation = new Operation();
    int firstNum, secondNum;
    firstNum = 9;
    secondNum = 60;
    int smallPower = operation.SmallestPower(firstNum, secondNum); //compute the smallest power
    System.out.println("smalles power of "+firstNum+" greater than "+secondNum +" is : "+ smallPower);
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
