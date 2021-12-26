package abc060

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class C060KtTest {
	@Test
	fun test1() {
		assertEquals(problemC060(4, mutableListOf(0, 3)), 7)
	}

	@Test
	fun test2() {
		assertEquals(problemC060(4, mutableListOf(0, 5)), 8)
	}

	@Test
	fun test3() {
		assertEquals(problemC060(1000000000, mutableListOf(0, 1000, 1000000, 1000000000)), 2000000000)
	}

	@Test
	fun test4() {
		assertEquals(problemC060(1, mutableListOf(0)), 1)
	}

	@Test
	fun test5() {
		assertEquals(problemC060(10, mutableListOf(0, 3, 5, 7, 100, 110, 200, 300, 311)), 67)
	}

}