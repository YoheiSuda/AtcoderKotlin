package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	var ans = 1L
	for (i in 2..n) {
		ans *= i
	}
	println(ans)
}