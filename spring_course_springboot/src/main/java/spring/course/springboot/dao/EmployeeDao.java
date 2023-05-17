package spring.course.springboot.dao;



import spring.course.springboot.entity.Employee;

import java.util.List;

public interface EmployeeDao {
     List<Employee> getAllEmployees();  // возвращает список всех работников

    void saveEmployee(Employee employee); // создает нового работника или изменяет имеющегося

    Employee getEmployees(int id); // возвращает работника по id

     void deleteEmployee(int id); // удаляет работника по его id
}
