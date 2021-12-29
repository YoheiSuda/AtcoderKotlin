package abc064

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class A064KtTest {
	@Test
	fun test1() {
		assertEquals(problemA064(4,3,2), "YES")
	}

	@Test
	fun test2() {
		assertEquals(problemA064(2,3,4), "NO")
	}
}