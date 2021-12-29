package abc061

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class A061KtTest {
	@Test
	fun test1() {
		assertEquals(problemA061(1,3,2), "Yes")
	}

	@Test
	fun test2() {
		assertEquals(problemA061(6,5,4), "No")
	}

	@Test
	fun test3() {
		assertEquals(problemA061(2,2,2), "Yes")
	}

}