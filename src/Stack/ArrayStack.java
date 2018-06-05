package Stack;

import DynamicArray.Array;

/**
 * 描述:用数组实现栈
 *
 * @author 闫文强
 * @create 2018-06-05 17:02
 */
public class ArrayStack<E> implements Stack<E> {


	Array<E> array;

	public ArrayStack(int capacity) {
		array = new Array<>(capacity);
	}

	public ArrayStack(){
		array = new Array<>();
	}

	@Override
	public int getSize() {
		return array.getSize();
	}

	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}

	@Override
	public void push(E e){
		array.addLast(e);
	}

	@Override
	public E pop() {
		return array.removeLast();
	}

	@Override
	public E peek() {
		return array.getLast();
	}


	public int getCapacity(){
		return array.getCapacity();
	}

	@Override
	public String toString(){
		StringBuilder res = new StringBuilder();
		res.append("Stack: ");
		res.append('[');
		for (int i = 0; i <array.getSize(); i++) {
			res.append(array.get(i));
			if (i!=array.getSize()-1){
				res.append(", ");
			}
		}
		res.append("] top");
		return res.toString();
	}
}