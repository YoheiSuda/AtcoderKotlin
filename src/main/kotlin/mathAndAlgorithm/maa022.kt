package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextLong()
	val list = (0 until n).map { sc.nextInt() }
	val count = Array(100000) { 0L }

	list.map { it ->
		count[it] += 1L
	}

	var ans = 0L

	for (i in 1..49999) {
		ans += count[i] * count[100000 - i]
	}
	ans += count[50000] * (count[50000] - 1) / 2

	println(ans)
}

