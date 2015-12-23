package Exercise2;

public class MyOwnAutoShop{
    public static void main(String[] args){
        Sedan sedan = new Sedan(200, 1000000, "Black", 30);
        Ford ford1 = new Ford(120, 500000, "Red", 2014, 20000);
        Ford ford2 = new Ford(160, 600000, "White", 2015, 40000);
        
        Car car = new Car(200, 1000000, "Black");
        
        System.out.println(sedan.getSalePrice());
        System.out.println(ford1.getSalePrice());
        System.out.println(ford2.getSalePrice());
        System.out.println(car.getSalePrice());
    }
}

class Car{
    private int speed;
    protected double regularPrice;
    private String color;
    
    Car(int speed, double regularPrice, String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    
    public double getSalePrice(){
        return regularPrice;
    }
}

class Truck extends Car{
    private int weight;
    
    Truck(int speed, double regularPrice, String color, int weight){
        super(speed,regularPrice,color);
        this.weight = weight;
    }
    
    @Override
    public double getSalePrice(){
        if(weight > 2000){
            System.out.println("10% discount");
            double price = super.regularPrice - super.regularPrice*0.1;
            return price;
        }
        else{
            System.out.println("20% discount");
            double price = super.regularPrice - super.regularPrice*0.2;
            return price;
        }
    }
}

class Ford extends Car{
    private int year;
    private int manufacturerDiscount;
    
    Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount){
        super(speed,regularPrice,color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    
    @Override
    public double getSalePrice(){
        double price = super.getSalePrice() - manufacturerDiscount;
        return price;
    }
}

class Sedan extends Car{
    private int length;
    
    Sedan(int speed, double regularPrice, String color, int length){
        super(speed,regularPrice,color);
        this.length = length;
    }
    
    @Override
    public double getSalePrice(){
        if(length> 20){
            System.out.println("5% discount");
            double price = super.regularPrice - super.regularPrice*0.05;
            return price;
        }
        else{
            System.out.println("10% discount");
            double price = super.regularPrice - super.regularPrice*0.1;
            return price;
        }
    }
}