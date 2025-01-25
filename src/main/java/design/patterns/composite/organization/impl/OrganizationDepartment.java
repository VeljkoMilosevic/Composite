package design.patterns.composite.organization.impl;

import design.patterns.composite.organization.component.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

public class OrganizationDepartment implements OrganizationComponent {

    private static final double DEPARTMENT_SHARE = 0.1;
    private final List<OrganizationComponent> organizationComponents;
    private long salary;
    private String name;

    public OrganizationDepartment(String name) {
        organizationComponents = new ArrayList<>();
        this.name = name;
    }

    public void addComponent(OrganizationComponent component) {
        organizationComponents.add(component);
    }

    @Override
    public void showDetails() {
        calculateSalary();
        System.out.println(String.format("Organization department '%s' " +
                "with salary '%s'", name, getSalary()));
        organizationComponents.forEach(OrganizationComponent::showDetails);
    }

    void calculateSalary() {
        salary = 0;
        organizationComponents.forEach(component -> salary += component.getSalary() + component.getSalary() * DEPARTMENT_SHARE);
    }

    @Override
    public long getSalary() {
        calculateSalary();
        return salary;
    }
}
