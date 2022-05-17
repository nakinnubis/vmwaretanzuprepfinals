package medium.timebasekeyvaluestore;

import java.util.*;

public class TimeMap {
    //key => values => [v1,v2,v3,v4..... vn]
    //
    public static void main(String[] args) {
        //["TimeMap","set","set","get","get","get","get","get"]
        //[[],["love","high",10],["love","low",20],["love",5],["love",10],["love",15],["love",20],["love",25]]
        set("love","high",10);
        set("love","low",20);
      var g =   get("love",25);
    }
    static Hashtable<String, TreeMap<Integer,String>> timeTable = new Hashtable<>();


    public static void set(String key, String value, int timestamp) {
        timeTable.putIfAbsent(key, new TreeMap<>());
        timeTable.get(key).put(timestamp, value);
    }

    public static String get(String key, int timestamp) {
        if (!timeTable.containsKey(key)) return "";
        Map.Entry<Integer, String> entry = timeTable.get(key).lowerEntry(timestamp + 1);
        return entry == null ? "" : entry.getValue();
    }
}
