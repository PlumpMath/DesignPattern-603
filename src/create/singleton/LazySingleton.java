package create.singleton;

public class LazySingleton
{
	private static LazySingleton instance = null;

	/**
	 * 私有构造方法
	 */
	private LazySingleton()
	{

	}

	public static synchronized LazySingleton getInstance()
	{
		if (instance == null)
		{
			return new LazySingleton();
		}
		return instance;
	}
}
