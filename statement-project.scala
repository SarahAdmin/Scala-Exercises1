@main def hello: Unit = 
println("Hello World") 
println(partyAtHome(45, true))

def partyAtHome(guests: Int): Boolean = if guests < 15  then true
else if tentAvaliable && guests < 40 
else false 


