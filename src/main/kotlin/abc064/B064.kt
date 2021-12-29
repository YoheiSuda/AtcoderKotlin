package abc064

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val houseN = sc.nextInt()
	var min = 10000
	var max = -1

	for (i in 0 until houseN) {
		var houseLocation = sc.nextInt()
		min = Math.min(min, houseLocation)
		max = Math.max(max, houseLocation)
	}

	println(max - min)
}