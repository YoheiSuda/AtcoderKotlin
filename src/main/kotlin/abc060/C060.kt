package abc060

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val personNum = sc.nextLong()
	val oyuTime = sc.nextLong()
	val personTime = mutableListOf<Long>()
	for (i in 1..personNum) {
		personTime.add(sc.nextLong())
	}
	println(problemC060(oyuTime, personTime))
}

fun problemC060(oyuTime: Long, personTime: MutableList<Long>): Long {
	var prevPersonTime = 0L
	var ans: Long = 0L

	if (personTime.size != 1) {
		for (i in 1 until personTime.size) {
			val durationTime = personTime[i] - prevPersonTime
			if (oyuTime > durationTime) {
				ans += durationTime
			} else {
				ans += oyuTime
			}
			prevPersonTime = personTime[i]
		}
	}

	ans += oyuTime
	return  ans
}