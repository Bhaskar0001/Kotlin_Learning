fun main() {

    //Break Statement--used to break loop
//    for(i in 1..10) {
//        println(i)
//    if (i==5)
//        break}
    //labelled for loop
      myloop@  for(i in 1..3) {
            for (j in 1..3){
                println("$i,$j")
                if (i==2&&j==2)
                    break@myloop

        }        }


    }
