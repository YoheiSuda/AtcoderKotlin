package abc063

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val problemN = sc.nextInt()
	val scores = ArrayList<Int>()

	for (i in 0 until problemN) {
		scores.add(sc.nextInt())
	}

	println(problem063c(problemN, scores))
}

fun problem063c(n: Int, s: ArrayList<Int>): Int {
	val dp = (0 until n).map { Array<Int>(n + 1) { 0 } }
	for (i in 1 until n + 1) {
		dp[0][i] = s[0]
	}
	for (i in 1 until n) {
		for (j in 0 until n + 1) {
			if (i == j) {
				dp[i][j] = dp[i - 1][j]
			} else {
				dp[i][j] = dp[i - 1][j] + s[i]
			}
		}
	}
	var max = 0

	dp[n - 1].forEach {
		if (it % 10 != 0) max = Math.max(max, it)
	}
	return max
}