package abc069

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	var s = sc.next()

	val sStart = s.take(1)
	val sEnd = s.takeLast(1)
	s = s.drop(1)
	s = s.dropLast(1)

	println(sStart + (s.length) + sEnd)
}