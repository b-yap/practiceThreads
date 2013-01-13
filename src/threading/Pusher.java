/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threading;

/**
 *
 * @author student
 */
public class Pusher extends Thread {

   MyStack myStack;
   int person;
   int loopNum=0;

    public Pusher(MyStack myStack, int person){
        this.myStack = myStack;
        this.person = person;
    }
    
    public void run() {
        for(;loopNum<10;loopNum++){
            boolean check=myStack.push(loopNum);
            // System.out.println("pusher top: "+ myStack.stack[myStack.top]);
        
        if(check==false)
            System.out.println("pusher "+ person+" couldn't push "+ loopNum);
        else
            System.out.println("pusher "+ person+" pushed "+ myStack.stack[myStack.top]);
        
        }
    }

}
