public class simpleQueue {

    static class queueArray{
        int [] arr;
        int front;
        int rear;
        int size;

        queueArray(int n){
            arr = new int[n];   // ✔ fixed
            front = 0;
            rear = -1;
            size = 0;
        }

        public void enqueue(int val){
            if(size == arr.length){
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear] = val;
            size++;
        }

        public void dequeue(){
            if(size == 0){
                System.out.println("There is no element to remove");
                return;
            }
            if(front == rear){
                front=0;
                rear=-1;
                size = 0;
                return;
            }
            front++;
            size--;

        }

        public void peek(){
            if(size == 0){
                System.out.println("Queue is empty");
                return;
            }

            System.err.println(arr[front]);
        }

        public void display(){
            for(int i = front; i <= rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        queueArray q = new queueArray(5);

        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(8);
        q.enqueue(10);
        q.dequeue();
        q.peek();

        q.display();   // Output: 2 4 6 8
    }
}