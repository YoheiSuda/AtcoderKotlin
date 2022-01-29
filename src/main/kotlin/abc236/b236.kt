package abc236

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val aList = (0 until (n * 4) - 1).map { sc.nextInt() }

	val hash = mutableMapOf<Int, Int>()
	for (i in 0 until (n * 4) - 1) {
		hash[aList[i]] = hash.getOrDefault(aList[i], 0) + 1
	}

	hash.forEach{
		if (it.value == 3) {
			println(it.key)
		}
	}
}