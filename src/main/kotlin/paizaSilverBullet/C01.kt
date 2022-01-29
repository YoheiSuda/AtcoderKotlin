package paizaSilverBullet

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val s = sc.next().toCharArray()
	val n = sc.nextInt()
	val xy = (0 until n).map { sc.nextInt() to sc.nextInt()}
	println(problemC01(s, n, xy))
}

fun problemC01(s: CharArray, n: Int, xy: List<Pair<Int, Int>>): String {
	var ansS = s.toMutableList()
	for (i in 0 until n) {
		for (j in (xy[i].first - 1) until xy[i].second) {
			if (ansS[j] == '0') {
				ansS[j] = '1'
			} else {
				ansS[j] = '0'
			}
		}
	}

	return ansS.joinToString("")
}