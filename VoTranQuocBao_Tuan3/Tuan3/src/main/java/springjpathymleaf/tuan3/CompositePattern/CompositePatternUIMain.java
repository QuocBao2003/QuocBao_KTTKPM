package springjpathymleaf.tuan3.CompositePattern;

public class CompositePatternUIMain {
    public static void main(String[] args) {

        Button button1 = new Button("Submit");
        Button button2 = new Button("Cancel");
        TextField textField = new TextField("Enter your name");

        // Tạo panel chứa các thành phần UI
        Panel formPanel = new Panel("Form Panel");
        formPanel.addComponent(textField);
        formPanel.addComponent(button1);
        formPanel.addComponent(button2);

        // Tạo cửa sổ chính chứa panel
        Panel mainWindow = new Panel("Main Window");
        mainWindow.addComponent(formPanel);

        // Hiển thị toàn bộ giao diện
        mainWindow.render();
    }
}
