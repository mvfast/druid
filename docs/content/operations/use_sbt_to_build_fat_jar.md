```
libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk" % "1.9.23" exclude("common-logging", "common-logging"),
  "org.joda" % "joda-convert" % "1.7",
  "joda-time" % "joda-time" % "2.7",
  "io.druid" % "druid" % "0.7.3" excludeAll (
    ExclusionRule("org.ow2.asm"),
    ExclusionRule("com.fasterxml.jackson.core"),
    ExclusionRule("com.fasterxml.jackson.datatype"),
    ExclusionRule("com.fasterxml.jackson.dataformat"),
    ExclusionRule("com.fasterxml.jackson.jaxrs"),
    ExclusionRule("com.fasterxml.jackson.module")
  ),
  "io.druid" % "druid-services" % "0.7.3" excludeAll (
    ExclusionRule("org.ow2.asm"),
    ExclusionRule("com.fasterxml.jackson.core"),
    ExclusionRule("com.fasterxml.jackson.datatype"),
    ExclusionRule("com.fasterxml.jackson.dataformat"),
    ExclusionRule("com.fasterxml.jackson.jaxrs"),
    ExclusionRule("com.fasterxml.jackson.module")
  ),
  "io.druid" % "druid-indexing-service" % "0.7.3" excludeAll (
    ExclusionRule("org.ow2.asm"),
    ExclusionRule("com.fasterxml.jackson.core"),
    ExclusionRule("com.fasterxml.jackson.datatype"),
    ExclusionRule("com.fasterxml.jackson.dataformat"),
    ExclusionRule("com.fasterxml.jackson.jaxrs"),
    ExclusionRule("com.fasterxml.jackson.module")
  ),
  "io.druid" % "druid-indexing-hadoop" % "0.7.3" excludeAll (
    ExclusionRule("org.ow2.asm"),
    ExclusionRule("com.fasterxml.jackson.core"),
    ExclusionRule("com.fasterxml.jackson.datatype"),
    ExclusionRule("com.fasterxml.jackson.dataformat"),
    ExclusionRule("com.fasterxml.jackson.jaxrs"),
    ExclusionRule("com.fasterxml.jackson.module")
  ),
  "io.druid.extensions" % "mysql-metadata-storage" % "0.7.3" excludeAll (
    ExclusionRule("org.ow2.asm"),
    ExclusionRule("com.fasterxml.jackson.core"),
    ExclusionRule("com.fasterxml.jackson.datatype"),
    ExclusionRule("com.fasterxml.jackson.dataformat"),
    ExclusionRule("com.fasterxml.jackson.jaxrs"),
    ExclusionRule("com.fasterxml.jackson.module")
  ),
  "io.druid.extensions" % "druid-s3-extensions" % "0.7.3" excludeAll (
    ExclusionRule("org.ow2.asm"),
    ExclusionRule("com.fasterxml.jackson.core"),
    ExclusionRule("com.fasterxml.jackson.datatype"),
    ExclusionRule("com.fasterxml.jackson.dataformat"),
    ExclusionRule("com.fasterxml.jackson.jaxrs"),
    ExclusionRule("com.fasterxml.jackson.module")
  ),
  "io.druid.extensions" % "druid-histogram" % "0.7.3" excludeAll (
    ExclusionRule("org.ow2.asm"),
    ExclusionRule("com.fasterxml.jackson.core"),
    ExclusionRule("com.fasterxml.jackson.datatype"),
    ExclusionRule("com.fasterxml.jackson.dataformat"),
    ExclusionRule("com.fasterxml.jackson.jaxrs"),
    ExclusionRule("com.fasterxml.jackson.module")
  ),
  "io.druid.extensions" % "druid-hdfs-storage" % "0.7.3" excludeAll (
  case path if path contains "META-INF/jersey-module-version" => MergeStrategy.first
  case path if path contains ".properties" => MergeStrategy.first
  case path if path contains ".class" => MergeStrategy.first
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}
```
