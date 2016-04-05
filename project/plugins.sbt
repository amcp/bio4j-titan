resolvers += "Era7 maven releases" at "https://s3-eu-west-1.amazonaws.com/releases.era7.com"
resolvers += "Era7 maven snapshots" at "https://s3-eu-west-1.amazonaws.com/snapshots.era7.com"
resolvers += "jitpack" at "https://jitpack.io"

addSbtPlugin("ohnosequences" % "nice-sbt-settings" % "0.7.0-SNAPSHOT")
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")
