import org.scalatest.{FunSpec, Matchers}

class FrameSpec extends FunSpec with Matchers {

  describe ("the world's coolest program") {

    it ("should match a string to its frame, obviously") {
      val input: String = "I have cholera"
      val correlated: String = "My cholera"

      // TODO build a custom matcher to evaluate whether one string entails the other
    }

  }

}
