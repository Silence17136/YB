package pac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String str[]) {
		int b=12356;
		String s[] = { "app_key", "session", "id", "comment", "sign",
				"comment_id" };
		Map<String, String> map = new HashMap<String, String>();
		map.put("app_key", "ak");
		map.put("session", "se");
		map.put("id", "i");
		map.put("comment", "c");
		map.put("sign", "si");
		map.put("comment_id", "ci");
		String ss[] = new String[map.size()];
		int i = 0;
		for (String key : map.keySet()) {
			ss[i] = key + "=" + map.get(key);
			i++;
		}
		Arrays.sort(ss);
		for (String st : ss) {
			System.out.println(st);
			//1234567
			//7654321
		}
	}

}
