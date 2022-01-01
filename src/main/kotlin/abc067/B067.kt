package abc067

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val k = sc.nextInt()
	val stickList = (0 until n).map { sc.nextInt() }.toMutableList()

	println(problemB067(n, k, stickList))
}

fun problemB067(n: Int, k: Int, stickList: MutableList<Int>): Int {
	stickList.sortDescending()
	var sum = 0
	for (i in 0 until k) {
		sum += stickList[i]
	}

	return sum
}