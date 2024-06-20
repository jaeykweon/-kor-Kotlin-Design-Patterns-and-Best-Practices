fun main() {
    // 빈 생성자로 클래스 생성
    // val player = Player()

    val player = Player("Roland")

    println(player.name)

    // 컴파일 되지 않습니다
    // player.name = "Alex" // val 은 재할당 될 수 없습니다

    // Invalid score
    player.score = -10
}

// 빈 생성자를 가진 클래스
/*
class Player {

}
*/

class Player(name: String) {
    val name = name
        get() = field.toUpperCase()

    var score: Int = 0
        set(value) {
            field = if (value >= 0) {
                value
            } else {
                0
            }
        }
}