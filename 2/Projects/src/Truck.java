public class Truck extends  Vehicle {
    private float speed;
    private int weight;

    public Truck(String b, String c, double p, int n, float s, int w) {
        super(b, c, p, n);
        speed = s;
        weight = w;
    }

    public void print() {
        System.out.println(brand + "," + color + "," + price + "," + number + "," + speed + "," + weight);
    }
}