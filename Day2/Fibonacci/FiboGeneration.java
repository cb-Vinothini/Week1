package Fibonacci;

import java.util.Scanner;

public class FiboGeneration{
  public static void main(String[] args){
    System.out.print("Enter the number of terms: ");
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    int firstTerm = 0, secondTerm = 1, nextTerm;

    String output = String.format("First %d terms of Fibonacci series : ", count);
      System.out.print(output);
    for ( int index = 0 ; index < count ; index++ ){
       if ( index <= 1 )
          nextTerm = index;
       else
       {
          nextTerm = firstTerm + secondTerm;
          firstTerm = secondTerm;
          secondTerm = nextTerm;
       }
       System.out.print(nextTerm+" ");
    }
    System.out.println();
  }
}
