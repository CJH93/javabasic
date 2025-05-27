package javaStudy.day8.collection;

import java.nio.channels.AsynchronousSocketChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * FIFO(First In First Out) : 선입선출의 자료구조. 대표적인 구조 : Queue
 * LIFO(Last in First Out) : 후입선출의 자료구조. 대표적인 구조 : Stack
 * LinkedList 는 index 가 없기 때문에 index 로 순회(Iterating) 할 수 없는 구조
 * 여러 상속 관계에서 제공해주는 메서드를 이용해서 순회 할 수 있도록 해야함
 * 대표적인 메서드 isEmpty(). 자료 구조의 element 의 존재 여부를 t/false 로 리턴
 *  
 */ 

public class LinkedListEx {

	public static void main(String[] args) {
		
//		Queue<Integer> q = new LinkedList<Integer>();
//		
//		q.offer(5);
//		q.offer(4);
//		q.offer(3);
//		q.offer(2);
//		q.offer(1);

//		while(!q.isEmpty())
//		{
//			// head 에 있는 요소를 지우지 않고 리턴
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(q.poll());
//		}
		
		Stack<String> stack = new Stack<String>();
		stack.push("hi");
		stack.push("there");
		stack.push("there");
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop()); // 맨 위를 리턴시키고 지움
		}
		
		// 모든 Collection 하위 타입들은, 기본적으로 Iterator 의 하위 타입
		// 순서없이(index 없이) 요소를 순회할 수 있는 기능을 가진 interface.
		// 이것을 구현한 것은 이 타입으로 변경 가능
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("dd");
		ll.add("KK");
		ll.add("GG");
		
		for(int i = 0; i < ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}
		
		Iterator<String> it = ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}

