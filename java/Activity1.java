public class Activity1 {
    public static void main(String[] args) {
        car mycar=new car();
        mycar.make=2015;
        mycar.color="Red";
        mycar.transmission="Automatic";

        mycar.show();
        mycar.accelerate();
        mycar.brake();
    }
}
