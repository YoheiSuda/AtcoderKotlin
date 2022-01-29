package mathAndAlgorithm

import java.util.*

fun main() {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()

	val dp = mutableListOf<Long>()

	for (i in 0..n) {
		if (i == 0 || i == 1) dp.add(1)
		if (i >= 2) {
			dp.add(dp[i - 1] + dp[i - 2])
		}
	}

	println(dp[n])
}
