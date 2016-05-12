package structure.abstractfactory;

public class AMDFactory implements AbstractFactory
{

	@Override
	public CPU createCPU()
	{
		return new AMDCPU(938);
	}

	@Override
	public Mainboard createMainboard()
	{
		return new AMDMainboard(938);
	}

}
