package structure.flyweight.simple;

/**
 * 享元模式采用一个共享来避免大量拥有相同内容对象的开销。这种开销最常见、最直观的就是内存的损耗。
 * 享元对象能做到共享的关键是区分内蕴状态(Internal State)和外蕴状态(External State)。

　　一个内蕴状态是存储在享元对象内部的，并且是不会随环境的改变而有所不同。因此，一个享元可以具有内蕴状态并可以共享。

　　一个外蕴状态是随环境的改变而改变的、不可以共享的。享元对象的外蕴状态必须由客户端保存，
	并在享元对象被创建之后，在需要使用的时候再传入到享元对象内部。外蕴状态不可以影响享元对象的内蕴状态，它们是相互独立的。
 * @author yyz
 *
 */
public class Test
{
	public static void main(String[] args)
	{
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly = factory.factory(new Character('a'));
		fly.operation("First Call");

		fly = factory.factory(new Character('b'));
		fly.operation("Second Call");

		Flyweight fly2 = factory.factory(new Character('a'));
		fly.operation("Third Call");
		System.out.println(fly == fly2);
	}
}
