package behavior.command.macro;

public class PlayCommand implements Command
{
	AudioPlayer player;

	public PlayCommand(AudioPlayer player)
	{
		this.player = player;
	}

	/**
	 * 执行方法
	 */
	@Override
	public void execute()
	{
		player.play();
	}

}
