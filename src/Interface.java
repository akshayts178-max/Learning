public class Interface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer ghj = new Developer();
        ghj.devApp(lap);
    }
}
