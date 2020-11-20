package service;

public interface IDictionaryService {
    boolean isExist(String eng);

    String translate(String eng);
}
