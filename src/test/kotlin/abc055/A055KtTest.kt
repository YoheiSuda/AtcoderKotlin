package abc055

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class A055KtTest {
	@Test
	fun test1() {
		assertEquals(problemA055(20), 15800)
	}

	@Test
	fun test2() {
		assertEquals(problemA055(60), 47200)
	}
}