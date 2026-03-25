public class queueLinkedlist {

    class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }

    Node front = null;
    Node rear = null;
    
    public void enqueue(int val){
        Node newnode = new Node(val);
        if(rear == null){
            front = rear = newnode;
            return;
        }
        rear.next = newnode;
        rear = newnode;
    }

    public void dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        
        front = front.next;

        if (front == null){
            rear = null;
        }
    }

    public void peek(){
        if(rear == null){
            return;
        }
        System.out.println(front.data);
    }

    public void display(){
        if (rear == null) {
            return;
        }
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String [] args){
        queueLinkedlist l = new queueLinkedlist();
        l.enqueue(2);
        l.enqueue(4);
        l.enqueue(6);
        l.enqueue(8); 
        l.dequeue();
        l.peek();
        l.display();
    }
    
}
