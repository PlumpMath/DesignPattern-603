package structure.flyweight.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 到底系统需要满足什么样的条件才能使用享元模式。对于这个问题，总结出以下几点： 

1、一个系统中存在着大量的细粒度对象；

2、这些细粒度对象耗费了大量的内存。 

3、这些细粒度对象的状态中的大部分都可以外部化； 

4、这些细粒度对象可以按照内蕴状态分成很多的组，当把外蕴对象从对象中剔除时，每一个组都可以仅用一个对象代替。 

5、软件系统不依赖于这些对象的身份，换言之，这些对象可以是不可分辨的。

满足以上的这些条件的系统可以使用享元对象。最后，使用享元模式需要维护一个记录了系统已有的所有享元的哈希表，也称之为对象池，
而这也需要耗费一定的资源。因此，应当在有足够多的享元实例可供共享时才值得使用享元模式。
 *
 */
public class Test
{
	public static void main(String[] args)
	{
		List<Character> compositeState = new ArrayList<Character>();
		compositeState.add('a');
		compositeState.add('b');
		compositeState.add('c');
		compositeState.add('a');
		compositeState.add('b');

		FlyweightFactory factory = new FlyweightFactory();
		Flyweight compositeFlyweight1 = factory.factory(compositeState);
		Flyweight compositeFlyweight2 = factory.factory(compositeState);
		compositeFlyweight1.operation("Composite Call");

		System.out.println("---------------------------------");
		System.out.println("复合享元模式是否可以共享对象：" + (compositeFlyweight1 == compositeFlyweight2));

		Character state = 'a';
		Flyweight fly1 = factory.factory(state);
		Flyweight fly2 = factory.factory(state);
		System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
	}
}
