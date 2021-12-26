package abc058

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class A058KtTest {
	@Test
	fun test1() {
		assertEquals(problemA058(2,4,6), "YES")
	}

	@Test
	fun test2() {
		assertEquals(problemA058(2,5,6), "NO")
	}

	@Test
	fun test3() {
		assertEquals(problemA058(3,2,1), "YES")
	}
}