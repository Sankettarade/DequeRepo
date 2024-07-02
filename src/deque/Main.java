package deque;

public class Main {

	public static void main(String[] args) {
		
		MultiStageProcessor processor = new MultiStageProcessor(4);
		
		// Create items with different priorities and stages
		Item item1 = new Item(1, 1, 4, "Item One");
		Item item2 = new Item(2, 1, 1, "Item Two");
		Item item3 = new Item(3, 2, 5, "Item Three");
		Item item4 = new Item(4, 3, 1, "Item Four");

		// Submit items for processing
		processor.process(item1);
		processor.process(item2);
		processor.process(item3);
		processor.process(item4);
		
		// ShutDown the processor
		processor.shutDown();
	}

}
