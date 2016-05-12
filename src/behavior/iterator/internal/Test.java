package behavior.iterator.internal;

public class Test
{
	public void operation()
	{
		Object[] objArray =
		{ "One", "Two", "Three", "Four", "Five", "Six" };
		//创建聚合对象
		Aggregate aggregate = new ConcreteAggregate(objArray);
		Iterator iterator = aggregate.createIterator();
		//循环输出聚合对象中的值
		while (!iterator.isDone())
		{
			System.out.println(iterator.currentItem());
			iterator.next();
		}
	}

	public static void main(String[] args)
	{
		Test test = new Test();
		test.operation();
	}
}
