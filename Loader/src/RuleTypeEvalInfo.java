import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 RULE_TYPE_ID=114#RULE_SUB_TYPE_ID=null#RULE_TYPE_NAME=Inbound message type selection#EVALUATE_TYPE=FIRST#EXEC_TYPE=SIMPLE#TIME_STAMP=2018-02-05 17:44:18.684
#RULE_SEQUANCE=1#RULE_OBJECT_ASSOCIATION=***
#EXECUTION_SCRIPT=SELECT CASE  WHEN :P_ORIG_MSG_TYPE <> 'NACHA' AND  :P_ORIG_MSG_TYPE like 'NACHA' || '%' THEN '***^114^NACHA_MP_MT_SEL_ALREADY_RAN,STOP,NA,0' WHEN (:P_DBT_MOP = 'MYIBGDD' OR :P_CDT_MOP = 'MYIBGDD' OR :D_FILE_SRC = 'MYIBGDD') AND :X_TRANSACTION_CD = '26' AND  :GET_MULTI_FIELD_VAL = 'R00' THEN '***^114^MYIBG_DD_MP_ACK,NACHA_DD_ACK,NACHA_DD,1' WHEN (:P_DBT_MOP = 'MYIBGDD' OR :P_CDT_MOP = 'MYIBGDD' OR :D_FILE_SRC = 'MYIBGDD') AND :X_TRANSACTION_CD = '26' AND  :GET_MULTI_FIELD_VAL <> 'R00' THEN '***^114^MYIBG_DD_MP_REJECT,NACHA_DD_REJ,NACHA_DD,2' WHEN :P_ORIG_MSG_TYPE = 'NACHA' AND  :P_MSG_SUB_TYPE in('ACK','ATX') THEN '***^114^NACHA_MP_ACK_CT,NACHA_ACK,NACHA_CT,3' WHEN :P_ORIG_MSG_TYPE = 'NACHA' AND ((:COMPARE_STRING = 1 AND  :P_MSG_SUB_TYPE = 'COR') OR  :P_MSG_SUB_TYPE in('DNE','ENR')) THEN '***^114^NACHA_MP_ADMIN_CT,NACHA_ADMIN,NACHA_CT,4' WHEN :P_ORIG_MSG_TYPE = 'NACHA' AND  :COMPARE_STRING = 1 AND  :P_MSG_SUB_TYPE = 'COR' THEN '***^114^NACHA_MP_ADMIN_DD,NACHA_ADMIN,NACHA_DD,5' WHEN :P_ORIG_MSG_TYPE = 'NACHA' AND  :COMPARE_STRING = 1 THEN '***^114^NACHA_MP_CT,NACHA_CT,NA,6' WHEN :P_ORIG_MSG_TYPE = 'NACHA' AND  :COMPARE_STRING = 1 THEN '***^114^NACHA_MP_DD,NACHA_DD,NA,7' WHEN :P_ORIG_MSG_TYPE = 'NACHA' AND  :COMPARE_STRING = 1 AND  :P_MSG_SUB_TYPE <> 'COR' THEN '***^114^NACHA_MP_RTN_CT,NACHA_RTN,NACHA_CT,8' WHEN :P_ORIG_MSG_TYPE = 'NACHA' AND :COMPARE_STRING = 1 AND  :P_MSG_SUB_TYPE <> 'COR' THEN '***^114^NACHA_MP_RTN_DD,NACHA_RTN,NACHA_DD,9' END FROM DUAL
#ALIAS_BINDIND=[[Ljava.lang.Object;@12cd88ad, [Ljava.lang.Object;@73c81f7f, [Ljava.lang.Object;@578c063b, [Ljava.lang.Object;@29ed3864, [Ljava.lang.Object;@151142bd, [Ljava.lang.Object;@20349119, [Ljava.lang.Object;@5b2210d3, [Ljava.lang.Object;@197ebb63, [Ljava.lang.Object;@4f406da8, [Ljava.lang.Object;@edf593e, [Ljava.lang.Object;@695bfd12, [Ljava.lang.Object;@1643dec8, [Ljava.lang.Object;@41d727e3, [Ljava.lang.Object;@147bc9da, [Ljava.lang.Object;@4b0111b7, [Ljava.lang.Object;@33322bd9, [Ljava.lang.Object;@22dccdd1, [Ljava.lang.Object;@4e4c6638, [Ljava.lang.Object;@79cb0eb0, [Ljava.lang.Object;@2318348, [Ljava.lang.Object;@a1ed18, [Ljava.lang.Object;@6d4c2fb, [Ljava.lang.Object;@7a4cf03d, [Ljava.lang.Object;@51307385, [Ljava.lang.Object;@43f04a67, [Ljava.lang.Object;@54a4d309, [Ljava.lang.Object;@111b1f49, [Ljava.lang.Object;@ba2fa65, [Ljava.lang.Object;@78e502da, [Ljava.lang.Object;@31e7438, [Ljava.lang.Object;@44600a21]
#IS_USING_CACHE_RESULTS=false
#NOT_CACHED_PARAM_VALUE_BINDING=[[Pain_001, 12, P_ORIG_MSG_TYPE, null, true], [Pain_001, 12, P_ORIG_MSG_TYPE, null, false], [null, 12, P_DBT_MOP, null, true], [null, 12, P_CDT_MOP, null, true], [null, 12, D_FILE_SRC, null, true], [null, 12, X_TRANSACTION_CD, null, true], [, 12, ##GET_MULTI_FIELD_VAL##, GET_MULTI_FIELD_VAL(X_ADDENDA_INFO,1,X_RSN_CD), true], [null, 12, P_DBT_MOP, null, false], [null, 12, P_CDT_MOP, null, false], [null, 12, D_FILE_SRC, null, false], [null, 12, X_TRANSACTION_CD, null, false], [, 12, ##GET_MULTI_FIELD_VAL##, GET_MULTI_FIELD_VAL(X_ADDENDA_INFO,1,X_RSN_CD), false], [Pain_001, 12, P_ORIG_MSG_TYPE, null, false], [null, 12, P_MSG_SUB_TYPE, null, true], [Pain_001, 12, P_ORIG_MSG_TYPE, null, false], [0, -7, ##COMPARE_STRING##, COMPARE_STRING(X_TRANSACTION_CD=null,In Value List,NACHA_MP_RTN_NOC_CT_TX_CDS,''), true], [null, 12, P_MSG_SUB_TYPE, null, false], [null, 12, P_MSG_SUB_TYPE, null, false], [Pain_001, 12, P_ORIG_MSG_TYPE, null, false], [0, -7, ##COMPARE_STRING##, COMPARE_STRING(X_TRANSACTION_CD=null,In Value List,NACHA_MP_RTN_NOC_DD_TX_CDS,''), true], [null, 12, P_MSG_SUB_TYPE, null, false], [Pain_001, 12, P_ORIG_MSG_TYPE, null, false], [0, -7, ##COMPARE_STRING##, COMPARE_STRING(X_TRANSACTION_CD=null,In Value List,NACHA_MP_CT_TX_CDS,''), true], [Pain_001, 12, P_ORIG_MSG_TYPE, null, false], [0, -7, ##COMPARE_STRING##, COMPARE_STRING(X_TRANSACTION_CD=null,In Value List,NACHA_MP_DD_TX_CDS,''), true], [Pain_001, 12, P_ORIG_MSG_TYPE, null, false], [0, -7, ##COMPARE_STRING##, COMPARE_STRING(X_TRANSACTION_CD=null,In Value List,NACHA_MP_RTN_NOC_CT_TX_CDS,''), false], [null, 12, P_MSG_SUB_TYPE, null, false], [Pain_001, 12, P_ORIG_MSG_TYPE, null, false], [0, -7, ##COMPARE_STRING##, COMPARE_STRING(X_TRANSACTION_CD=null,In Value List,NACHA_MP_RTN_NOC_DD_TX_CDS,''), false], [null, 12, P_MSG_SUB_TYPE, null, false]]
#CACHDE_RESULTS_COMPLETION_CODE=NORMAL_TERMINATION
 */
