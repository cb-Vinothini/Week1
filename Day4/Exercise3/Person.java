package Exercise3;

abstract public class Person{
  private String name;
  private int age, contactNo;

    Person(){
        
    }
    
    Person(String name, int age,int contactNo){
    this.name = name;
    this.age = age;
    this.contactNo = contactNo;
  }
}

class Employee extends Person{
    private int empId;

    Employee(String name, int age, int contactNo,int empId){
        super(name, age, contactNo);
        this.empId = empId;
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
}
