package Exercise3;

abstract public class Vehicle{
  private String brand, color;
  private int serviceCharge;
    
  Vehicle(String brand, String color, int serviceCharge){
    this.brand = brand;
    this.color = color;
    this.serviceCharge = serviceCharge;
  }
    public int getServiceCharge(){
        return serviceCharge;
    }
    
    abstract void displayServiceCharge();
}

class Car extends Vehicle{
  Car(String brand, String color, int serviceCharge){
    super(brand, color, serviceCharge);
    System.out.println("Car object created");
  }
    
    @Override
    public void displayServiceCharge(){
        System.out.println("Service Charge for car is : "+ getServiceCharge());
    }
}

class Bike extends Vehicle{
  Bike(String brand, String color, int serviceCharge){
    super(brand, color, serviceCharge);
    System.out.println("Bike object created");
  }

    @Override
    public void displayServiceCharge(){
        System.out.println("Service Charge for bike is : "+ getServiceCharge());
    }
}

class Bus extends Vehicle{
  Bus(String brand, String color, int serviceCharge){
    super(brand, color, serviceCharge);
    System.out.println("Bus object created");
  }
    
    @Override
    public void displayServiceCharge(){
        System.out.println("Service Charge for bus is : "+ getServiceCharge());
    }
}
