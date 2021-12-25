package abc056

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class B056KtTest {
	@Test
	fun test1() {
		assertEquals(problemB056(3,2,6), 1)
	}

	@Test
	fun test2() {
		assertEquals(problemB056(3,1,3), 0)
	}

	@Test
	fun test3() {
		assertEquals(problemB056(5,10,1), 4)
	}
}