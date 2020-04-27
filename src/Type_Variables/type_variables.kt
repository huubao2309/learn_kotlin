fun main() {
    val stringValue: String = "Bill"
    val intValue: Int = 10
    val longValue: Long = 1995 // val year = 1995L
    val floatValue: Float = 10.0F
    val hexValue: Int = 0xFF
    val binaryValue: Int = 0xb11
    val character: Char = 'B'

    val multiLine = """
        SELECT *
        FROM COLUMN
        WHERE ...
    """

    // ============================
    println("String: " + stringValue)
    println("Int: " + intValue)
    println("Long: " + longValue)
    println("Float: " + floatValue)
    println("Hex: " + hexValue)
    println("Binary: " + binaryValue)
    println("Character: " + character)
    println("Multi Lines: " + multiLine)
}
