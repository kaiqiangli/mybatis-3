package org.apache.ibatis.cache;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMapTest
 *
 * @author likaiqiang@focusmedia.cn
 */
public class LinkedHashMapTest {

    public static void main(String[] args) {

        HashMap<String, String>  p = new LinkedHashMap(5, 0.75f, false);

        p.put("1", "1");
        p.put("2", "2");
        p.put("3", "3");

        for(Map.Entry<String, String> entry : p.entrySet()) {
            System.out.println("key:" + entry.getKey() + ", value = " + entry.getValue());
        }

        p.get("1");

        for(Map.Entry<String, String> entry : p.entrySet()) {
            System.out.println("key:" + entry.getKey() + ", value = " + entry.getValue());
        }
    }
}
