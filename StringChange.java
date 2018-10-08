package collection.demo.list;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringChange {

	public static void main(String[] args) {
		
		List<String> stringArrayList = new ArrayList<>();
		List<String> stringLinkedList = new LinkedList<>();
		
		int i;
		
		for(i=0;i<10000;i++) {
			stringArrayList.add("String"+i);
		}
		
		for(i=0;i<10000;i++) {
			stringLinkedList.add("String"+i);
		}
		
		Instant startArrayList = Instant.now();
		for(i=0;i<500;i++) {
			stringArrayList.remove(i);
		}
		for(i=0;i<15000;i++) {
			stringArrayList.add("Addition"+i);
		}
		Instant endArrayList = Instant.now();
		
		Instant startLinkedList = Instant.now();
		for(i=0;i<500;i++) {
			stringLinkedList.remove(i);
		}
		for(i=0;i<15000;i++) {
			stringLinkedList.add("Addition"+i);
		}
		Instant endLinkedList = Instant.now();
		
		System.out.println("Process : To ArrayList and LinkedList, add 10000 Strings, remove 500 and add 15000 and compare. ");
		System.out.println("For ArrayList : " + Duration.between(startArrayList,endArrayList));
		System.out.println("For LinkedList : " + Duration.between(startLinkedList,endLinkedList));
	}

}
