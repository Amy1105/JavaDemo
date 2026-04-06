public class Vehicle {
    public String brand;
    public  String color;
    public  double price;
    public int number;

    public  Vehicle(String _brand,String _color){
        brand=_brand;
        color=_color;
    }

    public  Vehicle(String _brand,String _color,double _price,int _number) {
        this(_brand,_color);
        price=_price;
        number=_number;
    }

    public  void print(){
        System.out.println(brand+","+color+","+price+","+number);
    }
}
