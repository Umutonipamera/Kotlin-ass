fun main(){
introduction("Pamela",22)
    serveDrinks(4)
    serveDrinks(11)
    serveDrinks(20)
    println(names(ArrayOf("Pamela","Diane","Celine")))
    multiply()
    divide()
    modules()
    println(comparison(20,4))



}

fun introduction(name:String,age:Int){
    println("My name is $name and I am $age years old.")
}
fun serveDrinks(age:Int){
    var age=6
    if(age<6){
        println("Serve a glass of milk")
    }
    else if(age>6&& age<15){
        println("Serve a bottle of fanta orange")
    }
    else{
        println("Serve a bottle of cocacola")
    }
}
fun names(names:Array<String>):Int{
    var count=0
    for( char in names){
        if(char.length<4){
           count+=char
        }
        return count
    }
}
fun multiply(){
    var a=4
    var b=5
    var c=a*b
    println(c)
}
fun divide(){
    var d=50
    var e=10
    var f=d/e
    println(f)
}
fun modules() {
    var a = 20
    var b = 3
    var c = a % b
    println(c)
}
class Human(var name:String,var age:Int,var weight:Boolean){
    var foodWeight=weight
}
fun comparison(num:Int,num1:Int):Int{
    var a=num%num1
    return a
}
fun names(names:String):Array<String>{
var a=ArrayOf names
    return a
}

