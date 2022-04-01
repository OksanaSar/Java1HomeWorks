/**
*Java1Homework6
*
*@author Sarycheva Oksana
*@version 01.04.2022
*/

class Java1HomeWork6 { 
public static void main(String[] args){
        IAnimal[] animals = {
            new Cat(200, "Cat"),
            new Dog(500, 10, "Dog")
        };
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.toRun(100));
            System.out.println(animal.toRun(250));
            System.out.println(animal.toRun(550));
            System.out.println(animal.toSwim(5));
            System.out.println(animal.toSwim(20));
        }
    }
}

class Dog extends Animal {
    Dog(int maxDistRun, int maxDistSwim, String className) {
        super(maxDistRun, maxDistSwim, className);
    }
}

class Cat extends Animal {
    Cat(int maxDistRun, String className) {
        super(maxDistRun, 0, className);
    }
    
    @Override
    public String toSwim(int realDistSwim) {
        return "Cat can't swim.";
    }
}

abstract class Animal implements IAnimal {
    protected int maxDistRun;
    protected int maxDistSwim;
    protected String className;
                
    Animal(int maxDistRun, int maxDistSwim, String className) {
        this.maxDistRun = maxDistRun;
        this.maxDistSwim = maxDistSwim;
        this.className = className;
    }
        
        @Override
    public String toRun(int realDist) {
        if (realDist > maxDistRun) {
            return className + " couldn't run " + realDist + " m.";
        } else {
            return className + " ran " + realDist + " m.";
        }
    }
        
    @Override
    public String toSwim(int realDist) {
        if (realDist > maxDistSwim) {
            return className + " couldn't swim " + realDist + " m.";
        } else {
            return className + " swam " + realDist + " m.";
        }
    }
    
    @Override
    public String toString() {
        return className + ": maxDistRun - " + maxDistRun + " m, maxDistSwim - " + maxDistSwim + " m.";
    }
}

interface IAnimal {
    String toRun(int realDistRun);
    String toSwim(int realDistSwim);
}  