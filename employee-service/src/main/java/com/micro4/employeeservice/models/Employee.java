package com.micro4.employeeservice.models;

public record Employee(Long id, Long departmentId, String name, int age, String position) {
}
