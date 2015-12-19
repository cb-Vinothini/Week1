public class Pattern{
  public static void main(String[] agrs){
    int num = 5;
    GenPattern pattern = new GenPattern();
    pattern.printPattern(num);
  }
}
/*
*GenPattern class generats the pattern which we want to print
*/
class GenPattern{
  /*
  * for the value of maxNum = 3
  * pattern will be
  *     1
  *    121
  *   12321
  */
  public void printPattern(int maxNum){
    String linePattern = new String();
    for(int outLoop = 0; outLoop < maxNum; outLoop++){
      int count = 1;
      for(int innerLoop = 1; innerLoop <= maxNum; innerLoop++){
        if( (outLoop + innerLoop) >= maxNum){
          linePattern = linePattern.concat(Integer.toString(count));
          //System.out.println("check"+linePattern.concat(Integer.toString(count)));
          count++;
        }
        else{
          linePattern = linePattern.concat("*");
        }
      }
      StringBuilder reverseStr = new StringBuilder();
      reverseStr.append(linePattern);
      reverseStr = reverseStr.reverse();
      linePattern = linePattern.concat(reverseStr.toString().substring(1));
      System.out.println(linePattern);
      linePattern = "";
    }
  }
}
