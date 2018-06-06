package Queue;

/**
 * 描述:队列
 *
 * @author 闫文强
 * @create 2018-06-06 15:58
 */
public interface Queue<E> {
	int getSize();
	boolean IsEmpty();
	void enqueue(E e);
	E dequeue();
	E getFront();
}