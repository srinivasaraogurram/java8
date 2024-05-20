package foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;

public class Java8ForEachExample {

	public static void main(String[] args) {
		
		//creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);


		// displaying the created list object
		System.out.println("******************************************************************************");
		System.out.println("********************displaying the created list object************************");
		System.out.println("mylist:" + myList);
		System.out.println("******************************************************************************");

		//traversing using Iterator
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("******************************************************************************");
		System.out.println("display collection using Iterator.next");
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Iterator Value::"+i);
		}
		System.out.println("******************************************************************************");
		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");

		System.out.println("******************************************************************************");
		System.out.println("display collection using mylist.foreach()");

		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}

		});
		
		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
		
	}

}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}
}