package behavior.memento.selfhistory;

public class Test
{
	public static void main(String[] args)
	{
		Originator originator = new Originator();
		//修改状态
		originator.changeState("state 0");
		//创建备忘录
		MementoIF memento = originator.createMemento();
		//修改状态
		originator.changeState("state 1");
		//按照备忘录恢复对象的状态
		originator.restoreMemento(memento);
	}
}
