package behavior.Interpreter;

public class Variable extends Expression
{
	private String name;

	public Variable(String name)
	{
		this.name = name;
	}

	@Override
	public boolean interpret(Context ctx)
	{
		return ctx.lookup(this);
	}

	@Override
	public boolean equals(Object object)
	{
		if (object != null && object instanceof Variable)
		{
			return this.name.equals(((Variable) object).name);
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return this.toString().hashCode();
	}

	@Override
	public String toString()
	{
		return name;
	}

}
