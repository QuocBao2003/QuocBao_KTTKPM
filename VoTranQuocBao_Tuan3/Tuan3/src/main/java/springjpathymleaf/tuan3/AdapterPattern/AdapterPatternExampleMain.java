package springjpathymleaf.tuan3.AdapterPattern;

public class AdapterPatternExampleMain {
    public static void main(String[] args) {
        DataAdapter adapter = new XmlJsonAdapter();

        // Dữ liệu XML đầu vào
        String xmlData = "<student><name>John Doe</name><age>22</age><email>johndoe@example.com</email></student>";

        // Chuyển từ XML sang JSON
        String jsonData = adapter.convertToJson(xmlData);
        System.out.println("JSON Output:\n" + jsonData);

        // Chuyển từ JSON về XML
        String convertedXml = adapter.convertToXml(jsonData);
        System.out.println("\nReconverted XML:\n" + convertedXml);
    }
}
