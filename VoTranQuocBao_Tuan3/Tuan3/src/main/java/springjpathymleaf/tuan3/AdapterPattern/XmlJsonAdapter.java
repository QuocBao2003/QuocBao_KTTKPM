package springjpathymleaf.tuan3.AdapterPattern;
import org.json.JSONObject;
import org.json.XML;
public class XmlJsonAdapter implements DataAdapter{
    @Override
    public String convertToJson(String xmlData) {
        // Chuyển XML thành JSON
        JSONObject jsonObject = XML.toJSONObject(xmlData);
        return jsonObject.toString(4); // Format đẹp hơn với indentation = 4
    }

    @Override
    public String convertToXml(String jsonData) {
        // Chuyển JSON thành XML
        JSONObject jsonObject = new JSONObject(jsonData);
        return XML.toString(jsonObject);
    }
}
