import scala.io.Source

def widthOfLength(str: String) = str.length.toString.length

if (args.length > 0) {
  val lines = Source.fromFile(args(0)).getLines.toList;
  val longestLine = lines.reduceLeft((a, b) => if (a.length > b.length) a else b)
  val maxWidth = widthOfLength(longestLine)
  for (line <- lines) {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
  }
} else {
  Console.err.println("Please enter a filename")
}

// Source.fromFile(args(0)).getLines().toList.map(line => println(line.length + (" " * ((Source.fromFile(args(0)).getLines.toList.map(_.length).max.toString.length) - line.length.toString.length + 1)) + "|" + line))
