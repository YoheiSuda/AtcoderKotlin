package abc052

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val s = sc.next()
	var maxCount = 0
	var currentCount = 0
	for (i in 0 until n) {
		if (s[i] == 'I') {
			currentCount++
		} else {
			currentCount--
		}
		maxCount = Math.max(maxCount, currentCount)
	}

	println(maxCount)
}