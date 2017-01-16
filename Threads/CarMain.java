package Threads;

import java.util.ArrayList;

public class CarMain {

    public static void main(String[] args) {

        CarRunnable runCar = new CarRunnable();
        CarRunnable runCar2 = new CarRunnable();
        CarRunnable runCar3 = new CarRunnable();
        CarRunnable runCar4 = new CarRunnable();

        ArrayList<Runnable> cars =  new ArrayList<>();

        cars.add(runCar);
        cars.add(runCar2);
        cars.add(runCar3);
        cars.add(runCar4);

        for (int i = 0; i < cars.size(); i++) {
            Thread carThread = new Thread(cars.get(i));
            carThread.start();

        }
    }
}
