**************************************************************
Build.sbt file content

name := "untitled1"  ** Project name

version := "1.0"     ** Version

scalaVersion := "2.12.2"  ** Scala Version 

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.36"  ** mysql JDBC Connectivity

libraryDependencies += "com.typesafe" % "config" % "1.3.1"   ** Typesafe - to auto fetch host details from Application.properties file

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.6.2"  ** utilize spark core properties.
         
