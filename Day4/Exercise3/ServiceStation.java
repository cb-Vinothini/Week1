package Exercise3;

import java.util.ArrayList;
import java.util.Iterator;

public class ServiceStation{
    public static void main(String[] args){
        Person emp1 = new Employee("emp1", 26, 1234567890, 1);
        Person emp2 = new Employee("emp2", 28, 1234567890, 2);
        Person emp3 = new Employee("emp3", 30, 1234567890, 3);
        ArrayList<Person> employee = new ArrayList<Person>();
        employee.add(emp1);
        employee.add(emp2);
        employee.add(emp3);

        Person cust1 = new Customer("cust1", 25, 1234567890);
        Person cust2 = new Customer((Employee)emp1);
        ArrayList<Person> customer = new ArrayList<Person>();
        customer.add(cust1);
        customer.add(cust2);

        Vehicle bus = new Bus("volvo", "white", 20000);
        Vehicle bike = new Bike("pleasure", "pink", 5000);
        Vehicle car = new Car("bmw", "black", 10000);
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(bus);
        
        Invoice invoice1 = invoiceFactory.getInstanceInvoice(cust1, bike, emp1);
        System.out.println("point");
        Invoice invoice2 = invoiceFactory.getInstanceInvoice(cust2, car, emp3);
        Invoice invoice3 = invoiceFactory.getInstanceInvoice(cust1, bus, emp2);
        
        ServiceStation.displayVehicles(vehicles);
        ServiceStation.displayEmployee(employee);
        ServiceStation.displayCustomer(customer);
    }
    
    static void displayVehicles(ArrayList<Vehicle> vehicles){
        Iterator<Vehicle> vehicleIterator = vehicles.iterator();
        while(vehicleIterator.hasNext()){
            vehicleIterator.next().displayServiceCharge();
        }
    }
    
    static void displayEmployee(ArrayList<Person> employees){
        for(Person employee: employees){
            employee.displayInvoice();
        }
    }

    static void displayCustomer(ArrayList<Person> customers){
        for(Person customer: customers ){
            customer.displayInvoice();
        }
    }

}

class invoiceFactory{
    public static Invoice getInstanceInvoice(Person customer, Vehicle vehicle, Person employee){
        Invoice invoice = new Invoice(customer, vehicle, employee);
        customer.addInvoice(invoice);
        employee.addInvoice(invoice);
        return invoice;
    }
}