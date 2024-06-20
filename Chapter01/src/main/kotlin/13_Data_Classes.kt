/**
 * data class는 final class이기 때문에 상속이 불가능
 * @author kei
 */
//class User2: User() // 컴파일 에러

data class User(val username: String, private val password: String) {
    fun hidePassword() = "*".repeat(password.length)
}

fun main() {
    val user = User("Alexey", "abcd1234")
    println(user.hidePassword())
}

/**
 * 참고) @JvmRecord 어노테이션을 위해서 java 버전을 21로, gradle 버전을 8.5로 변경함
 * @see <a href="https://mysterlee.tistory.com/102">java record 특징</a>
 * @author kei
 */
@JvmRecord
data class UserRecord(val username: String, private val password: String)