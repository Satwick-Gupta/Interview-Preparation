var name:String?=null
fun main()
{
    val size:Int?=name?.length
    var a="Satwick"
    var b="Gupta"
    var num=arrayOf(1,2,3,4,5)
    var name="satwick";
    num.set(4,6);
    for(i in 0..num.size-1)
    {
        println(num.get(i))
    }
    for(i in 0..name.length-1)
    {
        println(name.get(i))
    }
    for(i in 5 downTo 1)
    {
        println(i)
    }
    var arr=arrayOf<Int>(1,2,3,4)
    print(num.get(4))

    println(size)
    println("Hello World")
}