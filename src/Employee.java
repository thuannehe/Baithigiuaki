public class Employee implements ItEmployee {
    protected String ID;
    protected String FullName;
    protected String BirthDay;
    protected String Phone;
    protected String Email;
    protected int EmployeeC;

    public Employee(String ID, String fullName, String birthDay, String phone, String email, int employeeC) {
        this.ID = ID;
        FullName = fullName;
        BirthDay = birthDay;
        Phone = phone;
        Email = email;
        EmployeeC = employeeC;
    }

    @Override
    public void show() {
        System.out.println("ID: " + ID);
        System.out.println("Full Name: " + FullName);
        System.out.println("Birthday: " + BirthDay);
        System.out.println("Phone: " + Phone);
        System.out.println("Email: " + Email);
    }
}
