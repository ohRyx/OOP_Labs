package Lab_04;

public class Person{

    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(){

    }

    public Person(String name, int age, double height, double weight)
    {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getHeight()
    {
        return this.height;
    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getWeight()
    {
        return this.height;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }


    public void info()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height (cm): " + height);
        System.out.println("Weight (kg): " + weight);
    }
}