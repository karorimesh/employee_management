package com.company.employeemanagement.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum EmployeeStatus implements EnumClass<String> {

    PENDING("Pending Verification"),
    VERIFIED("Verified");

    private final String id;

    EmployeeStatus(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static EmployeeStatus fromId(String id) {
        for (EmployeeStatus at : EmployeeStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}