package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val x = sc.nextLong()
	val aList = (0 until n).map { sc.nextLong() }
	if (aList.contains(x)) {
		println("Yes")
	} else {
		println("No")
	}
}