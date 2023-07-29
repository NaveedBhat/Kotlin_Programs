fun main(){
    val nullValue:String? = null  // using null safety operator // we use this operator(?)
    // after the data type of the variable to declare any variable as null
    println(nullValue)

    println(nullValue?.length) //  using safe call    or   // RECOMMENDED
    //println(nullValue!!.length)  // we can also use non null asserted(!!) --> it forces the ide
    // to give the output that is not null
    println(nullValue?.length ?: "This is Null")  // using Elvis optr we print some message(This is Null)
// instead of printing null


}