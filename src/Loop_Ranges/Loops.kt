fun main() {

    // for
    println("For: ")
    for (item in 1..10) {
        print("$item -> ")
    }

    println()

    for (item in 1 until 10) {
        print("$item -> ")
    }

    println()

    var number = 1..10
    for (item in number) {
        print("$item -> ")
    }

    println()

    for (item in 10 downTo 1) {
        print("$item -> ")
    }

    println()

    for (item in 1..10 step 3) {
        print("$item -> ")
    }

    println()

    // while
    println("While: ")
    var item = 3
    while (item < 11) {
        print("$item -> ")
        item++
    }

    println()

    // do-while
    println("Do - While: ")
    var item1 = 5
    do {
        print("$item1 -> ")
        item1++
    } while (item1 < 15)

    // Loop
    println()
    println("Loop: ")

    for (i in 1..3) {
        for (j in 1..3) {
            print("i = $i <=> j = $j ")
            println()
            if (j > i) {
                break
            }
        }
        print("i = $i ")
        println()
    }

    println()
    println("======================================")

    loop@ for (i in 1..3) {
        for (j in 1..3) {
            print("i = $i <=> j = $j ")
            println()
            if (j > i) {
                break@loop
            }
        }
        print("i = $i ")
        println()
    }
}
