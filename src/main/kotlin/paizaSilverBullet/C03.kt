package paizaSilverBullet

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val abList = (0 until n).map { sc.next() to sc.nextInt() }

	for (i in 0 until n) {
		var ans = "No"
		var sList = abList[i].first.toCharArray()
		if (sList[0].toString().toInt() + (sList[1].toString() + sList[2]).toInt() == abList[i].second) {
			ans = "Yes"
		} else if ((sList[0].toString() + sList[1]).toInt() + sList[2].toString().toInt() == abList[i].second) {
			ans = "Yes"
		} else if (sList[0].toString().toInt() + sList[1].toString().toInt() + sList[2].toString().toInt() == abList[i].second) {
			ans = "Yes"
		}
		println(ans)
	}
}