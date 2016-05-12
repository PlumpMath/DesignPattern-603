package structure.decorate.onedecorator;

public class ConcreteDecorator implements Component
{
	private Component component;

	public ConcreteDecorator(Component component)
	{
		this.component = component;
	}

	@Override
	public void sampleOperation()
	{
		component.sampleOperation();
		//业务代码
	}

}
