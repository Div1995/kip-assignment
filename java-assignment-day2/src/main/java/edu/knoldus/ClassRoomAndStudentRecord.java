package edu.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClassRoomAndStudentRecord {
  public static void main(String[] args) {
    ClassRoomAndStudentRecord recordOfStudentsAndClasses = new ClassRoomAndStudentRecord();

    Students student1 = new Students("Bhavesh", 141215, Optional.of(Arrays.asList("English", "Hindi","social Studies")));
    Students student2 = new Students("Bantesh", 141205, Optional.of(Arrays.asList("Physical Education", "Computer Science","Hindi")));
    Students student3 = new Students("Maven", 141225, Optional.empty());

    ClassRoom classRoom1 = new ClassRoom(1, Optional.of(Arrays.asList(student1, student2)));
    ClassRoom classRoom2 = new ClassRoom(1, Optional.of(Arrays.asList(student1, student2, student3)));
    ClassRoom classRoom3 = new ClassRoom(2, Optional.of(Arrays.asList(student3, student2)));
    ClassRoom classRoom4 = new ClassRoom(3, Optional.of(Arrays.asList(student3, student2, student1)));
    ClassRoom classRoom5 = new ClassRoom(4, Optional.empty());

    List<ClassRoom> recordOfClassRooms = Arrays.asList(classRoom1, classRoom2, classRoom3, classRoom4, classRoom5);

    System.out.println("\nStudents associated with a room that have no subjects associated with them are: \n");
    System.out.println(recordOfClassRooms.stream()
        .filter(room -> room.getStudentList().isPresent()).map(list -> list.getStudentList().get())
        .collect(Collectors.toList()));



  }
}
