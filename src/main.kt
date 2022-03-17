fun main(){
    var x = mixedtypes(arrayOf("Tessa",23,2.5,30,1.2F,22))
    println(x)
    stnc(arrayOf("My"," name"," is", " Tessa"))
    var y = multiply(arrayOf(3,5,10,))
    println(y)
    var w = mixture(arrayOf("Tessa", 1.2, "Marie", 3.4, 2.5F, 2.2))
    println(w)
    var vowels = characters(arrayOf('b','a','c','d','e','i'))
    println(vowels)

}
//create a function that takes in an array of mixes types
//and sums up the integers only. return the sum
//create a function that takes in a string array and returns
// a sentence
fun mixedtypes(medly:Array<Any>):Int{
    var sum = 0
    medly.forEach { el->
        if (el is Int){
            sum+=el
        }
    }
    return sum


}
fun stnc(words:Array<String>):String{

    var w = words.get(0).plus(words.get(1)).plus(words.get(2)).plus(words.get(3))
    println(w)
    return w
}
//write a function that takes in an array of integers
//and returns the product of the elements.
fun multiply(nums:Array<Int>):Int{
    var product = 1
    nums.forEach { el->
        product*=el
    }
    return product

}
//write a function that takes in an array of mixed types
//and returns the sum of all decimal elements
fun mixture(components:Array<Any>):Double {
    var sum = 0.0
    components.forEach { els ->
        if (els is Double)
            sum += els
    }
    return sum
}
//write a function that takes in an array of characters
//and returns the number of vowels in the array.
fun characters(letters: Array<Char>):Int{
    var num = 0
    letters.forEach { vow ->
        if (vow == 'a'|| vow == 'e'||vow =='i'|| vow == 'o'|| vow =='u'){
            num++
        }
    }
    return num
}
