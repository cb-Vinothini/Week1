package Exercise1;

import java.util.Random;

abstract class Mobile{
    private String name;
    public int remainingCharge;
    
    public Mobile(String name){
        this.name = name;
    }
    
    public abstract void remainingCharge();
    
    public void print(){
        String output = String.format("Name: %s, Remaning Charge: %d \n",name,remainingCharge);
        System.out.print(output);
    }
}

public class Mobiles{
    public static void main(String[] args){
        Mobile nokia = new Mobile("NOKIA"){
            @Override
            public void remainingCharge(){
                Random random = new Random();
                remainingCharge = random.nextInt(100);
            }
            
            public void show(){
                System.out.println("show");
            }
        };
        
        Mobile samsung = new Mobile("SAMSUNG"){
            @Override
            public void remainingCharge(){
                Random random = new Random();
                remainingCharge = random.nextInt(100);
            }
        };

        nokia.print();
        nokia.show();
        
        samsung.print();
    }
}