fun main() {
var big=Car("B6","Mahindra Bolero","Jet black",14)
    big.identity()
  println(big.calculateParkingFees(3))
    big.carry(20)

    var heavy=Bus("Double-decker","708","green",60)
println(heavy.calculateParkingFees(6) )
    println(heavy.maxTripFare(50.20))



}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//-carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//
//-identity() : Prints out the color, make and model in the following
//format e.g:  “I am a white subaru legacy”
//-calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20(

open class Car(var make:String,var model:String,var colour:String,var capacity:Int){
    fun carry(people:Int) {
        var x= people-capacity
    if (people==capacity || people<=capacity){
        println("Carrying $people passengers")

    }
        else(println("Over capacity by $x people"))
    }

    fun identity(){
println("I am a $colour $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var fees=20
        fees*=hours
        return fees

    }

}
//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.
//The bus’calculateParkingFees method returns the product of hours and
//the capacity of the bus.

class Bus(make:String,model:String,colour:String,capacity:Int):Car(make, model,colour,capacity) {

    fun maxTripFare(fare: Double):Double {
   var trip=fare*capacity
        return trip
    }


    override fun calculateParkingFees(hours: Int):Int {
//        return super.calculateParkingFees(hours)
        var fees=hours*capacity

        return fees

    }

}





