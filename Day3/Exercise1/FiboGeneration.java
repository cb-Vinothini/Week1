package Exercise1;

import java.util.Scanner;

public class FiboGeneration{
  public static void main(String[] args){
    System.out.print("Enter the number of terms: ");
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    int first_term = 0, second_term = 1, next_term;

    System.out.print("First "+"count"+" terms of Fibonacci series : ");
    for ( int index = 0 ; index < count ; index++ ){
       if ( index <= 1 )
          next_term = index;
       else
       {
          next_term = first_term + second_term;
          first_term = second_term;
          second_term = next_term;
       }
       System.out.print(next_term+" ");
    }
    System.out.println();
  }
}
