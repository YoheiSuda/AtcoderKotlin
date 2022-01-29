package abc236

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val m = sc.nextInt()

	val hash = mutableMapOf<String, Int>()
	val sList = mutableListOf<String>()
	for (i in 0 until n) {
		val s = sc.next()
		sList.add(s)
		hash[s] = 0
	}
	for (j in 0 until m) {
		val t = sc.next()
		hash[t] = hash.getOrDefault(t, 0) + 1
	}

	problemC236(n, m, sList, hash)
}

fun problemC236(n: Int, m: Int, sList: List<String>, hash: MutableMap<String, Int>) {
	for (i in 0 until n) {
		if (hash[sList[i]] == 1) {
			println("Yes")
		} else {
			println("No")
		}
	}
}