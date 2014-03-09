## Dependency javadocs and sources on the class path

This is done using [classifers](http://www.scala-sbt.org/release/docs/Detailed-Topics/Library-Management#classifiers).

First, add a `libraryDependency` with a `javadoc` or `sources` `classifer`:

```scala
libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.0.6" classifier "javadoc"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.0.6" classifier "sources"
```

Then, access its contents from the classpath:

```scala
val docStream = getClass.getResourceAsStream("""/scalaz/Monad$.html""")
val doc = io.Source.fromInputStream(docStream).mkString
println(doc)
```
