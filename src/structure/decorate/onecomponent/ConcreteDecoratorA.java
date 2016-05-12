package structure.decorate.onecomponent;

public class ConcreteDecoratorA extends Decorator
{

	public ConcreteDecoratorA(ConcreteComponent concreteComponent)
	{
		super(concreteComponent);
	}

	@Override
	public void sampleOperation()
	{
		super.sampleOperation();
		//业务代码
	}

}
