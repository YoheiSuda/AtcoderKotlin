package abc055

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class C055KtTest {
	@Test
	fun test1() {
		assertEquals(problemC055(1,6), 2)
	}

	@Test
	fun test2() {
		assertEquals(problemC055(12345, 678901), 175897)
	}

}