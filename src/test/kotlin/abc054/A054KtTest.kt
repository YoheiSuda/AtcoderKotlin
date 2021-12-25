package abc054

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class A054KtTest {
	@Test
	fun success1() {
		assertEquals(problem054a(8,6), "Alice")
	}

	@Test
	fun success2() {
		assertEquals(problem054a(1,1), "Draw")
	}

	@Test
	fun success3() {
		assertEquals(problem054a(13,1), "Bob")
	}
}