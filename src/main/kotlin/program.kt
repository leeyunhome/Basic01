fun main() {

    val asc = Array(5) {i -> (i *i).toString()}
    asc.forEach{println(it)}


}
fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt() // Explicit conversions to numbers
}

fun printArr(arr: Array<Int?>)
{
    for (item in arr)
    {
        println(item)
    }
}