package abc056

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class A056KtTest {
	@Test
	fun test1() {
		assertEquals(problemA056("H", "H"), "H")
	}

	@Test
	fun test2() {
		assertEquals(problemA056("D", "H"), "D")
	}

	@Test
	fun test3() {
		assertEquals(problemA056("D", "D"), "H")
	}
}