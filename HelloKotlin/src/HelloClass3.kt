

fun main(){
    discount();
}

fun discount(){
    println("Welcome to store:")
    var price = arrayOf<Int>(100,90,20);
    println("1.Book->"+price[0]+"\n2.Copy->"+price[1]+"\n3.Pen->"+price[2]);
    var totalPrice = 0;
    while (true){

        println("Do you want to purchase: [Yes/No]")
        var decision = readLine();

        if(decision.equals("No",true)){
            println("Total Price: ");
            println(totalPrice);
            break;
        }
        println("Choose Product: ");
        var productName = readLine();
        println("Input Quantity: ");
        var quantity = readLine()?.toIntOrNull()?:0;


        if(productName.equals("Book",true)){
            var bookPrice = price[0];
            bookPrice *= quantity.toInt();
            totalPrice += bookPrice;
        }
        else if(productName.equals("Copy",true)){
            var copyPrice:Int = price[1];
            copyPrice *= quantity.toInt();
            totalPrice += copyPrice;
        }
        else if(productName.equals("Pen",true)){
            var penPrice: Int = price[2];
            penPrice *= quantity.toInt();
            totalPrice += penPrice;
        }
    }






}