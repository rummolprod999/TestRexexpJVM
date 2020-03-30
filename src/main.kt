import java.util.regex.Pattern

fun main() {
    val matcher = Pattern.compile("""Ga""").matcher("aab 421aa")
    while (matcher.find()) {
        println(matcher.group())
    }
}