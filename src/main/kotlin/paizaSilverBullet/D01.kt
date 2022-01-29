package paizaSilverBullet

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val s1 = sc.next()
	val s2 = sc.next()

	if (s2.contains(s1)) {
		println("DANGER")
	} else {
		println("OK")
	}
}