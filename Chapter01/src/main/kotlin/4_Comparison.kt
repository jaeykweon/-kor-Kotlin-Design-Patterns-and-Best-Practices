/**
 * 참고1) 코틀린은 == 연산자를 equals 메소드로 해석한다
 *
 * 참고2) === 연산자는 참조 동등성을 비교한다. 그러나 기본 타입 중에는 참조 동등성 비교가 불가능한 타입도 있다
 *
 * 참고3) jvm에서 int는 -128에서 127까지 캐싱해놓고 사용
 *
 * @author kei
 */
fun main() {
    val a = 1000
    val b = 1000
    println(a == b)          // true
    println(a?.equals(b))    // true (*참고1)
    println(a === b)         // 이 또한 true (*참고2)

    // 원본에는 없는 부분 (참고 3)
    println("---")
    var c: Int = 127
    var d: Int = 127
    println(c == d)         // true
    println(c === d)        // true
    var e: Int = 128
    var f: Int = 128
    println(e == f)         // true
    println(e === f)        // true

    println("---")
    val g: Int? = 127
    val h: Int? = 127
    println(g == h)         // true
    println(g === h)        // true - -128에서 127 사이의 정수는 동일 객체를 참조
    var i: Int? = 128
    var j: Int? = 128
    println(i ==j)          // true
    println(i===j)          // false - 128은 캐시되지 않으므로 서로 다른 객체
}