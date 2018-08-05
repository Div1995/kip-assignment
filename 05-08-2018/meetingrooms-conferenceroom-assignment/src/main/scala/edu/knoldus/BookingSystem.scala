
package edu.knoldus

abstract class BookingSystem extends InterfaceForSlotBooking {
  val employeeId: Int
  val typeOfRoom: String
  val numberOfPersons: Int
  override def toString: String
}

