package BST;

/**
 * 描述:二分搜索树
 *
 * @author 闫文强
 * @create 2018-06-05 16:31
 */
public class BST<E extends  Comparable<E>>{
	private class Node{
		public E e;
		public Node left, right;

		public Node(E e) {
			this.e = e;
			left = null;
			right = null;
		}
	}


	private Node root;
	private int size;

	public BST() {
		root = null;
		size = 0;
	}

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		return size==0;
	}


}