public class Company extends Car {
    String company = "Tesla";
    String model = "SUV";
    double engine = 13900;
    int price = 133554;

    public void display() {
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Engine: " + engine);
        System.out.println("Price: " + price);
    }
}
