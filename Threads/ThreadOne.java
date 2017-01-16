package Threads;

import java.util.ArrayList;
import java.util.Iterator;

public class ThreadOne extends Thread {

    Cars c1 = new Cars();
    ArrayList a1 = (ArrayList) c1.addCars();


    public void run(){
        Iterator i1 = a1.iterator();

        while (i1.hasNext()) {
            System.out.println(i1.next().toString());

            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}