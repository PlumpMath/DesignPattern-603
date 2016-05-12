package behavior.observer.push.demo;

public class ConcreteSubject extends Subject
{
	private String state;

	public String getState()
	{
		return state;
	}

	public void change(String newState)
	{
		state = newState;
		System.out.println("主题状态为：" + state);
		//状态发生改变，通知各个观察者
		super.notifyObservers(state);
	}
}
