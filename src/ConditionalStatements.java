public class ConditionalStatements {
    public static void main(String[] args) {
        double temp = 22.5;
        double act = 20;


        if (temp > 20 && act > 25) {
            System.out.println("Its warm!");
        } else if (temp < 20 && act < 25) {
            System.out.println("Its cold!");
        } else {
            System.out.println("what is the temp!");
        }

        String result = (temp >= 20 ? "Drink water!" : "Ohh nice!");
        System.out.println(result);
    }
}
