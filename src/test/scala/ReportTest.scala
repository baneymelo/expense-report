import org.scalatest.funsuite.AnyFunSuiteLike

class ReportTest extends AnyFunSuiteLike {
  test("it should create a report") {
    // given
    val expected: String = "Month,Bank Account,Deposits,Debts,Concept"
    val report: Report = new Report()

    // when
    val actual: String = report.create()

    // then
    assertResult(expected) {actual}
  }
}
