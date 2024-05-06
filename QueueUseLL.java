package Queues;

public class QueueUseLL {
    public static void main(String[] args) throws QueueFullException {
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
        for(int i=1;i<=6;i++){
            queue.enqueue(i);
        }

        while (! queue.isEmpty()) {
            try{
            System.out.println(queue.dequeue());
            } catch(QueueEmptyException e){
                e.printStackTrace();
            }
            
        }




      
    }
    
}

    

