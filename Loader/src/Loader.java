
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Loader {

	List<RuleTypeEvalInfo> ruleTypeList = new ArrayList<RuleTypeEvalInfo>();
	
	public  void load(String filePath) throws Exception
	{
		FileReader fr = new FileReader(filePath);
		Scanner scan = new Scanner(fr);
		scan.useDelimiter(RuleTypeEvalInfo.RULE_TYPE_EVAL_INFO_DELIMITER);
		
		
		
		while (scan.hasNext())
		{
			ruleTypeList.add(new RuleTypeEvalInfo(scan.next()));
		}
		
		
		
		fr.close();
		

		System.out.println("Loading done local 2!");


	}
	
	

}
