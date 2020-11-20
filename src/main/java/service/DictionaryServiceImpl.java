package service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryServiceImpl implements IDictionaryService{
    private static Map<String,String> dictionary;

    static {
        dictionary = new HashMap<>();
        dictionary.put("hello","Xin chao");
        dictionary.put("goodbye","Tam biet");
        dictionary.put("thanks","Cam on");
        dictionary.put("morning","Buoi sang");
        dictionary.put("evenning","Buoi toi");
        dictionary.put("afternoon","Buoi chieu");
        dictionary.put("ok","Dong y");
        dictionary.put("no","Khong");
        dictionary.put("yes","Co");
    }

    @Override
    public boolean isExist(String eng){
        if(dictionary.containsKey(eng)){
            return true;
        }
        return false;
    }

    @Override
    public String translate(String eng) {
        if(isExist(eng)){
           return dictionary.get(eng);
        } else {
            return "Khong tim thay!";
        }
    }
}
