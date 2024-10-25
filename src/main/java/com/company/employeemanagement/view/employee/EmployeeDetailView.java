package com.company.employeemanagement.view.employee;

import com.company.employeemanagement.entity.Employee;
import com.company.employeemanagement.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "employees/:id", layout = MainView.class)
@ViewController("Employee.detail")
@ViewDescriptor("employee-detail-view.xml")
@EditedEntityContainer("employeeDc")
public class EmployeeDetailView extends StandardDetailView<Employee> {
}