public class RuleTypeEvalInfo {
	public static String RULE_TYPE_EVAL_INFO_DELIMITER = "#RULE_TYPE_ID_EVAL_START";
	
	private static String KEY_DELIMITER = "####";
	private static String EXPRESSION_DELIMITER = "#=#";
	
	private static String[] supportedKey = new String[] {"RULE_TYPE_ID","RULE_SUB_TYPE_ID","RULE_TYPE_NAME","EVALUATE_TYPE","EXEC_TYPE","TIME_STAMP"};
	
	String rawData;
	Map<String,String> ruleTypeEvalMap= new HashMap<String,String>(); 
	List<RuleAssociationInfo> ruleAssociationInfoList = new ArrayList<RuleAssociationInfo>();
	


	RuleTypeEvalInfo(String rawData) {
		this.rawData = rawData;
		
		parseRawData();
	}
	

	
	void parseRawData()
	{
		Scanner ruleTypeEvalScanner = new Scanner(rawData);
		
		ruleTypeEvalScanner.useDelimiter(KEY_DELIMITER);
		
		String exp;
		String[] splitExp;
		List<String> supportedKeyList = new ArrayList<String>(Arrays.asList(supportedKey));
		
		while (ruleTypeEvalScanner.hasNext())
		{
			exp = ruleTypeEvalScanner.next();
			
			if (exp.startsWith("RULE_OBJECT_ASSOCIATION"))
			{
				ruleAssociationInfoList.add(new RuleAssociationInfo(exp));
			}
			else
			{
				splitExp = exp.split(EXPRESSION_DELIMITER);
				
				if (splitExp.length == 2 && supportedKeyList.contains(splitExp[0]))
				{
					ruleTypeEvalMap.put(splitExp[0], splitExp[1]);
				}
				else
				{
					System.out.println("Not supported expression##:" + splitExp);
				}
			}
			
		}
	}
	

	String getRuleTypeId() { 
		return   ruleTypeEvalMap.get("RULE_TYPE_ID");
	}
	
	String getRuleSubTypeId() { 
		return   ruleTypeEvalMap.get("RULE_SUB_TYPE_ID");
	}
	
	String getRuleTypeName() { 
		return   ruleTypeEvalMap.get("RULE_TYPE_NAME");
	}
	
	String getEvaluateType() { 
		return   ruleTypeEvalMap.get("EVALUATE_TYPE");
	}
	
	String getExecType() { 
		return   ruleTypeEvalMap.get("EXEC_TYPE");
	}
	
	String getTimeStamp() { 
		return   ruleTypeEvalMap.get("TIME_STAMP");
	}
	
	RuleAssociationInfo getRuleAssociationInfo( int index)
	{
		return ruleAssociationInfoList.get(index);
	}
	
}