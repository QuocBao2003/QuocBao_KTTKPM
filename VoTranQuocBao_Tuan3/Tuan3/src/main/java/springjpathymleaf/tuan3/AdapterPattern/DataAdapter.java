package springjpathymleaf.tuan3.AdapterPattern;

public interface DataAdapter
{
    String convertToJson(String xmlData);
    String convertToXml(String jsonData);
}
