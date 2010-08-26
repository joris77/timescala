import sbt._

class IBVProject(info: ProjectInfo) extends DefaultWebProject(info)
{
  val mavenLocal = "Local Maven Repository" at "file://" + Path.userHome + "/.m2/repository"
  val springReleases = "Spring Releases Repository" at "http://maven.springframework.org/"
  val jboss = "JBoss repository" at "http://repository.jboss.org/nexus/content/groups/public-jboss/"



  val jetty7 = "org.eclipse.jetty" % "jetty-webapp" % "7.0.2.v20100331" % "test"

  val commonsDbcp = "commons-dbcp" % "commons-dbcp" % "1.4"

  val slf4j = "org.slf4j" % "slf4j-simple" % "1.6.1"

  val mysql = "mysql" % "mysql-connector-java" % "5.1.13" % "runtime"

  val springContext = "org.springframework" % "spring-context" % "3.0.4.RELEASE"
  val springWeb = "org.springframework" % "spring-web" % "3.0.4.RELEASE"
  val springWebServlet = "org.springframework" % "spring-webmvc" % "3.0.4.RELEASE"
  val springJpa = "org.springframework" % "spring-orm" % "3.0.4.RELEASE"
  val springTest = "org.springframework" % "spring-test" % "3.0.4.RELEASE"

  val hibernate = "org.hibernate" % "hibernate-core" % "3.5.3-Final"
  val hibernateEntitymanager = "org.hibernate" % "hibernate-entitymanager" % "3.5.5-Final"
  val hibernateAnnotations = "org.hibernate" % "hibernate-annotations" % "3.5.5-Final"
  val hibernateCommonsAnnotations = "org.hibernate" % "hibernate-commons-annotations" % "3.2.0.Final"
  val hibernateJpa20Api = "org.hibernate.javax.persistence" % "hibernate-jpa-2.0-api" % "1.0.0.Final"

  val liquibase = "org.liquibase" % "liquibase-core" % "2.0-rc5" % "runtime"

  val testNG = "org.testng" % "testng" % "5.13.1" % "test"


}