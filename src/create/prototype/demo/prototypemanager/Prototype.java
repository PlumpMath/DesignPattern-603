package create.prototype.demo.prototypemanager;

public interface Prototype
{
	public Prototype clone();

	public String getName();

	public void setName(String name);
}
