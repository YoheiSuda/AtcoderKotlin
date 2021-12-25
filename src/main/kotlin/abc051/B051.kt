package abc051

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val k = sc.nextInt()
	val s = sc.nextInt()

	var result = 0
	for (x in 0..k) {
		for (y in 0..k) {
			if (x + y > s) break
			if (s - (x + y) <= k) {
				result++
			}
		}
	}

	print(result)

}