package A20230102;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
    int capacity ;
    HashMap<Integer,Integer> map=new HashMap<>();
    int count =0;
    HashMap<Integer,Integer> Rmap=new HashMap<>();
    public LRUCache(int capacity) {
        this.capacity=capacity;

    }

    public int get(int key) {
        Integer integer = map.get(key);
        if (integer==null){
            integer=-1;
        }
        this.count=count+1;
        Rmap.put(key,count);
        return integer;
    }

    public void put(int key, int value) {
        this.count=count+1;
        map.put(key,value);
        Rmap.put(key,count);
        if (map.size()>=capacity){
            int countMin = count;
            int keyMin=key;
            for (Map.Entry<Integer, Integer> integerIntegerEntry : Rmap.entrySet()) {
               if (integerIntegerEntry.getValue()<countMin){
                   countMin=integerIntegerEntry.getValue();
                   keyMin=integerIntegerEntry.getKey();
               };
            }
            Rmap.remove(keyMin);
            map.remove(keyMin);
        }

    }
}
