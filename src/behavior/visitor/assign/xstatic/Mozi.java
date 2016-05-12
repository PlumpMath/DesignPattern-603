package behavior.visitor.assign.xstatic;

/**
 * 变量被声明时的类型叫做变量的静态类型(Static Type)，有些人又把静态类型叫做明显类型(Apparent Type)；
 * 
 * 静态分派(Static Dispatch)发生在编译时期，分派根据静态类型信息发生。静态分派对于我们来说并不陌生，方法重载就是静态分派。
 * 
 * 两次对ride()方法的调用传入的是不同的参数，也就是wh和bh。它们虽然具有不同的真实类型，
 * 但是它们的静态类型都是一样的，均是Horse类型重载方法的分派是根据静态类型进行的，这个分派过程在编译时期就完成了。
 */
public class Mozi
{
	public void ride(Horse h)
	{
		System.out.println("骑马");
	}

	public void ride(WhiteHorse wh)
	{
		System.out.println("骑白马");
	}

	public void ride(BlackHorse bh)
	{
		System.out.println("骑黑马");
	}

	public static void main(String[] args)
	{
		Horse wh = new WhiteHorse();
		Horse bh = new BlackHorse();
		Mozi mozi = new Mozi();
		mozi.ride(wh);
		mozi.ride(bh);
	}
}
