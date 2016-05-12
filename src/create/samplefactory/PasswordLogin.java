package create.samplefactory;

public class PasswordLogin implements Login
{

	@Override
	public boolean vertify(String name, String password)
	{
		/**
		 * 业务代码
		 */
		System.out.println("PasswordLogin");
		return true;
	}

}
