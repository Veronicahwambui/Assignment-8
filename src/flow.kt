fun main() {
    println(isEven(4))
    println(isEven(9))


  var market = Market("orange",20.33,100f,"grocery")
    var soko=Market("oil",30.05,150f,"hygiene")
    market.product()
    soko.product()
println(fruits("banana"))
println(longNames(arrayOf("anna","sarah","wanjiru","sharon","Veronicah")))

}
fun isEven(number:Int):Boolean{
    if (number%2==0){
     return true
    }
    else{
        return false
    }
}
 data class  Market(var name:String,var weight:Double,var price:Float,var category:String) {
     fun product() {
         var grocery: MutableList<String> = mutableListOf<String>()
         var hygiene: MutableList<String> = mutableListOf<String>()
         when (category) {
             "grocery" -> println(mutableListOf("$name","$category"))
             "hygiene" -> println(mutableListOf(" $name","$category"))
             else -> println("other category")
         }



     }
 }
    fun fruits(name: String): String {
        var word = ""
        for (letter in name) {
            if (name.indexOf(letter) % 2 == 0) {
                word += letter


            }

        }
        return word
    }


fun longNames(names:Array<String>):MutableList<String>{
    var longNameList= mutableListOf<String>()
        for (name in names){
          if(name.length%2==0) {
              longNameList.add(name)

          }
        }
        return longNameList
    }
