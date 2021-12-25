package abc056

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val homeX = sc.nextLong()

	println(problemC056(homeX))
}

fun problemC056(homeX: Long): Long {
	var time = 0L
	var currentX = 0L

	while (currentX < homeX) {
		time++
		currentX += time
	}

	return time
}