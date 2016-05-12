package behavior.responsibilitychain;

public abstract class Handler
{
	/**
	 * 持有下一个处理请求的对象
	 */
	protected Handler successor = null;

	/**
	 * 取值方法
	 * @return
	 */
	public Handler getSuccessor()
	{
		return successor;
	}

	/**
	 * 处理下一个处理请求的对象
	 * @param successor
	 */
	public void setSuccessor(Handler successor)
	{
		this.successor = successor;
	}

	/**
	 * 处理聚餐费用的申请
	 * @param user 申请人
	 * @param fee 申请的钱数
	 * @return 成功或失败的具体通知
	 */
	public abstract String handleFeeRequest(String user, double fee);
}
