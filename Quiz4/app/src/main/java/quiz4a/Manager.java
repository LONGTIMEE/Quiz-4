package quiz4a;

// 2.1
/**
 * คลาสสำหรับ ผู้จัดการ
 * ตัวเเปร เเผนก เเละ โบนัส
 */
public class Manager extends Employee {
    private String department;
    private double bonus;

    
    // 2.2
    /**
     * method สำหรับ ผู้จัดการ
     * @param employeeId พนักงานไอดี
     * @param name ชื่อพนักงาน
     * @param salary เงินเดือนพนักงาน
     * @param department เเผนก
     * @param bonus โบนัส
     */
    public Manager(int employeeId, String name, double salary, String department, double bonus) {
        super(employeeId, name, salary);
        this.department = department;
        this.bonus = bonus;
    }

    // 2.3
    /**
     * methodเเสดง รายละเอียด
     * พนักงานไอดี
     *  ชื่อพนักงาน
     *  เงินเดือนพนักงาน
     *  เเผนก
     *  โบนัส
     */
    public void displayDetails() {
        String[] details = {
            "Employee ID: " + getEmployeeId(),
            "Name: " + getName(),
            "Salary: " + calculateSalary(),
            "Department: " + department,
            "Bonus: " + bonus
        };
        for (String detail : details) {
            System.out.println(detail);
        }
    }

    //2.4
    /**
     * method สำหรับเเสดงรายละเอียด
     * @param condition เงื่อนไข
     */
    public void displayDetails(String condition) {
        if ("full".equalsIgnoreCase(condition)) {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName(),
                "Salary: " + calculateSalary(),
                "Department: " + department,
                "Bonus: " + bonus
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        } else {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName()
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        }
    }
}
