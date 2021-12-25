package abc052

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val a = sc.nextInt()
	val b = sc.nextInt()
	val c = sc.nextInt()
	val d = sc.nextInt()

	val ab = a * b
	val cd = c * d

	if (ab > cd) {
		println(ab)
	} else {
		println(cd)
	}

}