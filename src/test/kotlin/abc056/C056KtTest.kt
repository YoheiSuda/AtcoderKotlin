package abc056

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class C056KtTest {
	@Test
	fun test1() {
		assertEquals(problemC056(6), 3)
	}

	@Test
	fun test2() {
		assertEquals(problemC056(2), 2)
	}

	@Test
	fun test3() {
		assertEquals(problemC056(11), 5)
	}
}