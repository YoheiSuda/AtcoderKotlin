package abc235

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val hList = (0 until n).map { sc.nextLong() }

	var hIndex = 0
	var ans = 0L
	while(true) {
		if (hIndex != (n - 1) && hList[hIndex + 1] > hList[hIndex]) {
			hIndex++
		} else {
			ans = hList[hIndex]
			break
		}
	}

	println(ans)
}