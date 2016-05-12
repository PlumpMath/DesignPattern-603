package structure.decorate.onecomponent;

public class ConcreteDecoratorB extends Decorator
{

	public ConcreteDecoratorB(ConcreteComponent concreteComponent)
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
