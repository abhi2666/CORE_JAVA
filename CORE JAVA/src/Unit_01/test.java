package Unit_01;

public class test {

	public static void main(String[] args) {
		test1 o = new test1();
		
		o.add();
		o.addmore();

	}

}

class test1
{
	static int p = 2;
	int q = 0;
	void add()
	{
		q++;
	}
	void addmore()
	{
		q++;
		System.out.println(q);
	}
}
