package Exercise2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employees{
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<Employee>();
        
        Employee emp1 = new Employee("abc",100000, 30);
        Employee emp2 = new Employee("xyz",90000, 29);
        Employee emp3 = new Employee("lmn",140000, 46);
        Employee emp4 = new Employee("efg",1000000, 22);
        Employee emp5 = new Employee("sdk",50000, 40);
        
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        
        System.out.println("Before sorting the array");
        for(Employee emp : employees){
            emp.print();
        }
        
        System.out.println("\nSorting based on age");
        Collections.sort(employees, new Comparator<Employee>(){
            public int compare(Employee emp1, Employee emp2){
                return ( emp1.getAge() > emp2.getAge() ) ? 1 : ( emp1.getAge() < emp2.getAge() ) ? -1 : 0;
            }
        });
        for(Employee emp : employees){
            emp.print();
        }
        
        System.out.println("\nSorting based on salary");
        Collections.sort(employees, new Comparator<Employee>(){
            public int compare(Employee emp1, Employee emp2){
                return ( emp1.getSalary() > emp2.getSalary() ) ? 1 : ( emp1.getSalary() < emp2.getSalary() ) ? -1 : 0;
            }
        });
        for(Employee emp : employees){
            emp.print();
        }
        
        System.out.println("\nSorting based on name");
        Collections.sort(employees, new Comparator<Employee>(){
            public int compare(Employee emp1, Employee emp2){
                return emp1.getName().compareTo(emp2.getName());
            }
        });
        for(Employee emp : employees){
            emp.print();
        }
    }
}

class Employee{
    private String name;
    private int salary, age;
    
    public String getName(){
        return name;
    }
    
    public int getSalary(){
        return salary;
    }
    
    public int getAge(){
        return age;
    }
    
    Employee(String name, int salary, int age){
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    
    public void print(){
        String output = String.format("Name : %s, salary : %d, age : %d \n", name, salary, age);
        System.out.print(output);
    }
}