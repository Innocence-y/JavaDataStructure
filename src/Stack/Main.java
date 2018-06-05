package Stack;

/**
 * 描述:测试
 *
 * @author 闫文强
 * @create 2018-06-05 17:20
 */
public class Main {
	public static void main(String[] args) {
		ArrayStack<Integer> stack=new ArrayStack<Integer>();
		for (int i = 0; i < 5; i++) {
			stack.push(i);
			System.out.println(stack);
		}

		stack.pop();
		System.out.println(stack);
	}

}