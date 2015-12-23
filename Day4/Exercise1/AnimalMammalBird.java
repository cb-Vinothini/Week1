package Exercise1;

import java.util.Scanner;
import java.util.ArrayList;

public class AnimalMammalBird{
    public static void main(String[] args){
        ArrayList<Animals> animals = new ArrayList<Animals>();
        Factory factory = new Factory();
        String category = new String();
        while(true){
            System.out.print("Do you want to continue Y/N ? : ");
            Scanner scanner = new Scanner(System.in);
            char choice = scanner.next().charAt(0);
            if(choice == 'Y'){
                System.out.print("Create bat, dog, cow, ostrich, parrot : ");
                category = scanner.next();
                animals.add(factory.getAnimal(category));
            }
            else{
                break;
            }
        }
        
        System.out.println("------------list of all animals---------");
        Animals.displayAnimals(animals);
        
        System.out.println("-------------list of animals that can fly---------");
        Animals.displayCanFly(animals);
        
        System.out.println("---------list of animalc that are herbivores---------");
        Animals.displayHerbivores(animals);
        
    }
    
    
}

class Factory{
    public Animals getAnimal(String type){
        if(type.equals("bat")){
            return new Bat();
        }
        else if(type.equals("dog")){
            return new Dog();
        }
        else if(type.equals("cow")){
            return new Cow();
        }
        else if(type.equals("ostrich")){
            return new Ostrich();
        }
        else if(type.equals("parrot")){
            return new Parrot();
        }
        return null;
    }
}

interface CanFly{
    // tag the object that can fly
}

interface Herbivores{
    // tag the objects that are herbivores
}

abstract class Animals{
    public abstract void movement();
    
    public static void displayAnimals(ArrayList<Animals> animals){
        for(Animals eachAnimal : animals){
            eachAnimal.movement();
        }
    }
    
    public static void displayCanFly(ArrayList<Animals> animals){
        for(Animals eachAnimal : animals){
            if(eachAnimal instanceof CanFly){
                eachAnimal.movement();
            }
        }
    }

    public static void displayHerbivores(ArrayList<Animals> animals){
        for(Animals eachAnimal : animals){
            if(eachAnimal instanceof Herbivores){
                eachAnimal.movement();
            }
        }
    }
}
abstract class Mammals extends Animals{
    // Mammals
}

abstract class Birds extends Animals{
    // Birds
}

class Bat extends Mammals implements CanFly{
    @Override
    public void movement(){
        System.out.println("bat is a mammal which can fly");
    }
}

class Dog extends Mammals implements Herbivores{
    @Override
    public void movement(){
        System.out.println("dog is a mammal which is a Herbivores and they walk");
    }
}

class Cow extends Mammals implements Herbivores{
    @Override
    public void movement(){
        System.out.println("cow is a mammal which is a Herbivores and they walk");
    }
}

class Ostrich extends Birds implements Herbivores{
    @Override
    public void movement(){
        System.out.println("ostrich is a bird which is a Herbivores and they walk");
    }
}

class Parrot extends Birds implements CanFly, Herbivores{
    @Override
    public void movement(){
        System.out.println("parrot is a bird which is a Herbivores and can Fly");
    }
}