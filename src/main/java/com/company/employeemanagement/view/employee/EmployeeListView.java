package com.company.employeemanagement.view.employee;

import com.company.employeemanagement.entity.Employee;
import com.company.employeemanagement.entity.EmployeeStatus;
import com.company.employeemanagement.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "employees", layout = MainView.class)
@ViewController("Employee.list")
@ViewDescriptor("employee-list-view.xml")
@LookupComponent("employeesDataGrid")
@DialogMode(width = "64em")
public class EmployeeListView extends StandardListView<Employee> {
    @Autowired
    private DataManager dataManager;
    @ViewComponent
    private DataGrid<Employee> employeesDataGrid;

    @Subscribe("verify")
    public void onVerify(final ActionPerformedEvent event) {
        employeesDataGrid.getSelectedItems().forEach(
                emp -> {
                    emp.setEmployeeStatus(EmployeeStatus.VERIFIED);
                    dataManager.save(emp);
                }
        );
    }
}