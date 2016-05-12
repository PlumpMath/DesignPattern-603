package behavior.templatemethod.demo;

public abstract class AbstractTemplate
{
	/**
	 * 模板方法
	 */
	public void templateMethod()
	{
		//调用基本方法
		abstractMethod();
		hookMethod();
		concreteMethod();
	}

	/**
	 * 基本方法的声明（由子类实现）
	 */
	public abstract void abstractMethod();

	/**
	 * 基本方法(空方法)
	 */
	public void hookMethod() //一般钩子方法命名以do开头
	{
	}

	/**
	 *  基本方法（已经实现）
	 */
	public void concreteMethod()
	{
		//业务相关的代码
	}
}
