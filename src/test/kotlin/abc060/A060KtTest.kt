package abc060

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class A060KtTest {
	@Test
	fun test1() {
		assertEquals(problemA060("rng", "gorilla", "apple"), "YES")
	}

	@Test
	fun test2() {
		assertEquals(problemA060("yakiniku", "unagi", "sushi"), "NO")
	}

	@Test
	fun test3() {
		assertEquals(problemA060("a", "a", "a"), "YES")
	}

	@Test
	fun test4() {
		assertEquals(problemA060("aaaaaaaaab", "aaaaaaaaaa", "aaaaaaaaab"), "NO")
	}

}