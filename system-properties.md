Setting system properties from sbt. Run this demo with `sbt run`. See http://www.scala-sbt.org/0.12.3/docs/Detailed-Topics/Forking.html

*build.sbt*:

```scala
fork := true
 
javaOptions += "-Dfoo=bar"
```

*Demo.scala*:

```scala
object Demo extends App {
  println("foo: " + System.getProperty("foo"))
}
```
