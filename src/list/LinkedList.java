package list;

/**
 * 描述:链表
 *
 * @author 闫文强
 * @create 2018-06-04 14:39
 */
public class LinkedList<E> {
	public class Node {
		public E e;
		public Node next;

		public Node(E e, Node next) {
			this.e = e;
			this.next = next;
		}

		public Node(E e) {
			this.e = e;
		}

		@Override
		public String toString() {
			return e.toString();
		}
	}

	private Node head;
	private int size;

	public LinkedList() {
		head = null;
		size = 0;
	}

	public int getSize(){
		return size;
	}

	public boolean isEmpty(){
		return size==0;
	}

	// 在链表头添加新的元素e
	public void addFirst(E e){
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

		head = new Node(e, head);
		size ++;
	}

	public void add(int index,E e){
		if(index<0 || index > size) {
			throw new IllegalArgumentException();
		}
		if (index==0){
			addFirst(e);
		}else {
			Node prev = head;
			for(int i = 0 ; i < index - 1 ; i ++)
				prev = prev.next;

//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;

			prev.next = new Node(e, prev.next);
			size ++;
		}
	}

	public void addLast(E e){
		add(size,e);
	}
}