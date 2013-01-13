/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */

        private static final int NTHREDS=10;

    public static void main(String[] args) {
        // TODO code application logic here
     /*  List<Thread> threads = new ArrayList<Thread>();

        for(int i=0; i<500;i++){
        Runnable task = new MyRunnable(10000000000L +i);
        Thread worker = new Thread(task);
        worker.setName(String.valueOf(i));
        worker.start();
        threads.add(worker);
        }

        int running=0;
        do{
        running=0;
            for(Thread thread:threads){
                if(thread.isAlive()){
                running++;
                }

            }
            System.out.println("We have "+running+" running threads");
        }while(running>0);
        */
       
       /* ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
        for(int i=0; i<500;i++){
        Runnable worker= new MyRunnable(10000000L+i);
        executor.execute(worker);
        }
        executor.shutdown();
        while(!executor.isTerminated()){
        }
        System.out.println("Finished all threads"); */

        
        
         List<Thread> threads = new ArrayList<Thread>();
         MyStack myStack = new MyStack(15);

        for(int i=0; i<2;i++){
        Runnable task = new Pusher(myStack,i);
        Thread worker = new Thread(task);
        worker.setName(String.valueOf(i));
        worker.start();
        threads.add(worker);
        }
          for(int i=0; i<1;i++){
        Runnable task = new Popper(myStack);
        Thread worker = new Thread(task);
        worker.setName(String.valueOf(i));
       worker.start();
        threads.add(worker);
        }

       
//
//        int running=0;
//        do{
//        running=0;
//            for(Thread thread:threads){
//                if(thread.isAlive()){
//                running++;
//                }
//
//            }
//            System.out.println("We have "+running+" running threads");
//        }while(running>0);

    }

}
