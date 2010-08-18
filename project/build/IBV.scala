import sbt._

class IBVProject(info: ProjectInfo) extends DefaultWebProject(info)
{
	val mavenLocal = "Local Maven Repository" at "file://"+Path.userHome+"/.m2/repository"
	val springReleases = "Spring Releases Repository" at "http://maven.springframework.org/"

	val jetty7 = "org.eclipse.jetty" % "jetty-webapp" % "7.0.2.v20100331" % "test"
	
	val springContext = "org.springframework" % "spring-context" % "3.0.0.RELEASE" % "runtime"
  	val springWeb = "org.springframework" % "spring-web" % "3.0.0.RELEASE" % "runtime"
  	val springWebServlet = "org.springframework" % "spring-webmvc" % "3.0.0.RELEASE" % "runtime" 
}