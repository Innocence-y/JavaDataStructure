package array;

/**
 * 描述:测试
 *
 * @author 闫文强
 * @create 2018-06-04 10:37
 */
public class Main {
	public static void main(String[] args) {
		Array array=new Array(20);
		System.out.println("遍历元素：");
		for (int i = 0; i <10 ; i++) {
			array.addList(i);
			System.out.println(array);
		}
		array.add(1,100);
		System.out.println("添加元素"+array);

		array.addFirst(-1);
		System.out.println("添加第一个："+array);
	}


}