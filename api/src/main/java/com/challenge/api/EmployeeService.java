package com.challenge.api;

import com.challenge.api.model.Employee;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@SpringBootApplication
public class EmployeeService {

    private final ConcurrentHashMap<UUID, Employee> map = new ConcurrentHashMap<>();

    public List<Employee> getAllEmployees() {
        List<Employee> res = map.values().stream().toList();
        return res;
    }

    public Employee getEmployeeByUuid(UUID uuid) {
        Employee res = Optional.ofNullable(map.get(uuid))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found"));
        return res;
    }

    public Employee createEmployee(Employee employee) {
        UUID uuid = UUID.randomUUID();
        employee.setUuid(uuid);

        map.put(uuid, employee);
        return employee;
    }
}
