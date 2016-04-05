Nice.javaProject

organization  := "bio4j"
name          := "bio4j-titan"
description   := "Titan implementation of the Bio4j model"
javaVersion   := "1.8"

resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies ++= Seq(
  "bio4j"           % "bio4j"                         % "0.13.0-SNAPSHOT",
  "bio4j"           % "angulillos-titan"              % "0.4.0-SNAPSHOT",
  "jp.classmethod"  % "tupl-titan100-storage-backend" % "1.0.1",
  // test deps
  "junit"           %   "junit"                       % "3.8.1" % "test",
  "org.scalatest"   %%  "scalatest"                   % "2.2.5" % "test"
)

dependencyOverrides ++= Set(
  "commons-codec" % "commons-codec" % "1.7"
)


bucketSuffix := "era7.com"
// fat jar assembly settings
fatArtifactSettings
mainClass in assembly := Some("com.bio4j.titan.programs.ImportTitanDB")

assemblyOption in assembly ~= { _.copy(includeScala = false) }

mergeStrategy in assembly ~= { old => {
    case "log4j.properties"                       => MergeStrategy.filterDistinctLines
    case PathList("org", "apache", "commons", _*) => MergeStrategy.first
    case x                                        => old(x)
  }
}
