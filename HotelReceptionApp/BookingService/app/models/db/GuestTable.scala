package models.db

import models.Guest
import slick.jdbc.MySQLProfile.api._

private class GuestTable(tag: Tag) extends Table[Guest](tag, "Guest") {
  def guestId = column[Long]("guest_id", O.PrimaryKey, O.AutoInc)
  def name = column[String]("name")
  def roomNo = column[Int]("room_no")
  def email = column[String]("email")
  def address = column[String]("address")
  def idProof = column[Array[Byte]]("id_proof")
  def guestStatus = column[String]("guest_status")

  def * = (guestId, name, roomNo, email, address, idProof, guestStatus) <> ((Guest.apply _).tupled, Guest.unapply)
}
