fun main()
{
    println(withOutArgs())
    println(withArgs("satwick",21,3.0))
    println(withArgs("Satwick"))
    println(withArgs(value=4.0,name="satwick",age=32))
    println(withVarArgs(3,5,6,2))
}
fun withOutArgs():String
{
    return "Satwick"
}
fun withArgs(name:String,age:Int=10,value:Double=2.9)
{
 println("Name is $name and age is $age and his value is $value")
}
fun withVarArgs(vararg number:Int):Int
{
    var count=0;
    for(i in number)
    {
        count=count+i
    }
    return count
}
