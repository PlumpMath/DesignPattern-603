package behavior.command;


public class RewindCommand implements Command
{
	AudioPlayer player;

	public RewindCommand(AudioPlayer player)
	{
		this.player = player;
	}

	@Override
	public void execute()
	{
		player.rewind();
	}

}
