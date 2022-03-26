/**
*Dz5
*
*@author Sarycheva Oksana
*@version 26.03.2022
*/

       //ДЗ5 Введение в ООП

class Java1Homework5 {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Ivanov Ivan", "engineer", "iviv@mail.ru", "89998889999", 35000, 40);
        persons[1] = new Person("Dmitriev Dmitriy", "engineer", "dmid@mail.ru", "88888889999", 35000, 34);
        persons[2] = new Person("Petrova Elena", "engineer", "petrovel@mail.ru", "87778889999", 35000, 41);
        persons[3] = new Person("Sergeev Fyodor", "engineer", "sergefy@mail.ru", "87778887777", 35000, 33);
        persons[4] = new Person("Fyodorov Sergey", "engineer", "fyodoRov@mail.ru", "87778886666", 35000, 43);
                        
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() > 40) {
            System.out.println(persons[i]);
            }
        }
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private String phNumber;
    private int salary;
    private int age;
    
    public Person (String name, String position, String email, String phNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phNumber = phNumber;
        this.salary = salary;
        this.age = age;
    }    
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return (name + ", " + position + ", " + email + ", " + phNumber + ", " + salary + ", " + age);
    }  
}