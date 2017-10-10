import java.util.LinkedList;
import java.util.ListIterator;
/*
 * Kasey Mills
 * CS2003 Lab7
 * 
 * 
 */

public class Lab7 {

	public static void main(String[] args) {
		
		//Create lists
		LinkedList<String> okCity = new LinkedList<String>();
		LinkedList<String> secondList = new LinkedList<String>();
		LinkedList<String> listCopy = new LinkedList<String>();

		//Add elements to okCity
		okCity.add("Tulsa"); okCity.add("Ada"); okCity.add("Broken Arrow"); okCity.add("Owasso");
		System.out.println("Elements in " + okCity);
		
		//Add elements to secondList
		secondList.add("74104"); secondList.add("74135"); secondList.add("foo"); secondList.add("hello world"); secondList.add("777");
		System.out.println("\nElements in " + secondList);
		
		//Add okc to index one in list okCity
		okCity.add(1, "OKC");
		System.out.println("\nElements after OKC added: " + okCity);
		
		//Combine list okCity and secondList
		okCity.addAll(secondList);
		System.out.println("\nCombining lists: " + okCity);
		ListIterator<String> listIter = okCity.listIterator(); //iterator for the a
		
		//Delete every second item in the combined list
		listIter.next();
		while(listIter.hasNext()) {
			listIter.next();
			listIter.remove();
			if (listIter.hasNext()) {
				listIter.next();	
			}
		}
		System.out.println("\nAfter every second element is deleted: " + okCity);
		
		
		//Create a deep copy of second list
		for(int x = 0; x < secondList.size(); x++) {
			listCopy.add(secondList.get(x));
			}
		System.out.println("\nDeep list copy: " + listCopy);
	}
		
}
	
	

