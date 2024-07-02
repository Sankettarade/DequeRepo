package deque;

import java.util.ArrayDeque;

public class SimpleStageQueue {
   
	private ArrayDeque<Item> queue;
	
	public SimpleStageQueue()
	{
		this.queue = new ArrayDeque<>();
	}
	
	public void add(Item item)
	{
		queue.add(item);
	}
	
    public Item Remove()
    {
    	return queue.poll();
    }
    
    public boolean isEmpty()
    {
    	return queue.isEmpty();
    }
	
}
