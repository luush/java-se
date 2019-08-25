package day10;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的遍历
 * 遍历Map有三种方式:
 * 1:遍历所有的key
 * 2:遍历所有的键值对(Entry)
 * 3:遍历所有的value(用的较少)
 * @author adminitartor
 *
 */
public class Map_iterate {
	public static void main(String[] args) {
//		Map<String,Integer> map 
//			= new HashMap<String,Integer>();
		/*
		 * LinkedHashMap是可以按照put元素时的顺序
		 * 遍历Map中的所有元素
		 */
		Map<String,Integer> map 
			= new LinkedHashMap<String,Integer>();
		
		map.put("语文", 99);
		map.put("数学", 89);
		map.put("英语", 97);
		map.put("物理", 98);
		map.put("化学", 95);		
		System.out.println(map);
		
		/*
		 * HashMap本身不是线程安全的
		 * 若希望将现有的Map转换为线程安全的,
		 * 可以使用Collections的静态方法将其
		 * 转换.
		 */
		map = Collections.synchronizedMap(map);
		
		
		/*
		 * 遍历所有的key
		 * Set<K> keySet()
		 * 将当前Map中所有的key存入一个Set集合后
		 * 返回.
		 */
		Set<String> keySet = map.keySet();
		keySet.forEach((k)->System.out.println(k));
		
		/*
		 * 遍历所有的键值对
		 * Map中每一组键值对有内部类Entry的实例表示
		 * Entry有两个常用方法:
		 * getKey,getValue.这两个方法用于获取当前
		 * Entry实例表示的这组键值对中的key与value
		 * 
		 * Set<Entry> entrySet()
		 * 将当前Map中每组键值对存入一个Set集合后返回            
		 */
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> e:entrySet){
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key+":"+value);
		}
		
		/*
		 * 遍历所有的value
		 * Collection<V> values()
		 * 将当前Map中所有的value存入一个集合后
		 * 返回.
		 */
		Collection<Integer> values = map.values();
		for(Integer value : values){
			System.out.println(value);
		}
		
	}

}





