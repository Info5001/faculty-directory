package model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FacultyDirectory {
    private ArrayList<FacultyProfile> facultyProfiles;

    public FacultyDirectory() {
        facultyProfiles = new ArrayList<FacultyProfile>();
    }

    public FacultyProfile addNewFaculty(String name, String position, String department) {
        FacultyProfile newFaculty = new FacultyProfile(name, position, department);
        facultyProfiles.add(newFaculty);
        return newFaculty;
    }

    public void printAllMembers() {
        for (FacultyProfile eachfaculty : facultyProfiles) {
            eachfaculty.printFacultyInfo();
        }
    }

    public void findFaculty(String searchTerm) {
        System.out.println("Searching for " + searchTerm + " ....");
        for (FacultyProfile eachfaculty : facultyProfiles) {
            if (eachfaculty.getFullName().startsWith(searchTerm)) {
                System.out.println("Faculty found:");
                eachfaculty.printFacultyInfo();
                return;
            }
        }
        System.out.println("Faculty not found");
    }

    public void filterByDepartment(String filterTerm) {
        System.out.println("List of faculty filtered by department name: " + filterTerm);
        // Create a new array list to store the filtered profiles
        ArrayList<FacultyProfile> filteredProfiles = new ArrayList<FacultyProfile>();

        // Loop through the facultyProfiles array list and add the matching profiles to
        // the
        for (FacultyProfile eachfaculty : facultyProfiles) {
            if (eachfaculty.getDepartment().startsWith(filterTerm)) {
                filteredProfiles.add(eachfaculty);
            }
        }

        // print the filtered profiles
        if (filteredProfiles.size() == 0) {
            System.out.println("No faculty found in the department: " + filterTerm);
            return;
        }

        for (FacultyProfile eachfaculty : filteredProfiles) {
            eachfaculty.printFacultyInfo();
        }
    }
}
