import java.util.ArrayList;
import java.lang.UnsupportedOperationException;

public class Hashmap<keyType, valType> {
    private final int default_size = 100003;
    private final int string_hash_const = 29;
    private valType map[];
    private ArrayList<keyType> keyList;

    Hashmap() {
        keyList = new ArrayList<keyType>();
        map = (valType[]) new Object[default_size];
    }
    Hashmap(int size) {
        keyList = new ArrayList<keyType>();
        map = (valType[]) new Object[size];
    }

    private int hash(keyType s) {
        if(s instanceof String) {
            int ret = 0;
            int mod = string_hash_const;
            for(int i=0;i<((String)s).length();i++) {
                ret = (ret + mod * ((String)s).charAt(i)) % map.length;
                mod = mod * string_hash_const % map.length;
            }
            return ret;
        }
        else if(s instanceof Integer) {
            return (Integer)s % map.length;
        }
        else {
            throw new UnsupportedOperationException("Type " + s.getClass() + "is not supported");
        }
    }

    public void put(keyType key, valType value) {
        int hashval = hash(key);
        if(map[hashval] == null)
            keyList.add(key);
        map[hashval] = value;

    }

    public valType get(keyType key) {
        return map[hash(key)];
    }

    public ArrayList<keyType> keySet(){
        return keyList;
    }
}