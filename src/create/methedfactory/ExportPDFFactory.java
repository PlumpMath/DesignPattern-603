package create.methedfactory;

public class ExportPDFFactory implements ExportFactory
{

	@Override
	public ExportFile factory(String type)
	{
		if ("standard".equals(type))
		{
			return new ExportStandardPDFFile();
		}
		else if ("financial".equals(type))
		{
			return new ExportFinancialPDFFile();
		}
		else
		{
			throw new RuntimeException("没有找到对象");
		}
	}

}
