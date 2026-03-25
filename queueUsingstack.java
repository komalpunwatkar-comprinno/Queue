import java.util.*;

public class queueUsingstack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public queueUsingstack(int val){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int val){
        stack1.push(val);
    }

    public void pop(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        System.out.println(stack2.pop());
    }

    public static void main(String [] args){
        queueUsingstack q = new queueUsingstack(5);
        q.push(2);
        q.push(4);
        q.push(6);
        q.push(8);

        q.pop(); // 2
        q.pop(); // 4
    }
}