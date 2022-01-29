package paizaSilverBullet

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val height = sc.nextInt()
	val width = sc.nextInt()
	val startNum = sc.nextInt()
	val sList = (0 until height).map { sc.next() }

	println(problemB01(height, width, startNum, sList))
}

fun problemB01(height: Int, width: Int, startNum: Int, sList: List<String>): Char {
	var ansIndex = 0
	var currentPosition = 0
	for (i in 0 until height) {
		var amidaMove = mutableListOf<Int>(-1, -1)
		run loop@ {
			sList[i].forEachIndexed { index, c ->
				if (i == 0 && startNum.toString() == c.toString()) {
					// 初期位置の設定
					currentPosition = index
					return@loop
				} else if (i == (height - 1)) {
					// ゴール位置の取得
					ansIndex = currentPosition
					return@loop
				} else {
					// あみだくじ内の処理
					if (index == (width - 1) && c == '.') {
						if (amidaMove[0] != -1) {
							amidaMove[1] = index
							if (currentPosition == amidaMove[0] || currentPosition == amidaMove[1]) {
								if (currentPosition == amidaMove[0]) {
									currentPosition = amidaMove[1]
								} else if (currentPosition == amidaMove[1]) {
									currentPosition = amidaMove[0]
								}
								amidaMove[0] = -1
								amidaMove[1] = -1
								return@loop
							}
							amidaMove[0] = -1
							amidaMove[1] = -1
						} else {
							currentPosition = index
							return@loop
						}
					} else if (c == '#') {
						if (amidaMove[0] != -1) {
							amidaMove[1] = index - 1
							if (currentPosition == amidaMove[0] || currentPosition == amidaMove[1]) {
								if (currentPosition == amidaMove[0]) {
									currentPosition = amidaMove[1]
								} else if (currentPosition == amidaMove[1]) {
									currentPosition = amidaMove[0]
								}
								amidaMove[0] = -1
								amidaMove[1] = -1
								return@loop
							}
							amidaMove[0] = -1
							amidaMove[1] = -1
						}
					} else if (c == '.' && amidaMove[0] == -1) {
						amidaMove[0] = index
					}
				}

			}
		}
	}
	return sList[height - 1][ansIndex]
}