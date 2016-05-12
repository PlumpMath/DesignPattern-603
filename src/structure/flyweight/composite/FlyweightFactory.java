package structure.flyweight.composite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory
{
	private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

	public Flyweight factory(List<Character> compositeState)
	{
		ConcreteCompositeFlyweight compositeFlyweight = new ConcreteCompositeFlyweight();
		for (Character character : compositeState)
		{
			compositeFlyweight.add(character, this.factory(character));
		}
		return compositeFlyweight;
	}

	/**
	 * 单纯享元工厂方法
	 * @param state
	 * @return
	 */
	public Flyweight factory(Character state)
	{
		//先从缓存中查找对象
		Flyweight flyweight = files.get(state);
		if (flyweight == null)
		{
			//如果对象不存在则创建一个新的Flyweight对象
			flyweight = new ConcreteFlyweight(state);
			//把这个新的Flyweight对象添加到缓存中
			files.put(state, flyweight);
		}
		return flyweight;
	}
}
