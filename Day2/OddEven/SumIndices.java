import java.util.Scanner;

public class SumIndices{
  public static void main(String[] args){
    System.out.print("enter the string : ");
    Scanner scanner = new Scanner(System.in);
    String string = scanner.next();
    SumIndices.calculateSum(string);
  }
  static void calculateSum(String string){
    int sum = 0;
    for(int index = 0 ; index<string.length(); index++){
      char ch = string.charAt(index);
      sum = sum + ch - 64;
    }
    if(sum%2 == 0){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }
  }
}
