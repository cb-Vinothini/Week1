package Exercise5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class IncomeTaxCalculator{
    public static void main(String[] args){
        Employee emp1 = new Employee("emp1", 12345, 100000, 'F');
        Employee emp2 = new Employee("emp2", 12345, 200000, 'M');
        Employee emp3 = new Employee("emp3", 12345, 900000, 'F');
        List<Employee> emps = new ArrayList<Employee>();
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        IncomeTaxCalculator displayIncomeTax = new IncomeTaxCalculator();
        displayIncomeTax.displayAllEmp(emps);
    }
    
    static double calcTax(double income, char gender){
        double tax = 0.0;
        switch(gender){
            case 'M':
                if ((income > 180000) && (income <= 500000)) {
                    tax = (income - 180000) * 0.1;
                } else if((income > 500000) && (income <= 800000)){
                    tax = 32000.0 + (income - 500000) * 0.2;
                }
                else if((income > 800000)){
                    tax = 92000.0 + (income - 800000) * 0.3;
                }
                break;
            case 'F':
                if ((income > 190000) && (income <= 500000)) {
                    tax = (income - 190000) * 0.1;
                } else if((income > 500000) && (income <= 800000)){
                    tax = 31000.0 + (income - 500000) * 0.2;
                }
                else if((income > 800000)){
                    tax = 91000.0 + (income - 800000) * 0.3;
                }
                break;
            default:
                System.out.println("wrong gender");
        }
        return tax;
    }
    
    public void displayAllEmp(List<Employee> emps){
        for(Employee emp : emps){
            //String output = String.format("Name : %s, gender: %c panNumber : %d income: %f tax : %f \n",emp.getEmpName(), emp.getGender(), emp.getPanNumber(), emp.getIncome(), emp.getTax());
            System.out.println(emp.display());//output);
        }
    }
}

class Employee{
    private String empName;
    private int panNumber;
    private double income,tax;
    private char gender;
    public static Scanner scanner = new Scanner(System.in);
    
    Employee(String empName, int panNumber, double income, char gender){
        this.empName = empName;
        this.panNumber = panNumber;
        this.income = income;
        this.gender = gender;
        this.tax = IncomeTaxCalculator.calcTax(income, gender);
    }
    
    public void setIncome(){
        System.out.println("Enter emploee new income");
        this.income = scanner.nextDouble();
        this.tax = IncomeTaxCalculator.calcTax(income, gender);
    }
    
    public String getEmpName(){
        return empName;
    }
    
    public int getPanNumber(){
        return panNumber;
    }
    
    public double getIncome(){
        return income;
    }
    
    public char getGender(){
        return gender;
    }
    
    public double getTax(){
        return tax;
    }
    public String display(){
        String output = String.format("Name : %s, gender: %c panNumber : %d income: %f tax : %f \n",empName, gender, panNumber, income, tax);
        return output;
    }
}