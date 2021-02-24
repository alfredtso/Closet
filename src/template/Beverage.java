package template;

public abstract class Beverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addStuffs();
    }

    abstract void brew();

    abstract void addStuffs();

    // final so that subclass can't override it
    final void boilWater() {
    }

    void pourInCup() {

    }

}
