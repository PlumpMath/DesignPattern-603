package structure.proxy;

public class Test
{
	public static void main(String[] args)
	{
		AbstractObject object = new ProxyObject();
		object.operation();
	}
}
