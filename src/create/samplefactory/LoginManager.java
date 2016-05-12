package create.samplefactory;

public class LoginManager
{
	public static Login factory(String type)
	{
		if ("password".equals(type))
		{
			return new PasswordLogin();
		}
		else if ("passcode".equals(type))
		{
			return new DomainLogin();
		}
		else
		{
			/**
			 * 这里抛出一个自定义异常会更恰当
			 */
			throw new RuntimeException("没有找到登录类型");
		}
	}
}
