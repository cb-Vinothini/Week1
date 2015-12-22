package PrintSmallLarge;

import java.util.Scanner;

public class SmallLarge{
  public static void main(String[] args){
    System.out.print("Enter the size : ");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    System.out.print("Enter the array elements : ");
    int[] intArr = new int[size];
    for(int index=0;index<size;index++){
      intArr[index] = scanner.nextInt();
    }
    int min, max;
    min=max=intArr[0];
    for(int index=1; index<size; index++){
      if(min>intArr[index]){
        min=intArr[index];
      }
      if(max<intArr[index]){
        max=intArr[index];
      }
    }
      String output = String.format("min and max are : %d %d \n",min,max);
    System.out.print(output);
  }
}
