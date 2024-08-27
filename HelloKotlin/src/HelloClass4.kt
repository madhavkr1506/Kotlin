fun main(){
    println(CelToFarh(32.toFloat()));
    println(MaxTwo(2.toInt(),3.toInt()));
    println(Factorial(5));
}

fun CelToFarh(celsius:Float):Float{
    return (celsius * (9.0f / 5.0f)) + 32;
}

fun MaxTwo(a:Int,b:Int):Int{
    if(a > b){
        return a.toInt();
    }
    return b.toInt();
}

fun Factorial(a:Int): Int{
    var fact=1;

    if(a<=1){
        return 1;
    }
    else{
        fact = a * Factorial(a-1);
        return fact;
    }

}