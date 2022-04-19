/**
*Java1Homework7
*
*@author Sarycheva Oksana
*@version 19.04.2022
*/

class Java1HomeWork7 {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Barsik", 40), new Cat("Murzik", 20), new Cat("Vasiliy", 15),
            };
            Plate plate = new Plate(100, 80);
            System.out.println(plate);
            
            //feeding cats for the first time
            for (Cat cat : cats) {
                cat.eat(plate);
                System.out.println(cat);
            }
            
            //adding food to the plate
            System.out.println(plate);
            plate.add(40);
            System.out.println(plate);
            
            //feeding cats second time
            for (Cat cat : cats) {
                cat.setFullness(false);//make the cats hungry before 2nd feeding
                cat.eat(plate);
                System.out.println(cat);
            }
            System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;//ability to eat for one time
    private boolean fullness;//satiety status
    
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }
    
    void setFullness (boolean status) {
        fullness = status;
    }
    
    void eat (Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }
    
    @Override
    public String toString () {
        return "name =" + name + " , appetite = " + appetite + " , fullness =" + fullness;
    }
}

class Plate {
    private int maxVolume;
    private int food;
    
    Plate (int maxVolume, int food) {
        this.maxVolume = maxVolume;
        this.food = food;
    }
    boolean decreaseFood (int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }
    
    void add (int food) {
        if (this.food + food <= maxVolume) {
            this.food += food;
        }
    }
    
    @Override
    public String toString () {
        return "plate: " + food;
    }
}