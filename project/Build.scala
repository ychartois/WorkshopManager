import sbt._
import Keys._
import play.Project._
import com.typesafe.config._

object ApplicationBuild extends Build {

  // We get the application.conf file to read some properties
  val conf = ConfigFactory.parseFile(new File("conf/application.conf")).resolve()

  val appName    = conf.getString("app.name")
  val appVersion = conf.getString("app.version")

	// Add your project dependencies here,
  val appDependencies = Seq(
    javaCore, javaJdbc, javaEbean, cache,
    "org.webjars" % "webjars-play" % "2.1.0-1",
    "org.webjars" % "bootstrap" % "2.3.2",
    "org.webjars" % "bootstrap-datetimepicker" % "6aa746736d",
    "org.easytesting" % "fest-assert-core" % "2.0M7",
    "commons-lang" % "commons-lang" % "2.6",
    "org.apache.commons" % "commons-io" % "1.3.2",
    "mysql" % "mysql-connector-java" % "5.1.20",
    "org.mockito" % "mockito-core" % "1.8.5",
    "org.apache.httpcomponents" % "httpclient" % "4.3.3"
  )

  	val main = play.Project(appName, appVersion, appDependencies).settings(
  		resolvers += Resolver.url("Objectify Play Repository", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns),
  		resolvers += Resolver.url("Objectify Play Snapshot Repository", url("http://schaloner.github.com/snapshots/"))(Resolver.ivyStylePatterns),
	 	  ebeanEnabled := true,
      compile in Test <<= PostCompile(Test),
Keys.fork in (Test) := false
	 )
}
