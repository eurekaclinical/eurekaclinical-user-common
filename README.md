# Shared code for the Eureka! Clinical User microservice
Atlanta Clinical and Translational Science Institute, Emory University, Atlanta, GA

## Version 1.0 development series
Latest release: [![Latest release](https://maven-badges.herokuapp.com/maven-central/org.eurekaclinical/eurekaclinical-user-common/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.eurekaclinical/eurekaclinical-user-common)

## Version history
No final releases yet

## What does it do?
It contains classes that are shared between `eurekaclinical-user-webapp` and `eurekaclinical-user-service`.

## Build requirements
* [Oracle Java JDK 8](http://www.oracle.com/technetwork/java/javase/overview/index.html)
* [Maven 3.2.5 or greater](https://maven.apache.org)

## Runtime requirements
* [Oracle Java JRE 8](http://www.oracle.com/technetwork/java/javase/overview/index.html)
* [Tomcat 7](https://tomcat.apache.org)

## Building it
The project uses the maven build tool. Typically, you build it by invoking `mvn clean install` at the command line. For simple file changes, not additions or deletions, you can usually use `mvn install`. See https://github.com/eurekaclinical/dev-wiki/wiki/Building-Eureka!-Clinical-projects for more details.

## Maven dependency
```
<dependency>
    <groupId>org.eurekaclinical</groupId>
    <artifactId>eurekaclinical-user-common</artifactId>
    <version>version</version>
</dependency>
```

## Developer documentation
* [Javadoc for latest development release](http://javadoc.io/doc/org.eurekaclinical/eurekaclinical-user-common) [![Javadocs](http://javadoc.io/badge/org.eurekaclinical/eurekaclinical-user-common.svg)](http://javadoc.io/doc/org.eurekaclinical/eurekaclinical-user-common)

## Getting help
Feel free to contact us at help@eurekaclinical.org.

