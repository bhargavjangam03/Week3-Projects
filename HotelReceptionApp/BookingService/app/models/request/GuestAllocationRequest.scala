package models.request

import models.GuestData

import java.time.LocalDate

case class GuestAllocationRequest(
                                   roomNo: Int,
                                   guests: Seq[GuestData],
                                   endDate: LocalDate
                                 )

