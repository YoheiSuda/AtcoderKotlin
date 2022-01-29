package mathAndAlgorithm

import java.util.*

fun main(args: Array<String>) {
	val pi = Math.PI
	val sc = Scanner(System.`in`)

	val a = sc.nextInt()
	val b = sc.nextInt()
	val h = sc.nextInt()
	val m = sc.nextInt()

	val angleH = 30.0 * h + 0.5 * m
	val angleM = 6.0 * m
	val hx = a * Math.cos(angleH * pi / 180.0)
	val hy = a * Math.sin(angleH * pi / 180.0)
	val mx = b * Math.cos(angleM * pi / 180.0)
	val my = b * Math.sin(angleM * pi / 180.0)

	val d = Math.sqrt(Math.pow(hx - mx, 2.0) + Math.pow(hy - my, 2.0))
	println(d)
}