package abc053

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val x = sc.nextLong()
	val ans: Long
	if (x < 7) {
		println(1)
	} else if (x < 11) {
		println(2)
	} else {
		ans = x / 11
		if (x % 11 == 0L) {
			println(ans * 2)
		} else if (x % 11 > 6) {
			println(ans * 2 + 2)
		} else {
			println(ans * 2 + 1)
		}
	}
}