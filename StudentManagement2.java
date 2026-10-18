import java.util.*;

public class StudentManagement2 {

  public static void main(String[] args) {

    System.out.println("STUDENT MANAGEMENT SYSTEM");

    Scanner sc = new Scanner(System.in);

    int count = 0;

    String names[] = new String[100];
    int rollNo[] = new int[100];
    int marks[] = new int[100];

    int choice = 0;

    while (choice != 6) {

      System.out.println("\n1. Add Student");
      System.out.println("2. Search Student");
      System.out.println("3. Update Student");
      System.out.println("4. Delete Student");
      System.out.println("5. Display Students");
      System.out.println("6. Exit");

      System.out.print("Enter your choice: ");
      choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {

        // ADD STUDENT
        case 1:

          if (count == names.length) {
            System.out.println("Student records are full!");
            break;
          }

          System.out.println("Enter student name:");
          names[count] = sc.nextLine();

          System.out.println("Enter roll number:");
          rollNo[count] = sc.nextInt();

          System.out.println("Enter marks:");
          marks[count] = sc.nextInt();
          sc.nextLine();

          count++;

          System.out.println("Student added successfully!");

          break;

        // SEARCH STUDENT
        case 2:

          if (count == 0) {
            System.out.println("No student records found!");
            break;
          }

          System.out.print("Enter roll number to search: ");
          int searchRoll = sc.nextInt();

          boolean found = false;

          for (int i = 0; i < count; i++) {

            if (rollNo[i] == searchRoll) {

              System.out.println("Student Found!");
              System.out.println("Name: " + names[i]);
              System.out.println("Roll Number: " + rollNo[i]);
              System.out.println("Marks: " + marks[i]);

              found = true;
              break;
            }
          }

          if (!found) {
            System.out.println("Student not found!");
          }

          break;

        // UPDATE STUDENT
        case 3:

          if (count == 0) {
            System.out.println("No student records found!");
            break;
          }

          System.out.print("Enter roll number to update: ");
          int updateRoll = sc.nextInt();

          boolean updated = false;

          for (int i = 0; i < count; i++) {

            if (rollNo[i] == updateRoll) {

              System.out.println("1. Update Name");
              System.out.println("2. Update Roll Number");
              System.out.println("3. Update Marks");

              System.out.print("Enter your choice: ");
              int updateChoice = sc.nextInt();
              sc.nextLine();

              switch (updateChoice) {

                case 1:
                  System.out.println("Enter new name:");
                  names[i] = sc.nextLine();

                  System.out.println("Name updated successfully!");
                  break;

                case 2:
                  System.out.println("Enter new roll number:");
                  rollNo[i] = sc.nextInt();

                  System.out.println("Roll number updated successfully!");
                  break;

                case 3:
                  System.out.println("Enter new marks:");
                  marks[i] = sc.nextInt();

                  System.out.println("Marks updated successfully!");
                  break;

                default:
                  System.out.println("Invalid update choice!");
                  break;
              }

              updated = true;
              break;
            }
          }

          if (!updated) {
            System.out.println("Student not found!");
          }

          break;

        // DELETE STUDENT
        case 4:

          if (count == 0) {
            System.out.println("No student records found!");
            break;
          }

          System.out.print("Enter roll number to delete: ");
          int deleteRoll = sc.nextInt();

          boolean deleted = false;

          for (int i = 0; i < count; i++) {

            if (rollNo[i] == deleteRoll) {

              for (int j = i; j < count - 1; j++) {

                names[j] = names[j + 1];
                rollNo[j] = rollNo[j + 1];
                marks[j] = marks[j + 1];
              }

              count--;

              deleted = true;

              System.out.println("Student deleted successfully!");

              break;
            }
          }

          if (!deleted) {
            System.out.println("Student not found!");
          }

          break;

        // DISPLAY STUDENTS
        case 5:

          if (count == 0) {
            System.out.println("No student records found!");
            break;
          }

          System.out.println("\n----- STUDENT RECORDS -----");

          for (int i = 0; i < count; i++) {

            System.out.println("Student Name: " + names[i]);
            System.out.println("Roll Number: " + rollNo[i]);
            System.out.println("Marks: " + marks[i]);

            System.out.println("---------------------------");
          }

          break;

        // EXIT
        case 6:

          System.out.println("Exiting Student Management System...");
          break;

        default:

          System.out.println("Please enter a valid choice!");
          break;
      }
    }

    sc.close();
  }
}
