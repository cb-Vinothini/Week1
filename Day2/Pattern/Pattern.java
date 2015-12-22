package Pattern;

public class Pattern{
  public static void main(String[] args){
    int num = Integer.parseInt(args[0]);
    Patterns pattern = new Patterns();
    pattern.printPattern(num);
  }
}
/*
*GenPattern class generats the pattern which we want to print
*/
class Patterns{
  /*
  * for the value of maxNum = 3
  * pattern will be
  *     1
  *    121
  *   12321
  */
  public void printPattern(int maxNum){
    StringBuilder linePattern = new StringBuilder();
    for(int outLoop = 0; outLoop < maxNum; outLoop++){
      int count = 1;
      for(int innerLoop = 1; innerLoop <= maxNum; innerLoop++){
        if( (outLoop + innerLoop) >= maxNum){
          linePattern = linePattern.append(count);
          count++;
        }
        else{
          linePattern = linePattern.append('*');
        }
      }
        StringBuilder original = new StringBuilder(linePattern);
      linePattern = original.append(linePattern.reverse().substring(1));
      System.out.println(linePattern);
      linePattern = new StringBuilder();
    }
  }
}
