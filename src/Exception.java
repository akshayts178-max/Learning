public class Exception {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try {
            j = 18/i;
            if (j == 0) {
                throw new MyException("Idont want to print zero");
            }
//            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[3]);
        } catch (MyException e) {
            System.out.println("Something went wrong! " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in limit!");
        } catch (java.lang.Exception e) {
            System.out.println("Something went wrong! " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
