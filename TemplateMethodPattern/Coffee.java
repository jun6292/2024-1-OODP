package TemplateMethodPattern;

public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping TemplateMethodPattern.Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
