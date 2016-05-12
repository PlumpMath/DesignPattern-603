package behavior.visitor.assign.dynamic;

/**
 * 问题的核心就是Java编译器在编译时期并不总是知道哪些代码会被执行，因为编译器仅仅知道对象的静态类型，
 * 而不知道对象的真实类型；而方法的调用则是根据对象的真实类型，而不是静态类型。
 * 
 * 
 * 　C++和Java均是单分派语言，多分派语言的例子包括CLOS和Cecil。按照这样的区分，
 * 	Java就是动态的单分派语言，因为这种语言的动态分派仅仅会考虑到方法的接收者的类型，
 * 	同时又是静态的多分派语言，因为这种语言对重载方法的分派会考虑到方法的接收者的类型以及方法的所有参数的类型。
 */
public class Test
{
	public static void main(String[] args)
	{
		Horse h = new BlackHorse();
		h.eat();
	}
}
