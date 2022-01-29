package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)

	// 入力
	val n = sc.nextInt()
	val a = (0 until n).map { sc.nextInt() }

	println(quicksort(a).joinToString(" "))
}

fun quicksort(items:List<Int>):List<Int>{
	if (items.count() < 2){
		return items
	}
	val pivot = items[items.count()/2]

	val equal = items.filter { it == pivot }

	val less = items.filter { it < pivot }

	val greater = items.filter { it > pivot }

	return quicksort(less) + equal + quicksort(greater)
}