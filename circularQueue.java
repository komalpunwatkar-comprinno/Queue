public class circularQueue {

    int[] arr;
    int front, rear, size;

    circularQueue(int n){
        arr = new int[n];
        size = n;
        front = -1;
        rear = -1;
    }

    public void enqueue(int val){
        // Full condition
        if((rear + 1) % size == front){
            System.out.println("Queue is Full");
            return;
        }

        // First element
        if(front == -1){
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        arr[rear] = val;
    }

    public void dequeue(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }
        if(front == rear){
            front = rear = -1;
            return;
        }else{
            front = (front+1)%size;
        }
    }

    public void display(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        while(true){
            System.out.print(arr[i] + " ");
            if(i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args){
        circularQueue q = new circularQueue(5);

        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(8);
        q.dequeue();

        q.display();   // 2 4 6 8
    }
}