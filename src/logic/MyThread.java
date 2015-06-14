package logic;

/**
 * Created by Eugeny on 14.06.2015.
 */
public class MyThread extends Thread {
    private String nazv;

    public MyThread(String nazv) {
        this.nazv = nazv;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
            System.out.println(nazv + " >>> " + i);
        }
    }
}
