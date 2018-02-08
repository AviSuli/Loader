
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws Exception
	{
		Loader loader = new Loader();
		
		if (args.length==1)
		{	
			loader.load(args[0]);
		}
	}

}
