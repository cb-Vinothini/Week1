package Exercise3;

public class Invoice{
    private Person customer, employee;
    private Vehicle vehicle;
    
    Invoice(Person customer, Vehicle vehicle, Person employee){
        this.customer = customer;
        this.vehicle = vehicle;
        this.employee = employee;
    }
}