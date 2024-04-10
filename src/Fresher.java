public class Fresher extends Employee {
    private String GDate;
    private String GRank;
    private String ED;

    public Fresher(String ID, String fullName, String birthDay, String phone, String email, int employeeC, String graduationDate, String graduationRank, String education) {
        super(ID, fullName, birthDay, phone, email, employeeC);
        GDate = graduationDate;
        GRank = graduationRank;
        ED = education;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Graduation date: " + GDate);
        System.out.println("Graduation rank: " + GRank);
        System.out.println("Education: " + ED);
    }
}