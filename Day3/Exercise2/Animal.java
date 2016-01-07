package Exercise2;

import java.util.Scanner;
import java.util.ArrayList;

public class Animal{
    static int countAnimals;
    int numberOfLegs;
    String name;
    public Animal(int numberOfLegs, String name){
        this.numberOfLegs = numberOfLegs;
        this.name = name;
        countAnimals++;
    }

    public void displayCount(){
        System.out.println("Number of Animals Created : "+countAnimals);
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char choice;
        ArrayList<Animal> animals = new ArrayList<Animal>();
        while(true){
            System.out.print("do you want to create animals y/n :");
            choice = scanner.next().charAt(0);
            if(choice == 'y'){
                System.out.print("Enter animal name and number of legs : ");
                String name = scanner.next();
                int legs = scanner.nextInt();
                Animal animal = new Animal(legs, name);
                animals.add(animal);
                animal.displayCount();
                
            }
            else{
                System.out.println("exit");
                break;
            }
        }
    }
}