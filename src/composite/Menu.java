package composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{
    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("----------------------------");

        // for each
        for (MenuComponent menuComponent: menuComponents) {
            menuComponent.print();
        }
    }
}
