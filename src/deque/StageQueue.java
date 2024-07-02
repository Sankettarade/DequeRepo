package deque;

import java.util.Deque;
import java.util.LinkedList;

public class StageQueue {

     private Deque<Item> queue;
     
     public StageQueue() {
    	 this.queue = new LinkedList<>();
     }
	
     public void add(Item item)
     {
    	 queue.add(item);
     }
     
     public Item remove()
     {
    	 return queue.remove();
     }
     
     public boolean isEmpty()
     {
    	 return queue.isEmpty();
     }
}
