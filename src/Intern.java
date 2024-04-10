public class Intern extends Employee {
    private String MJ;
    private String ST;
    private String UniName;

    public Intern(String ID, String fullName, String birthDay, String phone, String email, int employeeC, String majors, String semester, String universityName) {
        super(ID, fullName, birthDay, phone, email, employeeC);
        MJ = MJ;
        ST = ST;
        UniName = UniName;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Majors: " + MJ);
        System.out.println("Semester: " + ST);
        System.out.println("University name: " + UniName);
    }
}
