name := "fim-spark"

version := "1.0"

scalaVersion := "2.10.4"

scalacOptions += "-deprecation"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

resolvers += "Cloudera Repository" at "https://repository.cloudera.com/artifactory/cloudera-repos/"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"

libraryDependencies += "junit" % "junit" % "4.10" % "test"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.2.0"

//libraryDependencies += "com.esotericsoftware.kryo" % "kryo" % "2.22"

//libraryDependencies += "org.apache.spark" %% "spark-core" % "1.3.0-SNAPSHOT" from "http://homepages.dcc.ufmg.br/~viniciusvdias/repo/spark-core_2.10-1.3.0-SNAPSHOT.jar"

//dependencyOverrides += "com.esotericsoftware.kryo" % "kryo" % "2.23"

//libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.0.0-cdh4.7.0"

