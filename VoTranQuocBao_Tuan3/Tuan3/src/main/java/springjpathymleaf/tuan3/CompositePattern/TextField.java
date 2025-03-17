package springjpathymleaf.tuan3.CompositePattern;

public class TextField implements UIComponent{
    private String placeholder;

    public TextField(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    public void render() {
        System.out.println("Rendering TextField with placeholder: " + placeholder);
    }
}
