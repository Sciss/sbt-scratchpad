To add *[project]/src/main/resources2* to the classpath:

```scala
unmanagedResourceDirectories in Compile <+= (sourceDirectory in Compile) { _ / "resources2" }
```
