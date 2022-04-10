package linked_list;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListToQueueAdapter {
	public static class LLToQueueAdapter {
		LinkedList<Integer> list;

		public LLToQueueAdapter() {
			list = new LinkedList<>();
		}

		int size() {
			// write your code here
			return list.size();
		}

		void add(int val) {
			// write your code here
			list.addLast(val);
		}

		int remove() {
			// write your code here
			if (list.size() == 0) {
				System.out.println("Queue underflow");
				return -1;
			} else {
				return list.removeFirst();
			}
		}

		int peek() {
			// write your code here
			if (list.size() == 0) {
				System.out.println("Queue underflow");
				return -1;
			} else {
				return list.getFirst();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LLToQueueAdapter qu = new LLToQueueAdapter();

		String str = br.readLine();
		while (str.equals("quit") == false) {
			if (str.startsWith("add")) {
				int val = Integer.parseInt(str.split(" ")[1]);
				qu.add(val);
			} else if (str.startsWith("remove")) {
				int val = qu.remove();
				if (val != -1) {
					System.out.println(val);
				}
			} else if (str.startsWith("peek")) {
				int val = qu.peek();
				if (val != -1) {
					System.out.println(val);
				}
			} else if (str.startsWith("size")) {
				System.out.println(qu.size());
			}
			str = br.readLine();
		}
	}
}

//Sample IP
//add 10
//add 20
//add 30
//add 40
//add 50
//add 60
//peek
//remove
//peek
//remove
//peek
//remove
//peek
//remove
//peek
//remove
//peek
//remove
//quit
