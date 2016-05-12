package create.samplefactory;

public class Test
{
	public static void main(String[] args)
	{
		String loginType = "password";
		String name = "name";
		String password = "password";
		Login login = LoginManager.factory(loginType);
		boolean bool = login.vertify(name, password);
		if (bool)
		{
			/**
			 * 业务代码
			 */
		}
		else
		{
			/**
			 * 业务代码
			 */
		}
	}
}
