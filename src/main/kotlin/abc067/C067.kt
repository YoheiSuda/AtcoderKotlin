package abc067

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val aList = (0 until n).map{ sc.nextLong() }

	println(problemC067(n, aList))
}

fun problemC067(n:Int, aList: List<Long>): Long? {
	var snuke = 0L
	var araiguma = aList.sum()
	var ans: Long? = null

	for (i in 0 until (n - 1)) {
		snuke += aList[i]
		araiguma -= aList[i]
		if (ans == null) {
			ans = Math.abs((snuke) - (araiguma))
		} else {
			ans = Math.min(ans, Math.abs((snuke) - (araiguma)))
		}
	}

	return ans
}