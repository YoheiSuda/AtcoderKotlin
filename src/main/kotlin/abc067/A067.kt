package abc067

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val a = sc.nextInt()
	val b = sc.nextInt()
	println(problemA067(a, b))
}

fun problemA067(a: Int, b: Int): String {
	var ans = "Possible"
	if (a % 3 != 0 && b % 3 != 0 && (a + b) % 3 != 0) {
		ans = "Impossible"
	}

	return ans
}