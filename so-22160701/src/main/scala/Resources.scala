package resources

object Main extends App {

  val docStream = getClass.getResourceAsStream("""/scalaz/Monad$.html""")
  val doc = io.Source.fromInputStream(docStream).mkString
  println(doc)

}
