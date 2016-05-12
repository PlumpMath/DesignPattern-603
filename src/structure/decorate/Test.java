package structure.decorate;

/**
 * 透明性的要求:装饰模式对客户端的透明性要求程序不要声明一个ConcreteComponent类型的变量，而应当声明一个Component类型的变量。
 * 下面的做法是对的：
 * TheGreatestSage sage = new Monkey();
 * TheGreatestSage bird = new Bird(sage);
 * 
 * 而下面的做法是不对的：
 * Monkey sage = new Monkey();
 * Bird bird = new Bird(sage);
 * 
 * 半透明的装饰模式:然而，纯粹的装饰模式很难找到。装饰模式的用意是在不改变接口的前提下，增强所考虑的类的性能。
 * 在增强性能的时候，往往需要建立新的公开的方法。即便是在孙大圣的系统里，也需要新的方法。
 * 比如齐天大圣类并没有飞行的能力，而鸟儿有。这就意味着鸟儿应当有一个新的fly()方法。
 * 再比如，齐天大圣类并没有游泳的能力，而鱼儿有，这就意味着在鱼儿类里应当有一个新的swim()方法。
 * 
 * 这就导致了大多数的装饰模式的实现都是“半透明”的，而不是完全透明的。换言之，允许装饰模式改变接口，
 * 增加新的方法。这意味着客户端可以声明ConcreteDecorator类型的变量，从而可以调用ConcreteDecorator类中才有的方法：
 * TheGreatestSage sage = new Monkey();
 * Bird bird = new Bird(sage);
 * bird.fly();
 */
public class Test
{
	public static void main(String[] args)
	{
		TheGreatestSage sage = new Monkey();
		// 第一种写法
		TheGreatestSage bird = new Bird(sage);
		TheGreatestSage fish = new Fish(bird);
		// 第二种写法
		//TheGreatestSage fish = new Fish(new Bird(sage));
		fish.move();
	}
}
