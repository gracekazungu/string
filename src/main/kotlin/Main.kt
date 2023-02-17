fun main(){
val stmt=person("Grace","20")
    println(stmt)

    val fruit= "pineaple"
    println(fruit.length)

    var name = "Grace"
    var name2 = "Pauline"
    if(name==(name2)){
        println("I know you")}else{
            println("I don't know who that is")}
var school = "akirachix"
    println(charArrayOf(school[0],school[2],school[3]))
    }

fun person(name:String,Age:String):String{
    val stmt=" Hi, my name is $name and am $Age years old"
return(stmt)
}


