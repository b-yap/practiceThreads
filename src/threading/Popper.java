/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threading;

/**
 *
 * @author student
 */

public class Popper extends Thread {
    private MyStack myStack;
    public Popper(MyStack stack){
        this.myStack=stack;
    }

    public void run() {
       while(myStack.top<myStack.max)
       {
        System.out.println("Popped "+ myStack.pop());
       }
       }
 }


