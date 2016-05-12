package create.builder;

public class Test
{
	public static void main(String[] args)
	{
		Builder builder = new WelcomeBuilder();
		Director director = new Director(builder);
		director.construct("toAddress@126.com", "fromAddress@126.com");
	}
}
