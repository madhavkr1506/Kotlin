fun main(){
    var hashmap = HashMap<String,String>();
    hashmap.put("Madhav","He is a good  boy");
    hashmap.put("Krishna","He is a god");
    hashmap.put("Madhu","Madhav without v");
    hashmap.put("Shiva","Best God");
    hashmap.put("Future","Don't know");

//    iterating over hashmap using keys
//    for(key in hashmap.keys){
//        println("Keys: $key | Value: ${hashmap.get(key)}")
//    }

//    iterating over hashmap using Map.Entry
    for(e: Map.Entry<String,String> in hashmap.entries){
        println("${e.key} | ${e.value}");
    }
}