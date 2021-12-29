package abc061

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val cityNum = sc.nextInt()
	val roadNum = sc.nextInt()
	val citiesMap = mutableMapOf<Int, Int>()

	for (i in 1..cityNum) {
		citiesMap[i] = 0
	}

	for (j in 1..roadNum) {
		val cityA = sc.nextInt()
		val cityB = sc.nextInt()
		citiesMap[cityA] = citiesMap.getOrDefault(cityA, 0) + 1
		citiesMap[cityB] = citiesMap.getOrDefault(cityB, 0) + 1
	}

	val result = citiesMap.toSortedMap()

	for ((k,v) in result) {
		println(v)
	}
}