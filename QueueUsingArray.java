package Queues;

public class QueueUsingArray {

    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray(){
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }

    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    int size(){
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }

    int front() throws QueueEmptyException{
        if(size==0){
            throw new QueueEmptyException();
        }
        return data[front];
    }
    void enqueue(int element) throws QueueFullException{

        if(size == data.length){
            throw new QueueFullException();
        }
        if(size==0){
            front = 0;
        }

        
        size++;
       // rear = rear%data.length;  // it values lies between 0 to data.length-1
        rear++;
        if(rear == data.length){
            rear = 0;   
        }
        data[rear] = element;
    }

        int dequeue() throws QueueEmptyException{

            if(size==0){
                throw new QueueEmptyException();
            }
            int temp = data[front];
           //  front = (front + 1)%data.length;

            front++;
            if(front == data.length){
                front = 0;
            }
            size--;

        if(size==0){
            front = -1;
            rear = -1;
        }

            return temp;

        }



    }
    

