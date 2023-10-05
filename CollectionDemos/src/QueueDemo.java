import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> que = new PriorityQueue<Integer>();

		//Queue<Integer> que = new LinkedBlockingQueue<Integer>();
		
			que.offer(3);
			que.offer(2);
			que.offer(1);
			que.offer(4);
			
			System.out.println(que.peek());
			
			System.out.println(que);
		

	}

}
