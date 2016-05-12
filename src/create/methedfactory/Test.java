package create.methedfactory;

public class Test
{
	public static void main(String[] args)
	{
		String data = "helloworld";
		ExportFactory exportFactory = new ExportPDFFactory();
		ExportFile exportFile = exportFactory.factory("financial");
		exportFile.export(data);
	}
}
