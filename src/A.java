public class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
