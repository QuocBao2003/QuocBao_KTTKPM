package springjpathymleaf.tuan3.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Panel  implements UIComponent{
    private String name;
    private List<UIComponent> components = new ArrayList<>();

    public Panel(String name) {
        this.name = name;
    }

    public void addComponent(UIComponent component) {
        components.add(component);
    }

    @Override
    public void render() {
        System.out.println("Rendering Panel: " + name);
        for (UIComponent component : components) {
            component.render();
        }
    }
}
