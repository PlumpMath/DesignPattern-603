package behavior.command.macro;

public class StopCommand implements Command
{
	AudioPlayer player;

	public StopCommand(AudioPlayer player)
	{
		this.player = player;
	}

	@Override
	public void execute()
	{
		player.stop();
	}

}
