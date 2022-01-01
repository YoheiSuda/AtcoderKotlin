package abc090

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val gyo = sc.nextLong()
	val retsu = sc.nextLong()

	println(problemC090(gyo, retsu))
}

fun problemC090(gyo: Long, retsu: Long): Long {
//	これで列作って回す方法もありだが遅い
//	val list = List(retsu) {
//		List(gyo) { 0 }
//	}
//
//	println(list)

	return Math.abs((gyo - 2) * (retsu - 2))
}