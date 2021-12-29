package abc089

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val arareNum = sc.nextInt()

	var hasYellow = false

	for (i in 1.. arareNum) {
		if (sc.next() == "Y") {
			hasYellow = true
		}
	}

	if (hasYellow) {
		println("Four")
	} else {
		println("Three")
	}
}
