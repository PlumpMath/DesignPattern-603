package behavior.command.macro;

public interface MacroCommand extends Command
{
	/*
	 * 宏命令聚集管理方法
	 * 可以添加一个成员命令
	 */
	public void add(Command cmd);

	/*
	 * 宏命令聚集管理方法
	 * 可以删除一个成员命令
	 */
	public void remove(Command cmd);
}
