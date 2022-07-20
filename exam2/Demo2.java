package exam2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo2 {

    public static void main(String[] args) {

        Worker w1 = new Worker();
        Thread t1 = new Thread(w1);

        t1.start();

        System.out.println("Drücken Sie eine Taste bzw. Eingabe um zu stoppen ...");
        if(ConsoleHelper.readLine() != null){
            w1.requestShutdown();
        }
        try{
            t1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Fertig!");
    }
}
