package edu.knoldus;


import java.util.List;
import java.util.Optional;

public class ClassRoom {
  private int roomId;
  private Optional<List<Students>> studentList;

  public ClassRoom(int roomId, Optional<List<Students>> studentList) {
    this.roomId = roomId;
    this.studentList = studentList;
  }

  public int getRoomId() {
    return this.roomId;
  }

  public Optional<List<Students>> getStudentList() {
    return this.studentList;

  }

  public String toString() {
    return "Room Id: " + roomId + " Students: " + studentList;
  }

}
