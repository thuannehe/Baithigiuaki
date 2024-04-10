import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        EmployeeManage management = new EmployeeManage();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hệ thống Quản lý Nhân viên");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Hiển thị danh sách nhân viên");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nhập loại nhân viên (1. Kinh nghiệm 2.Mới ra trường  3. Thực tập sinh): ");
                    int employeeType = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập họ và tên: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Nhập ngày sinh: ");
                    String birthDate = scanner.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phone = scanner.nextLine();
                    System.out.print("Nhập email: ");
                    String email = scanner.nextLine();

                    switch (employeeType) {
                        case 1:
                            System.out.print("Nhập số năm kinh nghiệm: ");
                            int expYear = scanner.nextInt();
                            scanner.nextLine(); // Loại bỏ ký tự xuống dòng
                            System.out.print("Nhập kỹ năng: ");
                            String skill = scanner.nextLine();
                            Experience experienceEmployee = new Experience(id, fullName, birthDate, phone, email, 0, skill, expYear);
                            management.addEmployee(experienceEmployee);
                            break;
                        case 2:
                            System.out.print("Nhập năm tốt nghiệp: ");
                            String graduationDate = scanner.nextLine();
                            System.out.print("Nhập loại tốt nghiệp: ");
                            String graduationRank = scanner.nextLine();
                            System.out.print("Nhập trình độ học vấn: ");
                            String education = scanner.nextLine();
                            Fresher fresherEmployee = new Fresher(id, fullName, birthDate, phone, email, 0, graduationDate, graduationRank, education);
                            management.addEmployee(fresherEmployee);
                            break;
                        case 3:
                            System.out.print("Nhập chuyên ngành: ");
                            String majors = scanner.nextLine();
                            System.out.print("Nhập học kỳ: ");
                            String semester = scanner.nextLine();
                            System.out.print("Nhập tên trường đại học: ");
                            String universityName = scanner.nextLine();
                            Intern internEmployee = new Intern(id, fullName, birthDate, phone, email, 0, majors, semester, universityName);
                            management.addEmployee(internEmployee);
                            break;
                        default:
                            System.out.println("Loại nhân viên không hợp lệ.");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Nhập ID nhân viên để xóa: ");
                    String removeId = scanner.nextLine();
                    Employee employeeToRemove = management.findEmployeeID(removeId);
                    if (employeeToRemove != null) {
                        management.removeEmployee(employeeToRemove);
                        System.out.println("Xóa nhân viên thành công.");
                    } else {
                        System.out.println("Không tìm thấy nhân viên.");
                    }
                    break;
                case 3:
                    System.out.println("Danh sách nhân viên:");
                    List<Employee> employees = management.getAllEmployees();
                    for (Employee employee : employees) {
                        employee.show();
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Đang thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
            System.out.println();
        }
    }
}

