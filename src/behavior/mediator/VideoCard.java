package behavior.mediator;

public class VideoCard extends Colleague
{

	/**
	 * 构造方法 
	 */
	public VideoCard(Mediator mediator)
	{
		super(mediator);
	}

	public void showData(String data)
	{
		System.out.println("您正在观看的是：" + data);
	}

}
