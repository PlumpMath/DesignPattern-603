package structure.decorate.demo;

public class Decorator implements Component
{
	private Component component;

	public Decorator(Component component)
	{
		this.component = component;
	}

	@Override
	public void sampleOperation()
	{
		// 委派给构件
		this.component.sampleOperation();
	}

}
