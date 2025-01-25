package design.patterns.composite.organization.impl;

import design.patterns.composite.organization.component.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

public class OrganizationUnit implements OrganizationComponent {

    private static final double UNIT_SHARE = 0.05;
    private final List<OrganizationComponent> organizationComponents;
    private final String name;
    private long salary;

    public OrganizationUnit(String name) {
        organizationComponents = new ArrayList<>();
        this.name = name;
    }

    public void addComponent(OrganizationComponent component) {
        organizationComponents.add(component);
    }

    @Override
    public void showDetails() {
        calculateSalary();
        System.out.println(String.format("Organization Unit '%s' " +
                "with salary '%s'", name, getSalary()));
        organizationComponents.forEach(OrganizationComponent::showDetails);
    }

    void calculateSalary() {
        salary = 0;
        organizationComponents.forEach(component -> salary += component.getSalary() + component.getSalary() * UNIT_SHARE);
    }

    @Override
    public long getSalary() {
        calculateSalary();
        return salary;
    }
}
