package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val r = sc.nextInt()

	var tmp_n  = n
	var tmp_r = r

	var ans = 1L
	var divide = 1L

	for (i in 0 until r) {
		ans *= tmp_n
		divide *= tmp_r
		tmp_n--
		tmp_r--
	}
	ans /= divide
	println(ans)
}