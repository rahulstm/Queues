package Queues;

public class QueueUse {
    public static void main(String[] args) throws QueueFullException {
        QueueUsingArray queue = new QueueUsingArray();
        for(int i=1;i<=6;i++){
            try{
            queue.enqueue(i);
            }
            catch(QueueFullException e){

            }
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
