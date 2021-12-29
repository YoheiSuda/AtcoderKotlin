package abc066

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val bells = (1..3).map { sc.nextInt() }
	val bellSorted = bells.sorted()
	println(bellSorted[0] + bellSorted[1])
}