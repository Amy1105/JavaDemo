public class Car extends Vehicle {

    public float speed;

    public Car(String b, String c, double p, int n, float s) {
        super(b, c, p, n);
        speed = s;
    }
    public  void print(){
        System.out.println(brand+","+color+","+price+","+number+","+speed);
    }
}