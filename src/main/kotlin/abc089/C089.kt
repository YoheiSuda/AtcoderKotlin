package abc089

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val personNum = sc.nextLong()

	val march = mutableListOf<Long>(0,0,0,0,0)

 	for (i in 1..personNum) {
		when(sc.next().take(1)) {
			"M" -> {
				march[0] += 1L
			}
			"A" -> {
				march[1] += 1L
			}
			"R" -> {
				march[2] += 1L
			}
			"C" -> {
				march[3] += 1L
			}
			"H" -> {
				march[4] += 1L
			}
		}
	}

	var ans = 0L

	if(personNum < 3) {
		println(0)
	} else {
		for (i in 0 until march.size) {
			for (j in i until march.size) {
				for (k in j until march.size) {
					if (i != j && i != k && j != k) {
						ans += march[i] * march[j] * march[k]
					}
				}
			}
		}
		println(ans)
	}
}