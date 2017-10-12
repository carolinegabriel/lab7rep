
import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedLists {

	public static void main(String args[]) {

		LinkedList<String> a = new LinkedList<String>();
		a.add("Tulsa");
		a.add("Ada");
		a.add("Broken Arrow");
		a.addLast("Owasso");

		ListIterator<String> aIter = a.listIterator();

		aIter.next();
		aIter.add("OKC");

		System.out.println(a);

		LinkedList<String> b = new LinkedList<String>();
		b.add("74104");
		b.add("74135");
		b.add("foo");
		b.add("hello world");
		b.add("777");

		System.out.println(b);

		ListIterator<String> bIter = b.listIterator();

		aIter.previous();

		while (aIter.hasNext() && bIter.hasNext()) {
			aIter.add(bIter.next());
			aIter.next();
		}
		aIter.add(bIter.next());

		System.out.println(a);

		for (int x = 0; x < 5; x++) {
			aIter.previous();
			aIter.remove();
			aIter.previous();
		}

		System.out.println(a);

		for (int i = 0; i < 5; i++) {
			bIter.previous();
		}

		LinkedList<String> copyb = new LinkedList<String>();

		while (bIter.hasNext()) {
			copyb.add(bIter.next());
		}

		System.out.println(copyb);

	}
}