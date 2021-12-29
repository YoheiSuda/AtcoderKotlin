package abc063

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class B063KtTest {
	@Test
	fun test1() {
		assertEquals(problemB063("uncopyrightable"), "yes")
	}

	@Test
	fun test2() {
		assertEquals(problemB063("different"), "no")
	}

	@Test
	fun test3() {
		assertEquals(problemB063("no"), "yes")
	}
}