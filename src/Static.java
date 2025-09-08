public class Static {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 3456;
        obj1.type = "smart";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 9887;
        obj2.type = "phone";

        obj1.show();
        obj2.show();
        Mobile.show1(obj1);
    }
}

class Mobile {
    String brand;
    int price;
    static String type;

    static {
        type = "Telep";
        System.out.println("in static block");
    }

    public Mobile() {
        brand = "";
        price = 287;
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + type);
    }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + obj.type);
    }
}