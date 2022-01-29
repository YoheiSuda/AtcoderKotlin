package abc068

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val m = sc.nextInt()
	val ab = (0 until m).map { sc.nextInt() to sc.nextInt() }
	println(problemC068(n, m, ab))
}

fun problemC068(n: Int, m: Int, ab: List<Pair<Int, Int>>): String {
	val nSet = ab.filter { it.second == n }.map { it.first }.toSet()
	val oneList = ab.filter { it.first == 1 }
	return if (oneList.find { nSet.contains(it.second) } != null)
		"POSSIBLE" else
		"IMPOSSIBLE"
}