package abc060

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class B060KtTest {
	@Test
	fun test1() {
		assertEquals(problemB060(7,5,1), "YES")
	}

	@Test
	fun test2() {
		assertEquals(problemB060(2,2,1), "NO")
	}

	@Test
	fun test3() {
		assertEquals(problemB060(1,100,97), "YES")
	}

	@Test
	fun test4() {
		assertEquals(problemB060(40,98,58), "YES")
	}

	@Test
	fun test5() {
		assertEquals(problemB060(77,42,36), "NO")
	}
}