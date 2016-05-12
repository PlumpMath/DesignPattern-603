package structure.bridge.demo;

public class Abstraction
{

	protected Implementor implementor;

	public Abstraction(Implementor implementor)
	{
		this.implementor = implementor;
	}

	//示例方法
	public void operation()
	{
		implementor.operationImpl();
	}
}
