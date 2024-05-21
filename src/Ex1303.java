import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Trer.Map;
public class Ex1303 {

	public static void main(String[] args) {


		//키
		System.out.print("Values: ");
		for(String value : str.values()) {
			System.out.print(value + ", ");
		}

		// 키 = 값 쌍
		System.out.print("Keys=Values: ");
		for(String value : str.values()) {
			System.out.print(value + ", ");
		}
		
		//TreeMap ======
		TreeMap<String, String> animals = new TreeMap<String, String> ();
		
		animals.put("cat", "페르시안");
		animals.put("dog", "테리어");
		animals.put("fish", "고등어");
		animals.put("zoo", "기린");
		
		System.out.println(animals);
		
		animals.replace("zoo", "고릴라");
		System.out.println(animals);
		
		System.out.println(animals.size());
		System.out.println(animals.get("zoo"));
		
		System.out.print("(keym  Value) =");
		Iterator<String> keys = animals.keySet().iterator();
		
		while(keys.hasNext()) {
			String key = key.next();
			System.out.print(" (" + key + ", " + animals.get(key) + ")");
		}
		
		
	}

}
