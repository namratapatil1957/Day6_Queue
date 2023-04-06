package com.bridgelabz.queue;

import java.util.*;

public class Queue {

	public static void main(String[] args) {
		
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n1.ENQUEUE\n2.DQUEUE\n3.EXIT");
			
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
			
			QueueOperations qe = new QueueOperations();
			
			switch (choice) {
			case 1:
				System.out.println("Enter element to push in QUEUE");
				qe.enqueue(sc.nextInt());
				break;
			
			case 2:
				qe.dequeue();
				break;
			
			case 3:
				System.out.println("Byee!!!");
				break;
				
			default:
				System.out.println("Select from menu only...");
			}
		
		} while (choice != 3);
		
	}
	
}

class QueueOperations {
	
	static int[] myQueue = new int[5];
	static int TOP = -1;
	static int rear = -1;

	boolean isFull() {
		
		return (rear >= myQueue.length - 1) ? true : false;
	}

	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("QUEUE IS FULL");
			
		} else {
			rear = rear + 1;
			myQueue[rear] = item;	
		}
	}

	public boolean isEmpty() {
		
		return (TOP == rear) ? true : false;
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("QUEUE IS EMPTY");
			
		} else {
			TOP = TOP + 1;
			System.out.println("Dequeue element is: " + myQueue[TOP]);
			myQueue[TOP] = 0;
		}
	}

}
