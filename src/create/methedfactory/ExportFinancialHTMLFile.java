package create.methedfactory;

public class ExportFinancialHTMLFile implements ExportFile
{
	@Override
	public boolean export(String data)
	{
		/**
		 * 业务逻辑
		 */
		System.out.println("导出财务版HTML文件");
		return true;
	}
}
