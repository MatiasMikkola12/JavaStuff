package Threads;

public class ThreadMain {

    public static void main(String[] args) {

        ThreadOne runCar = new ThreadOne();
        ThreadOne runCar2 = new ThreadOne();
        ThreadOne runCar3 = new ThreadOne();
        ThreadOne runCar4 = new ThreadOne();

        runCar.start();
        runCar2.start();
        runCar3.start();
        runCar4.start();

    }
}
