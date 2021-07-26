package AppEmpleados;

/**
 *
 * @author JuanCamiloDev
 */
public class DetallesEmpleados {
    
    String name, departmentBusiness;
    int salary;

    public DetallesEmpleados(String name, int salary, String departmentBusiness) {
        this.name = name;
        this.salary = salary;
        this.departmentBusiness = departmentBusiness;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartmentBusiness() {
        return departmentBusiness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartmentBusiness(String departmentBusiness) {
        this.departmentBusiness = departmentBusiness;
    }

    @Override
    public String toString() {
        return "DetallesEmpleados{" + "name=" + name + ", salary=" + salary + ", departmentBusiness=" + departmentBusiness + '}';
    }
    
    
    
}
