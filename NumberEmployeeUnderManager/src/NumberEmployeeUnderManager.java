import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberEmployeeUnderManager {

	static Map<String, Integer> result = new HashMap<String, Integer>();

	// Driver function
	public static void main(String[] args) {
		Map<String, String> dataSet = new HashMap<String, String>();
		dataSet.put("A", "C");
		dataSet.put("B", "C");
		dataSet.put("C", "F");
		dataSet.put("D", "E");
		dataSet.put("E", "F");
		dataSet.put("F", "F");

		populateResult(dataSet);
		System.out.println("result = " + result);
	}

	private static void populateResult(Map<String, String> dataSet){
		
		Map<String, List<String>>empHashMap=new HashMap<String, List<String>>();

		for( Map.Entry<String, String> entry :dataSet.entrySet()){
			
			String emp = entry.getKey();
			String mgr = entry.getValue();
			
			if(!emp.equals(mgr)){
					
					List<String> str =empHashMap.get(mgr);
				
					if(str==null)
						str=new ArrayList<String>();
							
					str.add(emp);					
					empHashMap.put(mgr, str);
			}	
		}
	
		for(String mngr : dataSet.keySet()){
			fillResult(mngr,empHashMap);
		}
		
	}

	private static int fillResult(String mngr,
			Map<String, List<String>> empHashMap) {
		
		int count =0 ;
	
		if(!empHashMap.containsKey(mngr)){
			 result.put(mngr,0);
			return 0 ;
		}
		
		if(result.containsKey(mngr)){
			return result.get(mngr);
		}
		
		List<String> list = empHashMap.get(mngr);
		count+=list.size();
		
		for(String str:list)
		count+=fillResult(str, empHashMap);		
		
		result.put(mngr, count);

		return count ;
		
	}
}
