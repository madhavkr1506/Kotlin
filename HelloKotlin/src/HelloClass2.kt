import kotlin.random.Random


fun main(){
    function();
//    rockpaperscissor();
}


fun function(){
    var final_amount = 1000;
    while (true){
        println("You want to withdraw money? yes or no ");
        var decision = readLine();
        if(decision.equals("no")){
            break;
        }
        else{
            println("Enter amount: ")
            var input = readLine()?.toIntOrNull();
            if(input != null){
                if(input <= final_amount){
                    final_amount -= input;
                    println("Amount left: $final_amount");
                    if(final_amount == 0){
                        println("You are left with zero balance");
                        break;
                    }
                }
                else{
                    println("You are exceeding limit");
                }
            }else{
                println("You didn't enter any amount");
            }
        }
    }
}



//write rock paper scissor program

fun rockpaperscissor(){
    println("Welcome To The Game");

    while (true){
        println("Do You want to play Rock Paper Scissor Game: [Yes/No]");
        val decision = readLine();
        if(decision.equals("no",true)){
            break;
        }
        else if(decision.equals("yes",true)){
            println("Input Your value: ")
            var userMove = readLine()?.toIntOrNull();
            if(userMove != null){
                if(userMove < 1 || userMove > 3){
                    println("Please input value in the range of [1-3]")
                    userMove = readLine()?.toIntOrNull();
                }
            }

            var compMove = Random.nextInt(1,4);

            var userSelect = when(userMove){
                1->"Rock";
                2->"Paper";
                3->"Scissor";
                else->""
            }
            println("User Move: " + userSelect);

            var compSelect = when(compMove){
                1->"Rock";
                2->"Paper";
                3->"Scissor";
                else->""
            }
            println("Computer Move: " + compSelect);

            if((userSelect.equals("Rock") && compSelect.equals("Scissor")) || (userSelect.equals("Scissor") && compSelect.equals("Paper")) || (userSelect.equals("Paper") && compSelect.equals("Rock"))){
                println("Congratulation! user won this match");
            }
            else if((userSelect.equals("Rock") && compSelect.equals("Rock")) || (userSelect.equals("Scissor") && compSelect.equals("Scissor")) || (userSelect.equals("Paper") && compSelect.equals("Paper"))){
                println("Sorry! match tied");
            }
            else{
                println("Ah! Computer won this match");
            }




        }
    }
}