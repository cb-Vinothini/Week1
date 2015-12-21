package CondStat;
/**
*conditionStatement class to implement the abstract working of if else statement
*/
public class ConditionStatement{
  /**
  *program starts execution here
  */
  public static void main(String[] args){
    IfElse ifelse = new IfElse(); //object to invove ifElseWorking function
    ifelse.ifElseWorking();
  }
}
/**
*IfEse class impelmented to explain the working of if else statement
*/
class IfElse{
  /**
  *demo working of if else statement
  */
  void ifElseWorking(){
    if(true){
      // if part is executed
      System.out.println("If part");
    }
    else{
      //else part is executed
      System.out.println("Else part");
    }
  }
}
