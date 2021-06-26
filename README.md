# [print-utils](https://jitpack.io/#demidko/print-utils)

Library for displaying durations in a readable form.

## Usage

```kotlin
val humanView = 1232443224L.printSeconds() // "39yr 29d 9h 20m 24s"
```

## Download with [Gradle](https://gradle.org/)

Add the JitPack repository to your `build.gradle.kts`:

```kotlin
repositories {
    maven("https://jitpack.io")
}
```

Add the dependency:

```kotlin
dependencies {
    implementation("com.github.demidko:print-utils:2021.06.27")
}
```

## Download with [Maven](https://maven.apache.org/)

Add the JitPack repository to your `pom.xml`:

```xml

<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```

Add the dependency:

```xml

<dependencies>
  <dependency>
    <groupId>com.github.demidko</groupId>
    <artifactId>print-utils</artifactId>
    <version>2021.06.27</version>
  </dependency>
</dependencies>
```




