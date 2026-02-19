package edu.example.leccion_2


fun main() {
    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    val waterFilter2: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilter(dirtyLevel))

    println(waterFilter2(dirtyLevel))

    println(updateDirty(30, waterFilter))

    println(updateDirty(15, ::increaseDirty))

    dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)

}
fun increaseDirty( start: Int ) = start + 1

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}