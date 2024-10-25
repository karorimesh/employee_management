package com.company.employeemanagement.listener;

import com.company.employeemanagement.entity.Employee;
import com.company.employeemanagement.entity.EmployeeStatus;
import io.jmix.core.DataManager;
import io.jmix.core.event.EntityChangedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeEventListener {

    @Autowired
    private DataManager dataManager;

    @EventListener
    public void onEmployeeChangedBeforeCommit(final EntityChangedEvent<Employee> event) {

        if (event.getType().equals(EntityChangedEvent.Type.DELETED) || event.getType().equals(EntityChangedEvent.Type.UPDATED)) {
            var emp = dataManager.load(event.getEntityId()).one();
            if (emp.getEmployeeStatus().equals(EmployeeStatus.VERIFIED) && !event.getChanges().isChanged("employeeStatus")){
                throw new IllegalStateException("Employee is already verified");
            }
        }
    }
}