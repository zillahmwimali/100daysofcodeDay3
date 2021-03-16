fun main() {
    println(addition(3,4))
    println(addition(45,5))
    println(division(23,4))
    println(division(24,6))
    println(subtraction(65,5.5765.toFloat()))
    println(subtraction(45,44.56.toFloat()))
    multiplication(68,2)
    multiplication(45,89)
    println(modulus(56,5))
    println(modulus(65,8))
    println(add(21))
    println(add(22))
    println(decrease(59))
    println(state("Los","Angeles"))
    println(joinString("Mary","Odanga"))
    println(fact("Zillah","mwimali"))


}
fun addition(num1:Int,num2:Int):Int{
    var sum=num1+num2
    return sum
}
fun division(b:Int,d:Int):Int{
    var divide=b/d
    return(divide)
}
fun subtraction(num3:Int,num4:Float):Float{
    var subtract=num3 - num4
    return subtract
}
fun multiplication(num5:Int,num6:Int):Int{
    var product=num5*num6
    return product

}
fun modulus(num7:Int,num8:Int):Int{
    var remainder=num7%num8
    return remainder

}
fun add(age:Int):Int{
    var currentAge=age
    ++currentAge
    return(currentAge)
}
fun decrease(agenow:Int):Int{
    var myage=agenow
    --myage
    return myage

}
fun state(x:String,y:String):String{

    return "Looking foward to working in $x,$y"
}
fun joinString(name:String,name2:String):String{
    val fullName=name+" "+name2
    return fullName
}
fun fact(name1:String,name2:String){
    if (name1==name2){
        println("That's me!")
    }
    else{
        println("I don't know who that is")
        }
}

