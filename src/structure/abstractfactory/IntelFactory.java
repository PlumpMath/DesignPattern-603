package structure.abstractfactory;

public class IntelFactory implements AbstractFactory
{

	@Override
	public CPU createCPU()
	{
		return new IntelCPU(755);
	}

	@Override
	public Mainboard createMainboard()
	{
		return new IntelMainboard(755);
	}

}
