package abc233

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val x = sc.nextInt()
	val y = sc.nextInt()

	val sa = y - x
	if (sa <= 0) {
		println(0)
	} else {
		if (sa % 10 != 0) {
			println(sa / 10 + 1)
		} else {
			println(sa / 10)
		}
	}
}