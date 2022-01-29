package paizaSilverBullet

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val n = sc.nextInt()
	val ans = Math.floor((n - 32) / 1.8).toInt()
	println(ans)
}