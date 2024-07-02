package deque;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiStageProcessor {

	private ExecutorService executorService;
	
	public MultiStageProcessor(int numThreads)
	{
		this.executorService = Executors.newFixedThreadPool(numThreads);
	}
	
	public void process(Item item)
	{
		executorService.submit(new StageProcessor(item, new StageQueue()));
	}
	public void shutDown()
	{
		executorService.shutdown();
	}
	
}
