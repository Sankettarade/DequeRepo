package deque;

import java.util.concurrent.TimeUnit;

public class StageProcessor implements Runnable{

	private Item item;
	private StageQueue queue;
	
	public StageProcessor(Item item, StageQueue queue)
	{
		this.item = item;
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			
			// Process item at current stage
			System.out.println("Processing item : "+item.getItemId() + " at stage : " + item.getStage());
			
			// Add item to next stage queue
			queue.add(item);
			
			// Processing time
			TimeUnit.SECONDS.sleep(1);
			
		}
		
		catch(InterruptedException e) {
				e.printStackTrace();
			}
		
	}

}
