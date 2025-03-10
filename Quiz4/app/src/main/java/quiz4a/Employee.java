package quiz4a;


// (1.1) เขียน Java Docs
/**
 * คลาสสำหรับพนักงาน
 */
public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    // (1.2)
    /**
     * method สำหรับเเสดงรายละเอียด
     * @param employeeId ไอดีพนักงาน
     * @param name ชื่อพนักงาน
     * @param salary เงินเดือน
     */
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = (salary > 0) ? salary : 0;
    }

    // (1.3)
    /**
     * 
     * @return ส่งออก เงินเดือน
     */
    public double calculateSalary() {
        return salary;
    }

    // (1.4)
    /**
     * 
     * @return ส่งออก ไอดีพนักงาน
     */
    public int getEmployeeId() {
        return employeeId;
    }

    // (1.5)
    /**
     * 
     * @return ส่งออก ชื่อ
     */
    public String getName() {
        return name;
    }
}