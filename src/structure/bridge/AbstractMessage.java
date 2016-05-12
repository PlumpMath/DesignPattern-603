package structure.bridge;

public abstract class AbstractMessage
{
	//持有一个实现部分的对象
	MessageImplementor impl;

	/**
	 * 构造方法，传入实现部分的对象
	 * @param impl 实现部分的对象
	 */
	public AbstractMessage(MessageImplementor impl)
	{
		this.impl = impl;
	}

	/**
	 * 发送消息，委派给现实部分的方法
	 * @param message 要发送消息的内容
	 * @param toUser 消息的接收者
	 */
	public void sendMessage(String message, String toUser)
	{
		this.impl.send(message, toUser);
	}
}
