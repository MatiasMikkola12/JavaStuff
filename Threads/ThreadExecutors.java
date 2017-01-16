package Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadExecutors {

    public static void main(String[] args) {
        Executor anExecutor = Executors.newCachedThreadPool();
        for (int threadCnt = 0; threadCnt < 3; threadCnt++) ;
        ThreadExecutors aSillyRunnable = new ThreadExecutors();
    }
}
