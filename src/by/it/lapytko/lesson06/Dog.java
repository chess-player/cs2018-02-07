package by.it.lapytko.lesson06;

public class Dog {
    private int age;
    private String name;
    private double weight;
    private double power;

    public Dog(double weight,double power) {
        this.weight=weight;
        this.power=power;
    }

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public Dog(){


    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Кличка:"+" " + getName()+"."+" " + "Возраст:" +" "+ getAge();
    }
    public boolean win(Dog otherdog){
        double myChance=0.2*age+0.3*this.weight+0.5*this.power;
        double OtherChance=0.2*age+0.3*this.weight+0.5*this.power;
        if (myChance>OtherChance) return true;
        else return false;
    }
}
