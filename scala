object Assignment1 extends App {


  //Question 01

  def temperature (celsius : Int) : Double = {
    var fahrenheit : Double = 0;
    fahrenheit = celsius*1.8 + 32
    return fahrenheit
  }
  println("1) Temperature = " + temperature(celsius = 35) + "F")



  //Question 02

  def volume (r : Int) : Double = {
    var T : Double = 0
    val pi : Double = 22.toDouble/(7:Double)
    var r3 = scala.math.pow(5,3)
    T = (4.toDouble/3:Double)*pi*r3
    return T

  }

  println("2) Volume of a sphere = " + volume(5))



  //Question 03

  var bookPrice : Double = 24.95
  var discount : Double = 0.4     //discount 40/100
  var copies : Int = 60
  def shippingCost (Books : Int) : Double = {
    if (Books <= 50)3.0
    else 3.0 + (0.75*(Books-50))
  }
  def totalDiscount () : Double = {
    bookPrice*copies*discount
  }
  def wholesaleCost() : Double = {
    (copies*bookPrice) - totalDiscount() + shippingCost(copies)
  }
  val totalsaleValue = wholesaleCost()
  println("3) Total whole sale cost = " + totalsaleValue)



}
