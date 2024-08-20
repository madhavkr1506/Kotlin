//write fibonacci program

fun main(){
//    println("Input number: ");
//    val num: Int? = readLine()?.toIntOrNull();
//    if(num != null){
//        printFibonacci(num);
//    }

    println("Input num1: ")
    val num1:Int?= readLine()?.toIntOrNull();
    println("Input num2: ");
    val num2:Int?= readLine()?.toIntOrNull();

    if(num1 != null && num2 != null) {
        printPalindrome(num1, num2);
    }
}

fun printFibonacci(num:Int){
    var a = 0;
    var b = 1;
    for(i in 0 .. num){
        if(i == 0){
            println(a);
        }
        if(i == 1){
            println(b);
        }
        if(i > 1){
            var num = a + b;
            a = b;
            b = num;
            println(num);
        }
    }
}


fun printPrimeNumber(num1:Int, num2:Int){
    for(i in num1 .. num2) {
        var found: Boolean = true;
        for (j in 2..Math.sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) {
                found = false;
                break;
            }
        }
        if(found){
            println(i);
        }
    }
}

fun printArmstrong(num1:Int, num2:Int){
    for(i in num1..num2){
        var temp = i;
        var res = 0;
        var power = noOfDigit(i.toInt());

        var n = i;
        while (n != 0){
            var rem = n % 10;
            res += Math.pow(rem.toDouble(),power.toDouble()).toInt();
            n /= 10;

        }
        if(temp == res){
            println(temp);
        }

    }
}


fun noOfDigit(num:Int):Int{
    var temp = num;
    var count = 0;
    while(temp != 0){
        temp /= 10;
        count++;
    }
    return count;
}




fun printPalindrome(num1:Int, num2:Int){
    for(i in num1..num2){
        var temp = i;
        var rev = 0;

        var n = i;
        while (n != 0){
            var rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        if(temp == rev){
            println(temp);
        }
    }
}






















