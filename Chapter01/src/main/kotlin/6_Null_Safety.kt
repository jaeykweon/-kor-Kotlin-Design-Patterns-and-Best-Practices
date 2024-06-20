fun main() {
    // 컴파일 되지 않습니다
    // val s: String = null // Null은 non-null 타입 문자열의 값이 될 수 없습니다

    // 컴퍼일 되지 않습니다
    // printLength(null) // Null은 non-null 타입 문자열의 값이 될 수 없습니다

    var willInitializeLater: String? = null
}

fun printLength(s: String) {
    println(s.length)
}