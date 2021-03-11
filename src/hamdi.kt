fun main() {
name()
    word()
    text()
    txt()
    animal("Lion")
    animal("animal")
}
fun name(){
    var x = "my name is"
    var name = "Favour"
    println(x + " " + name)
}
fun word(){
    var name = "Favour"
    var year = 2019
    var sentence = "my namw is $name and i was born in $year"
    println(sentence)
}
fun text(){
    var x = "slay queen"
    println(x.toUpperCase())
    println(x.capitalize())
}
fun txt(){
    var txt ="Aine Favour"
    println(txt.replace("Aine","Linda"))
}
fun animal(name:String){
    if (name == "Lion"){
println("That is not is")

    }
    else{
        println("I don't know that is")
    }
}


