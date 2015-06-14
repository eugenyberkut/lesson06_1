package logic;

/**
 * Created by Eugeny on 14.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        MyThread t1 = new MyThread("first ");

//        MyThread t2 = new MyThread("second");
//        t1.start();
//        t2.start();
//        System.out.println("Hello, World!");
        MyThread2 t11 = new MyThread2("first ");
        MyThread2 t21 = new MyThread2("second");
        new Thread(t11).start();
        new Thread(t21).start();

    }
}
