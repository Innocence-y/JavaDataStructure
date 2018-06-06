package Queue;

/**
 * 描述:队列
 *
 * @author 闫文强
 * @create 2018-06-06 16:01
 */
public class ArrayQueue<E> implements Queue<E> {

	private Array<E> array;

	public ArrayQueue() {
		array = new Array<E>();
	}

	public ArrayQueue(int capacity) {
		array = new Array<E>(capacity);
	}

	@Override
	public int getSize() {
		return array.getSize();
	}

	@Override
	public boolean IsEmpty() {
		return array.isEmpty();
	}

	@Override
	public void enqueue(E e) {
		array.addLast(e);
	}

	@Override
	public E dequeue() {
		return array.removeFirst();
	}

	@Override
	public E getFront() {
		return array.getFirst();
	}

	@Override
	public String toString(){
		StringBuilder res = new StringBuilder();
		res.append("Queue: ");
		res.append("front [");
		for(int i = 0 ; i < array.getSize() ; i ++){
			res.append(array.get(i));
			if(i != array.getSize() - 1)
				res.append(", ");
		}
		res.append("] tail");
		return res.toString();
	}

	public static void main(String[] args) {
		ArrayQueue<Integer> queue = new ArrayQueue<Integer>();
		for (int i = 0; i <10 ; i++) {
			queue.enqueue(i);
			System.out.println(queue);
			if (i % 3 == 2){
				queue.dequeue();
				System.out.println(queue);
			}
		}
	}
}