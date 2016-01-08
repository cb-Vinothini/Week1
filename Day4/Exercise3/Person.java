package Exercise3;

import java.util.ArrayList;
import java.util.List;

abstract public class Person{
    String name;
    private int age, contactNo;
    private List<Invoice> invoices = new ArrayList<Invoice>();
    
    Person(){
        
    }
    
    Person(String name, int age,int contactNo){
        this.name = name;
        this.age = age;
        this.contactNo = contactNo;
    }

    public void addInvoice(Invoice invoice){
        invoices.add(invoice);
    }
    
    public void displayInvoice(){
        for(Invoice invoice: invoices){
            //invoice.display();
            String output = String.format("emp name: %s, Service charge : %d, cust name : %s",invoice.getEmployee().getName(), invoice.getVehicle().getServiceCharge(),invoice.getCustomer().getName());
            System.out.println(output);
        }
    }
    
    abstract String getName();
    
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
        String output = String.format("Employee name: %s, age: %d, ph no: %d, ID: %d", name, super.getAge(), super.getContactNo(), empId);
        System.out.println(output);
    }

    public String getName(){
        return super.name;
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
        if(emp == null){
            String output = String.format("Customer name: %s, age: %d, ph no: %d, Is he employee ? : %d", name, super.getAge(), super.getContactNo(), emp);
            System.out.println(output);
        }
        else{
            System.out.println("Customer who is a employee");
            emp.displayEmployee();
        }
    }

    public String getName(){
        if(emp == null)
            return super.name;
        else
            return emp.getName();
    }

}
