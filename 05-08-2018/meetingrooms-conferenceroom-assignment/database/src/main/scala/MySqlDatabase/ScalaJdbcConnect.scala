
package MySqlDatabase

import java.sql.{Connection, DriverManager}

object ScalaJdbcConnect extends App{
  // connect to the database named "mysql" on port 3306 of localhost
  val url = "jdbc:mysql://localhost:3306/meetingrooms"
  val driver = "com.mysql.jdbc.Driver"
  val username = "root"
  val password = "root"

  var connection:Connection = _

  import java.sql.SQLException

    try {
      val connection = DriverManager.getConnection(url, username, password)

      val sql = "INSERT INTO roominfo (id, room, numberofpersons) VALUES (?, ?, ?) "

      val statement = connection.prepareStatement(sql)
      statement.setInt(1, 1024)
      statement.setString(2, "mr")
      statement.setInt(3, 3)

      val rowsInserted = statement.executeUpdate
      if (rowsInserted > 0 && rowsInserted <6) System.out.println("The Room Is Available") else System.out.println("No Availability of rooms")
    }
     catch {
      case ex: SQLException =>
        ex.printStackTrace()
    } finally if (connection != null) connection.close()
  }