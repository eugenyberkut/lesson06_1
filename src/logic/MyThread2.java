package logic;

/**
 * Created by Eugeny on 14.06.2015.
 */
public class MyThread2 implements Runnable{
    private String nazv;

    public MyThread2(String nazv) {
        this.nazv = nazv;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
            System.out.println(nazv + " >>> " + i);
        }
    }
}
