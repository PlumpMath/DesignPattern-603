package structure.abstractfactory;

public class Test
{
	public static void main(String[] args)
	{
		//创建工程师对象
		ComputerEngineer computerEngineer = new ComputerEngineer();
		//客户选择并创建需要使用的对象
		AbstractFactory abstractFactory = new IntelFactory();
		//告诉装机工程师自己选择的产品，让装机工程师组装电脑
		computerEngineer.makeComputer(abstractFactory);
	}
}
