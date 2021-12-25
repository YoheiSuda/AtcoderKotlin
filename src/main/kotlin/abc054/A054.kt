package abc054

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val a = sc.nextInt()
	val b = sc.nextInt()

	println(problem054a(a,b))

}

fun problem054a(a: Int, b: Int): String {
	var ans: String
	if (a == b) {
		ans = "Draw"
	} else if (a > b) {
		if (b != 1) {
			ans = "Alice"
		} else {
			ans = "Bob"
		}
	} else {
		if (a != 1) {
			ans = "Bob"
		} else {
			ans = "Alice"
		}
	}
	return ans
}