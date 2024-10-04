import com.example.prototype.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {

        List<String> skills = new ArrayList<>();
        skills.add("Java");
        skills.add("Python");

        Map<String, Integer> experience = new HashMap<>();
        experience.put("Java", 3);
        experience.put("Python", 2);

        Employee employee = new Employee("John Doe", "Software Engineer", skills, experience);
        System.out.println(employee.toString());

        Employee employeeClone = employee.clone();
        System.out.println(employeeClone.toString());

        System.out.println(employee == employeeClone);

        employee.skills.add("C++");
        employee.experience.put("C++", 2);

        System.out.println();
        System.out.println(employee.toString());
        System.out.println(employeeClone.toString());

    }
}
