package behavior.iterator.foreign;

public abstract class Aggregate
{
	/**
	 * 工厂方法，创建相应迭代子对象的接口
	 * @return
	 */
	public abstract Iterator createIterator();
}
