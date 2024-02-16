import java.util.ArrayList;

import model.FacultyDirectory;
import model.FacultyProfile;

public class FacultyDirectoryMain {
    public static void main(String[] args) throws Exception {

        FacultyDirectory directory = new FacultyDirectory();

        directory.addNewFaculty("Archil L.", "Teacher", "Electrical Engineering");
        directory.addNewFaculty("Kal Bugrara", "Director", "MGEN");

        directory.printAllMembers();

        directory.findFaculty("Archil");

        directory.filterByDepartment("MGEN");

    }
}
