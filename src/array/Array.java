package array;

/**
 * 描述:数组
 *
 * @author 闫文强
 * @create 2018-06-04 9:41
 */
public class Array {
	private int[] data;
	private int size;

	public Array(int capacity) {
		data = new int[capacity];
		size = 0;
	}

	public Array() {
		this(10);
	}

	public int getCapacity() {
		return data.length;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void add(int index, int e) {
		if (size == data.length) {
			throw new IllegalArgumentException("Add failed. Array is full.");
		}
		if (index < 0 || index > size) {
			throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
		}
		for (int i = size - 1; i >= index; i--) {
			data[i + 1] = data[i];
		}
		data[index] = e;
		size++;
	}

	public void addList(int e){
		add(0,e);
	}

	public void addFirst(int e){
		add(0,e);
	}

	public int get(int index){
		if (index< 0 || index >=size){
			throw new IllegalArgumentException("Get failed. Index is illegal.");
			}
			return data[index];
	}

	public void set(int index,int e){
		if (index<0 || index>=size){
			throw new IllegalArgumentException("Set failed. Index is illegal.");
		}
		data[index] = e;
	}

	@Override
	public String toString() {
		StringBuilder res= new StringBuilder();
		res.append(String.format("Array: size = %d , capacity = %d\n",size,data.length));
		res.append('[');
		for (int i = 0; i <size ; i++) {
			res.append(data[i]);
			if (i !=size -1)
				res.append(",");
		}
		res.append("]");
		return res.toString();
	}
}