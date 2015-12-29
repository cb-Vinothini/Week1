package Exercise3;

import java.lang.StringBuilder;

interface Iterator{
    boolean hasNext();
    int next();
}

interface Iterable{
    Iterator iterator();
}

class Factorial implements Iterable{
    private int lowerLimit, upperLimit;
    private int[] factorials;

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        for(int index = 0; index < factorials.length; index++){
            output.append(factorials[index]);
            output.append(", ");
        }
        return output.toString();
    }
    
    @Override
    public Iterator iterator(){
        return new FactorialIterator();
    }
    
    Factorial(int lowerLimit, int upperLimit){
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        factorials = new int[upperLimit - lowerLimit + 1];
        int temp = 1;
        for(int index = 1; index <= upperLimit; index++){
            temp *= index;
            if(index>= lowerLimit){
                factorials[index - lowerLimit] = temp;
            }
        }
    }
    
    class FactorialIterator implements Iterator{
        private int index = 0;
        
        @Override
        public boolean hasNext(){
            return (index < factorials.length);
        }
        
        @Override
        public int next(){
            return factorials[index++];
        }

    }
}

public class InnerClassDemo{
    public static void main(String[] args){
        Factorial factorial = new Factorial(1,4);
        System.out.println(factorial.toString());
    }
}