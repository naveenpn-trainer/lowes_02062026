package assessments.quiz;

class A3
{
	private int id;
	public void setId(int i)
	{
		id=i;
	}
	public void getId()
	{
		System.out.println(id);
	}
}
public class Q05
{
	public static void main(String[] args)
	{
		A3 obj1=new A3();
		obj1.setId(23);
		int r=obj1.getId();
		System.out.println(r);
	}
}