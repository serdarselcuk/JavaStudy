package day64_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {
		/*
		 * does not have index numbers so get() method also doesn't exist
		 * has FIFO function (first in first out
		 * 
		 */
	
		Queue<Integer>q1 = new PriorityQueue<Integer>()	;
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(10);
		
		System.out.println(q1);//[10, 10, 30, 20]
		// when there is a duplication it changes the place after sort them
				
		int a = q1.poll();  // FIFO: returns the first object as SAME type (un-Boxing)
		
		
		System.out.println(q1);//[10, 20, 30]
		
//Deque
		
		Deque<Integer>dq=new ArrayDeque<Integer>();
		
		dq.add(20);
		dq.addFirst(40);
		dq.add(50);
		dq.addFirst(10);
		dq.addFirst(30);
		
		System.out.println(dq);//[[30, 10, 40, 20, 50]
		
		dq.removeFirst();	//30
		dq.removeLast();	//50
		
		System.out.println(dq.getFirst());	//10
		System.out.println(dq.getLast());	//20
		
		
}
}
