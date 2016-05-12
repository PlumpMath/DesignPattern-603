package behavior.command;

public class Keypay
{
	private Command playCommand;
	private Command rewindCommand;
	private Command stopCommand;

	public void setPlayCommand(Command playCommand)
	{
		this.playCommand = playCommand;
	}

	public void setRewindCommand(Command rewindCommand)
	{
		this.rewindCommand = rewindCommand;
	}

	public void setStopCommand(Command stopCommand)
	{
		this.stopCommand = stopCommand;
	}

	/*
	 * 执行播放操作
	 */
	public void play()
	{
		playCommand.execute();
	}

	/*
	 * 执行倒带操作
	 */
	public void rewind()
	{
		rewindCommand.execute();
	}

	/*
	 * 执行停止操作
	 */
	public void stop()
	{
		stopCommand.execute();
	}
}
