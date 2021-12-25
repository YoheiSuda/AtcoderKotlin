package abc055

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()

	println(problemA055(n))
}

fun problemA055(n: Int): Int {
	var ans = (n * 800) - (n / 15 * 200)
	return ans
}