package abc236

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val s = sc.next()
	val a = sc.nextInt()
	val b = sc.nextInt()
	var ans = ""
	s.forEachIndexed { index, c ->
		if (index == a - 1) {
			ans += s[b - 1]
		} else if (index == b - 1) {
			ans += s[a - 1]
		} else {
			ans += c
		}
	}

	println(ans)
}