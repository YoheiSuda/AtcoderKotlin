package abc058

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class B058KtTest {
	@Test
	fun test1() {
		assertEquals(problemB058("xyz", "abc"), "xaybzc")
	}

	@Test
	fun test2() {
		assertEquals(problemB058("atcoderbeginnercontest", "atcoderregularcontest"), "aattccooddeerrbreeggiunlnaerrccoonntteesstt")
	}
}