package scalaPkg

  final class ScalaClass(val anInteger: Integer) {
    def this(aBool: Boolean) {
      this(-1)
    }

    val theString = "theString"

    var someString = "some"

    def plus(x: Int, y: Int): Int = x + y
  }


