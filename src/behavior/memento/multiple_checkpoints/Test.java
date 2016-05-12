package behavior.memento.multiple_checkpoints;

public class Test
{
	public static void main(String[] args)
	{
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker(originator);

		//改变状态
		originator.setState("state 0");
		//建立一个检查点
		caretaker.createMemento();
		//改变状态
		originator.setState("state 1");
		//建立一个检查点
		caretaker.createMemento();
		//改变状态
		originator.setState("state 2");
		//建立一个检查点
		caretaker.createMemento();
		//改变状态
		originator.setState("state 3");
		//建立一个检查点
		caretaker.createMemento();
		//打印出所有检查点
		originator.printStates();
		System.out.println("-----------------恢复检查点-----------------");
		//恢复到第二个检查点
		caretaker.restoreMemento(2);
		//打印出所有检查点
		originator.printStates();
	}
}
