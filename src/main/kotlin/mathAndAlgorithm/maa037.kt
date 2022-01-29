package mathAndAlgorithm

import java.util.*

// todo: ダメっぽいのでロジック理解して組み直そう
fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val x1 = sc.nextLong()
	val y1 = sc.nextLong()
	val x2 = sc.nextLong()
	val y2 = sc.nextLong()
	val x3 = sc.nextLong()
	val y3 = sc.nextLong()
	val x4 = sc.nextLong()
	val y4 = sc.nextLong()

	val ans1 = cross(x2 - x1, y2 - y1, x3 - x1, y3 - y1)
	val ans2 = cross(x2 - x1, y2 - y1, x4 - x1, y4 - y1)
	val ans3 = cross(x4 - x3, y4 - y3, x1 - x3, y1 - y3)
	val ans4 = cross(x4 - x3, y4 - y3, x2 - x3, y2 - y3)

	var ans = ""

	// 全て一直線に並んでいる場合
	if (ans1 == 0L && ans2 == 0L && ans3 == 0L && ans4 == 0L) {
		val a = x1 to y1
		val b = x2 to y2
		val c = x3 to y3
		val d = x4 to y4

		var ab1: Pair<Long, Long>
		var ab2: Pair<Long, Long>
		if (a.first > b.first && a.second > b.second) {
			ab1 = b
			ab2 = a
		} else {
			ab1 = a
			ab2 = b
		}

		var ab3: Pair<Long, Long>
		var ab4: Pair<Long, Long>
		if (c.first > d.first && c.second > d.second) {
			ab3 = d
			ab4 = c
		} else {
			ab3 = c
			ab4 = d
		}

		if (Math.max(ab1.first, ab3.first) <= Math.min(ab2.first, ab4.first) && Math.max(ab1.second, ab3.second) <= Math.min(ab2.second, ab4.second)) {
			ans = "Yes"
		} else {
			ans = "No"
		}
	} else {
		var isAB = false
		var isCD = false

		if (ans1 >= 0 && ans2 <= 0) {
			isAB = true
		}
		if (ans1 <= 0 && ans2 >= 0) {
			isAB = true
		}

		if (ans3 >= 0 && ans4 <= 0) {
			isCD = true
		}
		if (ans3 <= 0 && ans4 >= 0) {
			isCD = true
		}

		if (isAB && isCD) {
			ans = "Yes"
		} else {
			ans = "No"
		}
	}

	println(ans)
}

fun cross(ax: Long, ay: Long, bx: Long, by: Long): Long {
	return ax * by - ay * bx
}