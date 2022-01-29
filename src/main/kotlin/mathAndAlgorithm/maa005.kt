package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val aList = (0 until n).map { sc.nextInt() }

	println(aList.sum() % 100)
}