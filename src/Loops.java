public class Loops {
    public static void main(String[] args) {
        int i = 0;
        char c = 'A';
        int rows = 4;

        while (i <= 7) {
            System.out.println(i + " " + c);
            c++;
            i++;
        }
        System.out.println("Thank you! " + i);

        int j = 1;
        do {
            System.out.println("ley's think!");
            j++;
        } while (j < 1);


        for (int a = 0; a <= rows; a++) {
            for (int b = a; b < rows; b++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * a - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int t = 1; t <= 2; t++) {
            for (int s = 1; s < rows; s++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
