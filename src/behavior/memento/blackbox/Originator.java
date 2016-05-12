package behavior.memento.blackbox;

public class Originator
{
	private String state;

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
		System.out.println("赋值状态：" + state);
	}

	/*
	 * 工厂方法，返还一个新的备忘录对象
	 */
	public MementoIF createMemento()
	{
		return new Memento(state);
	}

	public void restoreMemento(MementoIF memento)
	{
		this.state = ((Memento) memento).getState();
	}

	private class Memento implements MementoIF
	{
		private String state;

		/*
		 * 构造方法
		 */
		public Memento(String state)
		{
			this.state = state;
		}

		public String getState()
		{
			return state;
		}

		public void setState(String state)
		{
			this.state = state;
		}

	}
}
