package deque;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentStageQueue {

	private ConcurrentLinkedDeque<Item> queue;
	
	public ConcurrentStageQueue()
	{
		this.queue = new ConcurrentLinkedDeque<>();
	}
	
	public void add(Item item)
	{
		queue.add(item);
	}
	
	public Item remove()
	{
		return queue.poll();
	}
	
	public boolean isEmpty()
	{
		return queue.isEmpty();
	}
}
