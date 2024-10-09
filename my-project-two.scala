@main def hello: Unit = 
println("Hello World") 
println(sum(2,2)) 
println(lightSwitch(switchOn = true)) 
println(lightSwitch(switchOn = false))

def sum(n1: Int, n2: Int): Int = n1 + n2
def lightSwitch(switchOn: Boolean): String = if switchOn then "light on!" e;se "light off!"
