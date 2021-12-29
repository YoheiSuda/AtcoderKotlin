package abc090

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val sList = (0 until 3).map { sc.next()}

	println("" + sList[0][0] + sList[1][1] + sList[2][2])
}