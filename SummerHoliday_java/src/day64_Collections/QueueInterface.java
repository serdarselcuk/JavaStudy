package day64_Collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {
		/*
		 * does not have index numbers so get() method also doesn't exist
		 * has FIFO function (first in first out)
		 * 
		 */
		
//PriorityQueue
		
		Queue<Integer>q1 = new PriorityQueue<Integer>()	;
		q1.add(30);
		q1.add(20);
		q1.add(10);
		q1.add(30);
		
		System.out.println(q1);//[10, 30, 20, 30]
		// when there is a duplication it changes the place after sort them
				
		int a = q1.poll();  // FIFO: returns the first object as SAME type (un-Boxing)
		
		
		System.out.println(q1);//[20, 30, 30]
		Queue<String>q2 = new PriorityQueue<>()	;
		q2.offer("e");
		q2.offer("A");
		q2.offer("s");
		q2.offer("a");
		System.out.println(q2);			//[A, e, a, s]
		System.out.println(q2.peek());	//A
		System.out.println(q2);			//[A, e, a, s]
		System.out.println(q2.poll());	//A
		System.out.println(q2);			//[a, e, s]
//Deque
		//ArrayDeque
		
		Deque<Integer>dq=new ArrayDeque<Integer>();
		
		
		dq.add(20);
		dq.addFirst(40);
		dq.add(50);
		dq.addFirst(10);
		dq.addFirst(30);
		dq.pop();
		
		System.out.println(dq);//[[30, 10, 40, 20, 50]
		
		dq.removeFirst();	//30
		dq.removeLast();	//50
		
		System.out.println(dq.getFirst());	//10
		System.out.println(dq.getLast());	//20
		
//		LinkedList
		
		Deque<Integer>dqL=new LinkedList<Integer>();
		
		dqL.add(20);
		dqL.addFirst(40);
		dqL.add(50);
		dqL.addFirst(10);
		dqL.addFirst(30);
		dqL.pop();
		
		System.out.println(dqL);//[30, 10, 40, 20, 50]
		
		dqL.removeFirst();	//30
		dqL.removeLast();	//50
		
		System.out.println(dqL.getFirst());	//10
		System.out.println(dqL.getLast());	//20
		
		int[]arr= {1,2,3,4};
		arr[2]=4;
		System.out.println(Arrays.toString(arr));
		
		
}
}
