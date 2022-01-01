package abc093

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val a = sc.nextLong()
	val b = sc.nextLong()
	val k = sc.nextInt()

	problemB093(a, b, k)
}

fun problemB093(a: Long, b: Long, k: Int) {
	var count = 1
	for (i in a..b) {
		if (count <= k) {
			println(i)
			count++
		} else if (i > (b - k)){
			println(i)
		}
 	}
}