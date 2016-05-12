package create.prototype.demo.prototypemanager;

public class ConcretePrototype2 implements Prototype
{
	private String name;

	@Override
	public Prototype clone()
	{
		Prototype prototype = new ConcretePrototype2();
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
		return "Now in Prototype2 , name = " + this.name;
	}

}
