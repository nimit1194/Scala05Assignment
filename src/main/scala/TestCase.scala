

case class TestCase(testCaseID: Int, testCaseDescription: String, preCondition: String,
                      query: String, postCondition: String)

object TestCase {

  val ONE =1
  val TWO =2
  val THREE =3
  val FOUR =4

  def apply(list: List[String]): TestCase = {

    TestCase(list.head.toInt, list(ONE), list(TWO), list(THREE), list(FOUR))

  }

}
