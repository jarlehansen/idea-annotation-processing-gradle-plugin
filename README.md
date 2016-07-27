# IDEA Annotation Processing Gradle Plugin

![Annotation Processing](https://s31.postimg.org/rz06r66yj/annotation_processing.png)

## Installation

```groovy
buildscript {
  dependencies {
    classpath('com.github.idea.angit ininotation.processing:idea-annotation-processing-gradle-plugin:0.0.1-SNAPSHOT')
  }
}

apply plugin: 'com.github.idea.annotation.processing'
```

## Usage

```
./gradlew enableAnnotationProcessing
```