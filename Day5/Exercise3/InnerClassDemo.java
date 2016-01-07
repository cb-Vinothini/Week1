package Exercise3;

import java.lang.StringBuilder;
import java.util.Iterator;

class Factorial implements Iterable{
    private int lowerLimit, upperLimit;
    private int[] factorials;

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        Iterator iterator = this.iterator();
        for(; iterator.hasNext();){
            output.append(iterator.next());
            output.append(", ");
        }
        return output.toString();
    }
    
    @Override
    public Iterator iterator(){
        return new FactorialIterator();
    }
    
    Factorial(){
        
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
        public Integer next(){
            return factorials[index++];
        }

    }
}

public class InnerClassDemo{
    public static void main(String[] args){
        int lowerLimit, upperLimit;
        lowerLimit = Integer.parseInt(args[0]);
        upperLimit = Integer.parseInt(args[1]);
        Factorial factorial = new Factorial(lowerLimit, upperLimit);
        System.out.println(factorial);
    }
}