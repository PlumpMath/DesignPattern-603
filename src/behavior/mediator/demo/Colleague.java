package behavior.mediator.demo;

public abstract class Colleague
{
	//持有一个调停者对象
	private Mediator mediator;

	/**
	 * 构造函数
	 */
	public Colleague(Mediator mediator)
	{
		this.mediator = mediator;
	}

	public Mediator getMediator()
	{
		return mediator;
	}
}
