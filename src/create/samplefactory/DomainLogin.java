package create.samplefactory;

public class DomainLogin implements Login
{

	@Override
	public boolean vertify(String name, String password)
	{
		/**
		 * 业务逻辑
		 */
		System.out.println("DomainLogin");
		return true;
	}

}
