package behavior.command.macro;

public class Test
{
	public static void main(String[] args)
	{
		//创建接收者对象
		AudioPlayer player = new AudioPlayer();
		//创建命令对象
		Command playCommand = new PlayCommand(player);
		Command rewindCommand = new RewindCommand(player);
		Command stopCommand = new StopCommand(player);

		MacroCommand macroCommand = new MacroAudioCommand();
		macroCommand.add(playCommand);
		macroCommand.add(rewindCommand);
		macroCommand.add(stopCommand);
		macroCommand.execute();
	}
}
