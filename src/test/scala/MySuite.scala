import org.scalatest.funsuite.AnyFunSuite

class MySuite extends AnyFunSuite  {
  test("it should transform csv to json") {
    val obtained = 42
    val expected = 42
    assertResult(obtained, expected)
  }
}
