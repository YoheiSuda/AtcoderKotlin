package abc053

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val s = sc.next()

	val ans = s.substring(s.indexOfFirst{ it == 'A'}, s.indexOfLast { it == 'Z'})

	println(ans.length + 1)
}