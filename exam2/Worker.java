package exam2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class Worker implements Runnable {
    private int sleepInterval = 1000;
    Thread thread = new Thread();
    private boolean isRunning = true;

    public void requestShutdown() {
        isRunning = false;
    }


    @Override
    public void run() {
        while (isRunning) {
            Date currentDate = new Date();
            System.out.println(currentDate.toString());
            try {
                Thread.sleep(sleepInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



