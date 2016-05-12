package structure.facade;

/**
 * 通过合理使用Facade，可以帮助我们更好地划分访问的层次。有些方法是对系统外的，有些方法是系统内部使用的。
 * 把需要暴露给外部的功能集中到门面中，这样既方便客户端使用，也很好地隐藏了内部的细节。
 * 
 * 这样定义一个ModuleFacade类可以有效地屏蔽内部的细节，免得客户端去调用Module类时，
 * 发现一些不需要它知道的方法。比如a2()和a3()方法就不需要让客户端知道，否则既暴露了内部的细节，
 * 又让客户端迷惑。对客户端来说，他可能还要去思考a2()、a3()方法用来干什么呢？其实a2()和a3()方法是内部模块之间交互的，
 * 原本就不是对子系统外部的，所以干脆就不要让客户端知道。
 *
 * 一个系统可以有几个门面类?
 * 在门面模式中，通常只需要一个门面类，并且此门面类只有一个实例，换言之它是一个单例类。
 * 当然这并不意味着在整个系统里只有一个门面类，而仅仅是说对每一个子系统只有一个门面类。
 * 或者说，如果一个系统有好几个子系统的话，每一个子系统都有一个门面类，整个系统可以有数个门面类。
 */
public class ModuleFacade
{
	ModuleA a = new ModuleA();
	ModuleB b = new ModuleB();
	ModuleC c = new ModuleC();

	/**
	 * 下面这些是A、B、C模块对子系统外部提供的方法
	 */
	public void a1()
	{
		a.a1();
	}

	public void b1()
	{
		b.b1();
	}

	public void c1()
	{
		c.c1();
	}
}