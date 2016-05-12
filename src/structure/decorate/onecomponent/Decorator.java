package structure.decorate.onecomponent;

public class Decorator extends ConcreteComponent
{
	ConcreteComponent concreteComponent;

	public Decorator(ConcreteComponent concreteComponent)
	{
		this.concreteComponent = concreteComponent;
	}

	@Override
	public void sampleOperation()
	{
		super.sampleOperation();
	}

}
