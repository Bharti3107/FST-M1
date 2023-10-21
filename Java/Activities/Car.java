package Activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyers;
    int doors;

    public Car() {
      tyers = 4;
      doors = 4;
    }

    public void displayCharacteristics()
    {
        System.out.println("Car color is:" +color);
        System.out.println("Car transmission type is:" +transmission);
        System.out.println("Car make is:" +make);
        System.out.println("Car no of tyers are:" +tyers);
        System.out.println("Car no of door is:" +doors);
    }

    public void accelarate()
    {
        System.out.println("Car is moving forward.");
    }

    public void brake()
    {
        System.out.println("Car has stopped.");
    }

}
