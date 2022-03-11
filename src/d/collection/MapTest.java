package d.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		
		MapTest obj = new MapTest();
		//obj.chkHashMap();
		//obj.chkHashMapEntry();
		//obj.chkTreeMap();
		//obj.chkProperties();
		obj.useProperties();
		obj.useXmlProperties();
		
	}

	private void chkHashMap() {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("A", "a");
		map.put("A", "aa");
				
		//System.out.println(map.get("A"));
		//System.out.println(map.get("B"));
		
		map.put("C", "c");
		map.put("D", "d");
		System.out.println(map);
		
		Set<String> keySet= map.keySet();
		for (String tmp: keySet) {
			System.out.println(tmp+ ":" + map.get(tmp));
		}
		
		System.out.println("------------------------------");
		Collection<String> values = map.values();
		for (String str : values) {
			System.out.println(str);
		}
	}
	
	public void chkHashMapEntry() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("A", "a");
		map.put("B", "b");
		map.put("C", "c");
		map.put("D", "d");
		
		map.remove("C");
		
		Set<Entry<String,String>> entries = map.entrySet();
		for(Entry<String,String> tmp: entries) {
			System.out.println(tmp.getKey() + ":" + tmp.getValue());
		}
		System.out.println("------------------------------");
		
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsKey("Z"));
		
		System.out.println(map.containsValue("a"));
		System.out.println(map.containsValue("z"));
	}
	
	public void chkTreeMap() {
		TreeMap<String,String> map = new TreeMap<String, String>();
		map.put("A", "a");
		map.put("B", "b");
		map.put("C", "c");
		map.put("D", "d");
		map.put("가", "e");
		map.put("1", "f");
		map.put("a", "g");
		
		Set<Entry<String,String>> entries = map.entrySet();
		for(Entry<String,String> tmp: entries) {
			System.out.println(tmp.getKey() + ":" + tmp.getValue());
		}		
	}
	
	public void chkProperties() {
		Properties prop = System.getProperties();
		Set<Object> keySet = prop.keySet();
		for (Object tmp: keySet) {
			System.out.println(tmp + ":" + prop.get(tmp));
		}
	}
	
	public void useProperties() {
		try {
			
			String fName = "test.properties";
			//String fName = "test.xml";
			File propFile = new File(fName);
			FileOutputStream fos = new FileOutputStream(propFile);
			Properties prop = new Properties();
			prop.setProperty("Title","Java Study");
			prop.setProperty("Contents","Java Programming");
			prop.store(fos, "Test Properties.");
			//prop.store(fos, "Test XML Properties.");
			fos.close();
			
			FileInputStream fis = new FileInputStream(propFile);
			Properties propLoaded = new Properties();
			propLoaded.load(fis);
			//propLoaded.loadFromXML(fis);
			fis.close();
			
			System.out.println(propLoaded);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void useXmlProperties() {
		try {
			
			//String fName = "test.properties";
			String fName = "test.xml";
			File propFile = new File(fName);
			FileOutputStream fos = new FileOutputStream(propFile);
			Properties prop = new Properties();
			prop.setProperty("Title","Java Study");
			prop.setProperty("Contents","Java Programming");
			//prop.store(fos, "Test Properties.");
			prop.storeToXML(fos, "Test XML Properties.");
			fos.close();
			
			FileInputStream fis = new FileInputStream(propFile);
			Properties propLoaded = new Properties();
			//propLoaded.load(fis);
			propLoaded.loadFromXML(fis);
			fis.close();
			
			System.out.println(propLoaded);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
