public class UnifiedSchoolManagement {
    public static void main(String[] args) {

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        SchoolManagementApp attendandanceSystemAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingSystemAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp librarySystemAdapter = new LibrarySystemAdapter(librarySystem);

        System.out.println(attendandanceSystemAdapter.integrateSystem());
        System.out.println(gradingSystemAdapter.integrateSystem()); 
        System.out.println(librarySystemAdapter.integrateSystem());   
    }
}