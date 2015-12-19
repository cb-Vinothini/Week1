import java.util.Scanner;

public class Rotation{
  public static void main(String[] args){
    MatrixOperation matrix = new MatrixOperation();
    matrix.display();
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter L - to rotate left  or R - to rotate right : ");
    String rotate = scanner.next();
    switch(rotate){
      case "L":
        matrix.rotateLeft();
        matrix.display();
        break;
      case "R":
        matrix.rotateRight();
        matrix.display();
        break;
      default:
        System.out.println("invalid input");
    }
  }
}

class MatrixOperation{
  int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
  int row = 3, col = 3;
  void transpose(){
    for (int out = 0; out < row ; out++) {
      for (int in = out; in < col; in++) {
        int temp = mat[out][in];
        mat[out][in] = mat[in][out];
        mat[in][out] = temp;
      }
    }
  }
  void swap(){
    for (int  front = 0, back = col - 1; front < back; ++front, --back) {
      int[] temp = mat[front];
      mat[front] = mat[back];
      mat[back] = temp;
    }
  }
  public void rotateLeft(){
    transpose();
    swap();
  }
  public void rotateRight(){
    swap();
    transpose();
  }
  void display(){
    for(int outter = 0; outter<row; outter++){
      for(int inner = 0; inner<col; inner++){
        System.out.print(mat[outter][inner]+" ");
      }
      System.out.println();
    }
  }
}
