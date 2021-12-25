package abc055

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class B055KtTest {
	@Test
	fun test1() {
		assertEquals(problemB055(3), 6)
	}

	@Test
	fun test2() {
		assertEquals(problemB055(10), 3628800)
	}

	@Test
	fun test3() {
		assertEquals(problemB055(100000), 457992974)
	}
}