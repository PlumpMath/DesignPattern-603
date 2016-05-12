package behavior.Interpreter;

public class And extends Expression
{
	private Expression left, right;

	public And(Expression left, Expression right)
	{
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean interpret(Context ctx)
	{
		return left.interpret(ctx) && right.interpret(ctx);
	}

	@Override
	public boolean equals(Object object)
	{
		if (object != null && object instanceof And)
		{
			return left.equals(((And) object).left) && right.equals(((And) object).right);
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
		return "(" + left.toString() + " AND " + right.toString() + ")";
	}

}
