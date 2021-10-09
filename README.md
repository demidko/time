# [Time](https://jitpack.io/#demidko/time)

Library for displaying durations in a readable form.

## Download

You need Gradle or Maven or other build system.

[![](https://jitpack.io/v/demidko/time.svg)](https://jitpack.io/#demidko/time)

## Usage

```kotlin
import kotlin.time.Duration.Companion.days
import com.github.demidko.time.print
import com.github.demidko.time.printSeconds

val humanDurationView = days(365).print()         // "1yr"
val humanSecondsView = 1232443224L.printSeconds() // "39yr 29d 9h 20m 24s"
```




