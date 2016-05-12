package create.prototype.demo.prototypemanager;

public class ConcretePrototype1 implements Prototype
{
	private String name;

	@Override
	public Prototype clone()
	{
		Prototype prototype = new ConcretePrototype1();
		prototype.setName(this.name);
		return prototype;
	}

	@Override
	public String getName()
	{
		return this.name;
	}

	@Override
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Now in Prototype1 , name = " + this.name;
	}

}
