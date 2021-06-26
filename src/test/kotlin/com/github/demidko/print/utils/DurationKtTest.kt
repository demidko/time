package com.github.demidko.print.utils

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Test
import kotlin.time.Duration

class PrinterKtTest {

  @Test
  fun toHumanTime() {
    assertThat(Duration.days(365).print(), equalTo("1yr"))
    assertThat(Duration.days(365).inWholeSeconds.printSeconds(), equalTo("1yr"))
    assertThat(0L.printSeconds(), equalTo("0s"))
    assertThat((60L * 60L * 24L * 365L).printSeconds(), equalTo("1yr"))
    assertThat((60L * 60L * 24L * 365 + 12).printSeconds(), equalTo("1yr 12s"))
    assertThat(1232443224L.printSeconds(), equalTo("39yr 29d 9h 20m 24s"))
  }
}