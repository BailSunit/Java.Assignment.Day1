package collection.demo.list;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Addition {

	public static void main(String [] args) {
		List<Double> numbersArrayList = new ArrayList<>();
		List<Double> numbersLinkedList = new LinkedList<>();
		
		Double sumArrayList = 0.0;
		Double sumLinkedList = 0.0;
		
		int i;
		
		Instant startArrayList = Instant.now();
		for( i = 0; i < 10000000 ; i++ ) {
			numbersArrayList.add(Math.random());
			sumArrayList += numbersArrayList.get(i);
		}
		Instant endArrayList = Instant.now();
		System.out.println("Time taken to add 10000000 numbers stored in ArrayList is : " + Duration.between(startArrayList,endArrayList).toMillis() + " milliseconds");
		
		Instant startLinkedList = Instant.now();
		for( i = 0; i < 10000000 ; i++ ) {
			numbersLinkedList.add(Math.random());
			sumLinkedList += numbersLinkedList.get(i);
		}
		Instant endLinkedList = Instant.now();
		System.out.println("Time taken to add 10000000 numbers stored in LinkedList is : " + Duration.between(startLinkedList,endLinkedList).toMillis() + " milliseconds");
	}
}
