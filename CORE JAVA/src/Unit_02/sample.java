package Unit_02;
import java.util.Scanner;
public class sample {

	public static void main(String[] args) {
		add o1 = new add();
		o1.sum();
//		System.out.println(sum);
	}

}

class add
{
	void sum()
	{
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		int b = obj.nextInt();
		System.out.println(a);
		System.out.println(b);
	}
}