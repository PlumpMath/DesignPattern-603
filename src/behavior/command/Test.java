package behavior.command;

public class Test
{
	public static void main(String[] args)
	{
		//创建接收者对象
		AudioPlayer audioPlayer = new AudioPlayer();
		//创建命令对象
		Command playCommand = new PlayCommand(audioPlayer);
		Command rewindCommand = new RewindCommand(audioPlayer);
		Command stopCommand = new StopCommand(audioPlayer);
		//创建请求者对象
		Keypay keypay = new Keypay();
		keypay.setPlayCommand(playCommand);
		keypay.setRewindCommand(rewindCommand);
		keypay.setStopCommand(stopCommand);

		//测试
		keypay.play();
		keypay.rewind();
		keypay.stop();
		keypay.play();
		keypay.stop();
	}
}
