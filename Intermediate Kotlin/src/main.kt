/*
class  power(Stats:Int = 12){
    var stat:Int = Stats
    fun stats() : Winner{
        stat = 20
        return Winner(this.stat)
    }
}
class Winner(_Stats: Int = 110) : gameObject
{
    var html = _Stats
    override var xCoordinate: Int
        get() = 10
        set(value) {}
    override var yCoordinate: Int
        get() = 21
        set(value) {}

    override fun manifest() {
        print("${this.xCoordinate} : ${this.yCoordinate} detected upon $scale for $html")
    }

    override var scale: Boolean
        get() = true
        set(value) {}
}
class Enemy : gameObject{
    override var xCoordinate: Int
        get() = 10
        set(value) {}
    override var yCoordinate: Int
        get() = 21
        set(value) {}

    override fun manifest() {
        print("${this.xCoordinate} : ${this.yCoordinate} detected upon ${this.scale}")
    }

    override var scale: Boolean
        get() = false
        set(value) {}
}
open class frameWork{
    var state:String? = null
    var stateLess:Int = 1
    var product:Boolean = true
    var state1:String? = null
    var state2:String? = null
      open fun dimen(){
        state = "A"
    }
      open fun structure (){
        state1 = "B"
    }
     open fun metaData(){
        state2 = "C"
    }
}
class building : frameWork() , gameObject{
    override fun manifest() {
        super.manifest()
    }
    override var xCoordinate: Int
        get() = super.stateLess
        set(value) {
        }
    override var yCoordinate: Int
        get() = super.stateLess
        set(value) {}
    override var scale: Boolean
        get() = super.product
        set(value) {}

    override  fun dimen(){
         this.state1
    }

    override fun structure() {

    }

    override fun metaData() {

    }
}
fun main() {
    Winner().manifest()
    Enemy().manifest()
    power().stats().manifest()
    building().xCoordinate = 9999
   building().structure()
}
*/
/*
open class setData(nae:String? = null){
    open var StateName : String? = nae

    open fun Name(name:String? = null) : setData{
        StateName = name
        return setData(this.StateName)
    }
}
 fun main() {
     setData().StateName = "akshat"
     setData().Name()
    var NewObjectOfsetDataClass = object : setData() {
        override fun Name(name: String?) : setData {
            super.StateName
            return setData(this.StateName)
        }
     }
     NewObjectOfsetDataClass.Name("Akshat").StateName
 }*/
/*const val data:String = "this"
var setData: () ->  Unit =  {
    print("setData function $data")
}

fun getData(functionType:() -> Unit){
    functionType()
}

fun main() {
  print(getData(setData))

}*/
/*var verError = {
    print("Anonymous Function")
}
val mat = {
    println("\nGhost Function")
}
fun math(sigma:()->Unit){
    sigma.invoke()
    mat()
}
fun main() {
    math(verError)
}*/

fun hen(AP:() -> Unit ){
    AP()
}
fun gen(FG:String ){print("$FG")}
fun man(Jak:(String,Int)->Unit) = Jak("DEFAULT",0)
fun main() {
    hen { gen("THis") }
    hen {

    }
    man {
        msg:String ,red:Int/*Argument List*/-> /*function body*/println("$msg is still $red")
    }
    bes{
        msg:String -> println("$msg is still $")
    }
}
fun bes(function: (String) -> Unit) {
   function(
           "Default"
   )
}
//()->function type