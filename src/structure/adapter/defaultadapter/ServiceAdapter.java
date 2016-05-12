package structure.adapter.defaultadapter;

/**
 * 在任何时候，如果不准备实现一个接口的所有方法时，就可以使用“缺省适配模式”制造一个抽象类，给出所有方法的平庸的具体实现。这样，从这个抽象类再继承下去的子类就不必实现所有的方法了。
 * 
 * 接口AbstractService要求定义三个方法，分别是serviceOperation1()、serviceOperation2()、serviceOperation3()；
 * 而抽象适配器类ServiceAdapter则为这三种方法都提供了平庸的实现。
 * 因此，任何继承自抽象类ServiceAdapter的具体类都可以选择它所需要的方法实现，而不必理会其他的不需要的方法。
 * @author yyz
 *
 */
public class ServiceAdapter implements AbstractService
{

	@Override
	public void serviceOperation1()
	{

	}

	@Override
	public int serviceOperation2()
	{
		return 0;
	}

	@Override
	public String serviceOperation3()
	{
		return null;
	}

}
