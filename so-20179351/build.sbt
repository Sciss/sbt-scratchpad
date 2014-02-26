scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "9.1.0.v20131115" % "container",
  "org.eclipse.jetty" % "jetty-jsp" % "9.1.0.v20131115" % "container",
  "org.eclipse.jetty" % "jetty-servlet" % "9.1.0.v20131115" % "container",
  "org.eclipse.jetty" % "jetty-servlets" % "9.1.0.v20131115" % "container",
  "org.eclipse.jetty" % "jetty-annotations" % "9.1.0.v20131115" % "container",
  "org.eclipse.jetty" % "jetty-plus" % "9.1.0.v20131115" % "container",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" artifacts (Artifact("javax.servlet", "jar", "jar"))
)

seq(webSettings :_*)
