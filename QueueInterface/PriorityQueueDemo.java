package com.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> q1 = new PriorityQueue<String>();
		q1.add("Cinderella");
		q1.add("Beauty and the Beast");
		q1.add("Snow White and the Seven Dwarfs");
		q1.add("Frozen");
		q1.offer("Moana");
		q1.offer("The Little Mermaid");
		System.out.println(q1);
		
		//It will give the head element of the queue and will remove the head element from queue.If queue is empty then it will throw an Exception
		System.out.println(q1.remove());
		System.out.println(q1);
		
		//It will give the head element of the queue. If queue is empty then it will return null
		System.out.println(q1.peek());
		System.out.println(q1);
		
		//It will give the head element of the queue and will remove the head element from queue. If queue is empty the it will return null
		System.out.println(q1.poll());
		System.out.println(q1);
		
	}

}
