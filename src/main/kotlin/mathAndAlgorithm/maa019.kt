package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	var count1 = 0L
	var count2 = 0L
	var count3 = 0L

	for (i in 0 until n) {
		when(sc.nextInt()) {
			1 -> {
				count1++
			}
			2 -> {
				count2++
			}
			3 -> {
				count3++
			}
		}
	}

	var ans1 = 0L
	var ans2 = 0L
	var ans3 = 0L

	ans1 = if (count1 >= 2) {
		(count1 * (count1 - 1)) / 2
	} else {
		0
	}
	ans2 = if (count2 >= 2) {
		(count2 * (count2 - 1)) / 2
	} else {
		0
	}
	ans3 = if (count3 >= 2) {
		(count3 * (count3 - 1)) / 2
	} else {
		0
	}

	println(ans1 + ans2 + ans3)
}