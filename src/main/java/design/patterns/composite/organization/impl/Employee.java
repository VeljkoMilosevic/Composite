package design.patterns.composite.organization.impl;

import design.patterns.composite.organization.component.OrganizationComponent;

public class Employee implements OrganizationComponent {
    private final long salary;
    private final String name;

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showDetails() {
        System.out.println(String.format("Organization Employee '%s' with salary '%s'", name, getSalary()));
    }

    @Override
    public long getSalary() {
        return salary;
    }

    @Override
    public void addComponent(OrganizationComponent component) {
        throw new UnsupportedOperationException("Adding new OrganizationComponent to Employee is not supported!");
    }
}
