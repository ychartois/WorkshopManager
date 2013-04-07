import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

	val appName         = "Workshop-Manager"
	val appVersion      = "1.0-SNAPSHOT"

	/*
	 * Versions des dépendances, quand il définir plusieurs
	 * composants avec les mêmes numéros de version.
	 */

	// Add your project dependencies here,
	val appDependencies = Seq(
		javaCore, javaJdbc, javaEbean,
		"org.webjars" 					% "webjars-play" 					% "2.1.0",
    	"org.webjars" 					% "bootstrap" 						% "2.1.1",
    	"org.easytesting" 				% "fest-assert-core" 				% "2.0M7",
    	"commons-lang" 					% "commons-lang" 					% "2.6",
		"mysql" 						% "mysql-connector-java" 			% "5.1.20"
	)

  	val main = play.Project(appName, appVersion, appDependencies).settings(
  		resolvers += Resolver.url("Objectify Play Repository", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns),
  		resolvers += Resolver.url("Objectify Play Snapshot Repository", url("http://schaloner.github.com/snapshots/"))(Resolver.ivyStylePatterns),
	 	ebeanEnabled := true
	 )
}
