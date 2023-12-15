package ro.itschool.project.util.multithreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadLifecycle extends Thread {

    public static void main(String[] args) throws InterruptedException {
        ThreadLifecycle thread = new ThreadLifecycle();
        log.info("Thread state after creation: " + thread.getState());

        thread.start();
        log.info("Thread state after was created: " + thread.getState());

        Thread.sleep(2000);
        log.info("Thread state while on sleep: " + thread.getState());
    }

    @Override
    public void run() {
        try {
            log.info("The thread is running and going to sleep for 2 seconds.");
            Thread.sleep(2000);
            log.info("Thread is not sleeping.");
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }
    }
}
