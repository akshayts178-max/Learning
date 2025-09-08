public class Hello {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 0b101;

        byte by = 127;
        byte y = 70;
        int result = by + y;

        byte k = (byte) num1;
        short sh = 558;
        long l = 54648l;

        float f = 5.8f;
        int t = (int) f;
        double d = 5.87;

        char c = 'n';
        c++;

        boolean b = true;

        double result1 = num1 + d;
        System.out.println("Hello everyone!");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(num2);
        System.out.println(k);
        System.out.println(c);
        System.out.println(t);
    }
}
