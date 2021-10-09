package com.github.demidko.time

import kotlin.time.Duration

fun Duration.print() = inWholeSeconds.printSeconds()

fun Long.printSeconds() = toULong().printSeconds()

fun ULong.printSeconds() = when (val t = grepYears()) {
  "" -> "0s"
  else -> t.trim()
}

private val years = 60UL * 60UL * 24UL * 365UL

private fun ULong.grepYears() = when (val count = div(years)) {
  0UL -> grepMonth()
  else -> "${count}yr ${minus(count * years).grepMonth()}"
}

private val months = 60UL * 60UL * 24UL * 30UL

private fun ULong.grepMonth() = when (val count = div(months)) {
  0UL -> grepDays()
  else -> "${count}mo ${minus(count * months).grepDays()}"
}

private val days = 60UL * 60UL * 24UL

private fun ULong.grepDays() = when (val count = div(days)) {
  0UL -> grepHours()
  else -> "${count}d ${minus(count * days).grepHours()}"
}

private val hours = 60UL * 60UL

private fun ULong.grepHours() = when (val count = div(hours)) {
  0UL -> grepMinutes()
  else -> "${count}h ${minus(count * hours).grepMinutes()}"
}

private const val minutes = 60UL

private fun ULong.grepMinutes() = when (val count = div(minutes)) {
  0UL -> grepSeconds()
  else -> "${count}m ${minus(count * minutes).grepSeconds()}"
}

private fun ULong.grepSeconds() = when (this) {
  0UL -> ""
  else -> "${this}s"
}