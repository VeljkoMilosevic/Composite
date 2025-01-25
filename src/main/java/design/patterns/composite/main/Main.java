package design.patterns.composite.main;

import design.patterns.composite.organization.impl.Employee;
import design.patterns.composite.organization.impl.OrganizationDepartment;
import design.patterns.composite.organization.impl.OrganizationUnit;

public class Main {
    public static void main(String[] args) {
        OrganizationDepartment itDepartment = new OrganizationDepartment("IT Department");

        OrganizationUnit devopsUnit = new OrganizationUnit(
                "Devops Department");
        OrganizationUnit developerUnit = new OrganizationUnit("Developers Department");
        itDepartment.addComponent(developerUnit);
        itDepartment.addComponent(devopsUnit);

        Employee alisaJohnson = new Employee("Alisa Johnson", 1800);
        Employee bobMiller = new Employee("Bob Miller", 2300);
        devopsUnit.addComponent(bobMiller);
        devopsUnit.addComponent(alisaJohnson);

        Employee johnDoe = new Employee("John Doe", 2000);
        Employee janeSmith = new Employee("Jane Smith", 2200);
        developerUnit.addComponent(johnDoe);
        developerUnit.addComponent(janeSmith);

        itDepartment.showDetails();
    }
}