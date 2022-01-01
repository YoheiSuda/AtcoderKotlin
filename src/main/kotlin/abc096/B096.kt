package abc096

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val a = sc.nextInt()
	val b = sc.nextInt()
	val c = sc.nextInt()
	val k = sc.nextInt()

	var maxAbc = 0
	var notMax1 = 0
	var notMax2 = 0
	if (a >= b && a >= c) {
		maxAbc = a
		notMax1 = b
		notMax2 = c
	} else if (b >= a && b >= c) {
		maxAbc = b
		notMax1 = a
		notMax2 = c
	} else if (c >= a && c >= b) {
		maxAbc = c
		notMax1 = a
		notMax2 = b
	}

	for (i in 0 until k) {
		maxAbc *= 2
	}

	val ans = maxAbc + notMax1 + notMax2
	println(ans)

}