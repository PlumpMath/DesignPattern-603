package behavior.visitor;

public class Test
{
	public static void main(String[] args)
	{
		//创建一个结构对象
		ObjectStructure objectStructure = new ObjectStructure();
		//给结构对象增加一个节点
		objectStructure.add(new NodeA());
		//给结构对象增加一个节点
		objectStructure.add(new NodeB());
		//创建一个访问者
		Visitor visitor = new VisitorA();
		objectStructure.action(visitor);
	}
}
