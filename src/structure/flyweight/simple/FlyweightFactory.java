package structure.flyweight.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂角色类，必须指出的是，客户端不可以直接将具体享元类实例化，而必须通过一个工厂对象，
 * 利用一个factory()方法得到享元对象。一般而言，享元工厂对象在整个系统中只有一个，因此也可以使用单例模式。
 * @author yyz
 *
 */
public class FlyweightFactory
{
	private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

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
