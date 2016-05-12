package create.prototype.demo;

/**
 * 简单形式的原型模式：如果需要创建的原型对象数目较少而且比较固定的话，可以采取第一种形式。在这种情况下，原型对象的引用可以由客户端自己保存。
 * @author yyz
 *
 */
public class Test
{
	/**
	 * 持有需要使用的原型接口对象
	 */
	private Prototype prototype;

	/**
	 * 构造方法，传入需要使用的原型接口对象
	 * @param prototype
	 */
	public Test(Prototype prototype)
	{
		this.prototype = prototype;
	}

	public void operation(Prototype prototype)
	{
		//需要创建原型接口的对象
		Prototype copyPrototype = prototype.clone();
	}
}
