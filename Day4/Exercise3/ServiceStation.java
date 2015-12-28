package Exercise3;

import java.util.ArrayList;
import java.util.Iterator;

public class ServiceStation{
    public static void main(String[] args){
        Person emp1 = new Employee("emp1", 26, 1234567890, 1);
        Person emp2 = new Employee("emp2", 28, 1234567890, 2);
        Person emp3 = new Employee("emp3", 30, 1234567890, 3);

        Person cust1 = new Customer("cust1", 25, 1234567890);
        Person cust2 = new Customer((Employee)emp1);

        Vehicle bus = new Bus("volvo", "white", 20000);
        Vehicle bike = new Bike("pleasure", "pink", 5000);
        Vehicle car = new Car("bmw", "black", 10000);
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(bus);
        
        Invoice invoice1 = new Invoice(cust1, bike, emp1);
        Invoice invoice2 = new Invoice(cust2, car, emp3);
        Invoice invoice3 = new Invoice(cust1, bus, emp2);
    }
    
    void displayVehicles(ArrayList<Vehicle> vehicles){
        Iterator<Vehicle> vehicleIterator = vehicles.iterator();
        while(vehicleIterator.hasNext()){
            vehicleIterator.next().displayServiceCharge();
        }
    }
}