scalaVersion := "2.10.3"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.0.6"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.0.6" classifier "javadoc"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.0.6" classifier "sources"

seq(assemblySettings: _*)