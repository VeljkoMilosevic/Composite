package design.patterns.composite.organization.component;

public interface OrganizationComponent {

    void showDetails();

    long getSalary();

    void addComponent(OrganizationComponent component);
}
