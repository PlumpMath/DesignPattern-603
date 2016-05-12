package structure.flyweight.composite;

import java.util.HashMap;
import java.util.Map;

public class ConcreteCompositeFlyweight implements Flyweight
{
	private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

	/**
	 *  增加一个新的单纯享元对象到聚集中
	 * @param key
	 * @param flyweight
	 */
	public void add(Character key, Flyweight flyweight)
	{
		files.put(key, flyweight);
	}

	/**
	 * 外蕴状态作为参数传入到方法中
	 */
	@Override
	public void operation(String state)
	{
		Flyweight flyweight = null;
		for (Object o : files.keySet())
		{
			flyweight = files.get(o);
			flyweight.operation(state);
		}
	}

}
