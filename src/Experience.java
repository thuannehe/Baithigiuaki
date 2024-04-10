public class Experience  extends Employee {
    private int ExpInYear;
    private String Skill;

    public Experience(String ID, String fullName, String birthDay, String phone, String email, int employeeC, String skill, int expInYear) {
        super(ID, fullName, birthDay, phone, email, employeeC);
        Skill = skill;
        ExpInYear = expInYear;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Experience year: " + ExpInYear);
        System.out.println("Skill: " + Skill);
    }
}

