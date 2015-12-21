package Exercise1;
import java.util.Scanner;
import java.lang.Math;

public class CalcInterest{
  public static void main(String[] agrs){
    double p, n, r;
    Scanner s=new Scanner (System. in);
    System.out.print("Enter the amount : ");
    p=s.nextDouble( );
    System. out. print("Enter the No.of years : ");
    n=s.nextDouble( );
    System. out. print("Enter the Rate of  interest : ");
    r=s.nextDouble( );
    CalcInterest interest = new CalcInterest();
    interest.simpleInterest(p,n,r);
    interest.compoundInterest(p,n,r);
  }
  void simpleInterest(double p, double n, double r){
    double si=(p*n*r);
    System.out.println("Simple Interest="+si);
  }
  void compoundInterest(double p, double n, double r){
    double ci=p*Math.pow(1.0+r,n)-p;
    System.out. println("Compound Interest="+ci);
  }
}
