package Exercise3;

import java.util.ArrayList;

abstract public class Person{
    private String name;
    private int age, contactNo;
    private ArrayList<Invoice> invoices;
    
    Person(){
        
    }
    
    Person(String name, int age,int contactNo){
        this.name = name;
        this.age = age;
        this.contactNo = contactNo;
        invoices = new ArrayList<Invoice>();
    }

    public void addInvoice(Invoice invoice){
        invoices.add(invoice);
    }
    
    public void displayInvoice(){
        for(Invoice invoice: invoices){
            invoice.display();
        }
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }

    public int getContactNo(){
        return contactNo;
    }
    
}

class Employee extends Person{
    private int empId;

    Employee(String name, int age, int contactNo,int empId){
        super(name, age, contactNo);
        this.empId = empId;
    }
    
    public void displayEmployee(){
        String output = String.format("Employee name: %s, age: %d, ph no: %d, ID: %d", super.getName(), super.getAge(), super.getContactNo(), empId);
    }
}

class Customer extends Person{
  private Employee emp;

    Customer(String name, int age, int contactNo){
        super(name, age, contactNo);
        this.emp = null;
    }
    
    Customer(Employee emp){
        this.emp = emp;
    }

    public void displayCustomer(){
        String output;
        System.out.println("Customer");
    }
}
