public class car{
    int make;
    String color;
    String transmission;
    int doors;
    int tyres;

    car(){
        doors=4;
        tyres=4;
    }
    public void show(){
        System.out.println("Car make:"+make);
        System.out.println("Car color"+color);
        System.out.println(""+transmission);
        System.out.println(doors);
        System.out.println(tyres);
    }
    public void accelerate(){
        System.out.println("Car is moving");

    }
    public void brake(){
        System.out.println("car has stopped");
    }

}
