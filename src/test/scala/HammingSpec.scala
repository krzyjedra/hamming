import org.scalatest._
import flatspec._
import matchers._


class HammingSpec extends AnyFlatSpec with should.Matchers {

  import Hamming._

  "distance" should "be 0 for any input which args length is not equal" in {
    distance("CAG", "CAGT") shouldBe 0
  }

  it should "be 2 for CAG and CGA" in {
    distance("CAG", "CGA") shouldBe 2
  }
}