package abc063

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class A063KtTest {
	@Test
	fun test1() {
		assertEquals(problemA063(6,3), 9)
	}

	@Test
	fun test2() {
		assertEquals(problemA063(6,4), "error")
	}
}