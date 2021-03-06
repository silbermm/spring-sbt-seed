name := "spring-sbt"

version := "1.0"

scalaVersion := "2.10.2"

val springVersion = "4.0.0.RELEASE"

val hibernateVersion = "4.1.9.Final"

seq(webSettings :_*)

libraryDependencies ++= Seq(	
	"org.eclipse.jetty" % "jetty-webapp" % "8.0.1.v20110908" % "container",
	"org.apache.tomcat" % "jasper" % "6.0.37" % "container",
	"javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided",
	"javax.servlet" % "jstl" % "1.1.2",
	"taglibs" % "standard" % "1.1.2",
	"org.springframework" % "spring-core" % springVersion,
	"org.springframework" % "spring-context" % springVersion,
	"org.springframework" % "spring-web" % springVersion,
	"org.springframework" % "spring-webmvc" % springVersion,
	"org.springframework" % "spring-orm" % springVersion,
	"org.springframework" % "spring-test" % springVersion % "test",
	"org.springframework.amqp" % "spring-rabbit" % "1.1.4.RELEASE",
	"org.springframework.data" % "spring-data-mongodb" % "1.3.3.RELEASE",
	"org.hibernate" % "hibernate-entitymanager" % hibernateVersion,
	"org.hibernate" % "hibernate-validator" % "4.1.0.Final",
	"org.hibernate.javax.persistence" % "hibernate-jpa-2.0-api" % "1.0.1.Final",
	"com.fasterxml.jackson.datatype" % "jackson-datatype-hibernate4" % "2.1.1",
	"commons-pool" %  "commons-pool" % "1.6",
	"commons-dbcp" % "commons-dbcp" % "1.4",
	"commons-collections" % "commons-collections" % "3.2.1",
	"javassist" % "javassist" % "3.3",
	"com.typesafe" % "config" % "1.0.0",
	"junit" % "junit" % "4.10" % "test",
	"ch.qos.logback" % "logback-classic" % "1.0.13",
	"ch.qos.logback" % "logback-core" % "1.0.13",
	"org.slf4j" % "slf4j-api" % "1.6.0",
	"org.slf4j" % "jcl-over-slf4j" % "1.6.0",
	"hsqldb" % "hsqldb" % "1.8.0.10"	
)

