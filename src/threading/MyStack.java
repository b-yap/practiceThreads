/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threading;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class MyStack {

    int stack[];
    int top;
    int max;
    public MyStack(int size){
        stack = new int[size];
        top=max=size;

    }
    public synchronized boolean push(int toPush)
    {
        boolean status = false;
        if(this.top>0)
        {stack[--this.top]=toPush;
         status=true;
        }
        
        return status;
    }
    
    public synchronized int pop()
    {      
        int popped=(-1);
       
        if(this.top<this.max)
        {  
            popped = stack[this.top];
           ++this.top;
        }
        
        return popped;
    }


}
