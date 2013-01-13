/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threading;

/**
 *
 * @author student
 */
public class MyRunnable implements Runnable {

    private final long countUntil;

    MyRunnable(long countUntil){
     this.countUntil = countUntil;
    }
    @Override
    public void run() {
       // throw new UnsupportedOperationException("Not supported yet.");

        long sum=0;
        for(long i=1; i<countUntil; i++){
            sum+=i;
        }
        System.out.println(sum);
    }


}
