package create.singleton;

public class DoubleCheckLockSingleton
{
	private volatile static DoubleCheckLockSingleton instance = null;

	private DoubleCheckLockSingleton()
	{

	}

	public static DoubleCheckLockSingleton getInstance()
	{
		//先检查实例是否存在，如果不存在则进入下面的同步块
		if (instance == null)
		{
			//同步块，线程安全的创建实例
			synchronized (DoubleCheckLockSingleton.class)
			{
				//再次检查实例是否存在，如果不存在才真正的创建实例
				if (instance == null)
				{
					instance = new DoubleCheckLockSingleton();
				}
			}
		}
		return instance;
	}
}
