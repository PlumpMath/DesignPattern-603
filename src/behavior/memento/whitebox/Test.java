package behavior.memento.whitebox;

public class Test
{
	public static void main(String[] args)
	{
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		//改变发起人对象的状态
		originator.setState("On");
		//创建备忘录对象，并将发起人对象的状态存储起来
		caretaker.saveMemento(originator.createMemento());
		//修改发起人的状态
		originator.setState("Off");
		//恢复发起人对象的状态
		originator.restoreMemento(caretaker.retrieveMemento());

		System.out.println(originator.getState());
	}
}
