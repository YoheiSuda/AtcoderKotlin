package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextLong()

	var ans = divideList(n)
	print(ans.joinToString("\n"))
}

//約数列挙
fun divideList(num: Long): List<Long> {
	var resultList = mutableListOf<Long>()
	for (i in 1..num) {
		if ((i * i) <= num) {
			if (num % i == 0L) {
				resultList.add(i)
				if (i != (num / i)) {
					resultList.add((num / i))
				}
			}
		} else {
			break
		}
	}

	return  resultList
}