# IDEA Annotation Processing Gradle Plugin

Enable the annotation processing setting in IntelliJ IDEA.  
This option is required in combination with [Project Lombok](https://projectlombok.org/).

Tested with IntelliJ IDEA version 2016.2

----

![Annotation Processing](https://s31.postimg.org/rz06r66yj/annotation_processing.png)

## Installation

```groovy
buildscript {
	repositories {
        maven {
            url  "http://dl.bintray.com/jarlehansen/maven"
        }
    }
	dependencies {
		classpath('com.github.idea.annotation.processing:idea-annotation-processing-gradle-plugin:0.0.3')
	}
}

apply plugin: 'com.github.idea.annotation.processing'
```

## Usage

```
./gradlew enableAnnotationProcessing
```

or

```
./gradlew eAP
```

## Development

Upload new version to bintray

```groovy
./gradlew bintrayUpload -PbintrayUser= -PbintrayKey=
```