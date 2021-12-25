package abc052

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val a = sc.nextInt()
	val b = sc.nextInt()
	var xArr = ArrayList<Int>()
	for (i in 0 until n) {
		xArr.add(sc.nextInt())
	}

//	歩くかテレポートするかのジャッジ
//	座標の差分がこの数字より大きければテレポートする
	val aOrB = b / a

	var kyori: Int
	var tiredCount: Long = 0
	for (j in 1 until n) {
		kyori = xArr[j] - xArr[j - 1]
		if (kyori > aOrB) {
			tiredCount += b
		} else {
			tiredCount += a * kyori
		}
	}

	println(tiredCount)
}