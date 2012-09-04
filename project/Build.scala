import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {
	
	val appName         = "Workshop-Manager"
	val appVersion      = "1.0-SNAPSHOT"
	
	/*
	 * Versions des dépendances, quand il définir plusieurs
	 * composants avec les mêmes numéros de version.
	 */
	val hibernateVersion	= "4.1.6.Final"
	
	// Add your project dependencies here,
	val appDependencies = Seq(
		
		// Nécesaire pour JPA, utilisez dans le persistence.xml
		"com.github.twitter" 			% "bootstrap" 						% "2.0.2",
		"org.hibernate" 				% "hibernate-entitymanager"			% hibernateVersion
		
	)
	
	val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
		// Add your own project settings here
		ebeanEnabled := false
	)

}
