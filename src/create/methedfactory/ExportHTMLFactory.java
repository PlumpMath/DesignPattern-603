package create.methedfactory;

public class ExportHTMLFactory implements ExportFactory
{

	@Override
	public ExportFile factory(String type)
	{
		if ("standard".equals(type))
		{
			return new ExportStandardHtmlFile();
		}
		else if ("financial".equals(type))
		{
			return new ExportFinancialHTMLFile();
		}
		else
		{
			throw new RuntimeException("没有找到对象");
		}
	}

}
