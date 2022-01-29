package paizaSilverBullet

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val sList = (0 until n).map { sc.next() }
	for (i in 0 until n) {
		var prev = ""
		var prevCommentIndex = -1
		run loop@ {
			sList[i].forEachIndexed { index, c ->
				if (prev == "/" && c == '/') {
					prevCommentIndex = index - 1
					return@loop
				}
				prev = "" + c
			}
		}

		if (prevCommentIndex == -1) {
			println(sList[i])
		} else {
			println(sList[i].take(prevCommentIndex))
		}
	}
}