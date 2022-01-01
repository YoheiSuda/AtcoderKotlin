package abc096

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val month = sc.nextInt()
	val day = sc.nextInt()

	println(problemA096(month, day))
}

fun problemA096(month: Int, day: Int): Int {
	var count = 0
	for (i in 1..12) {
		if (i < month) {
			count++
		} else if(i == month) {
			if(i <= day) {
				count++
			}
		}
	}

	return count
}