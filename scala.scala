package GCD

class scala {
  def GCD(num1:Int,num2:Int)
  {
    var n1 = num1
    var n2 = num2
    while(n2 != 0)
    {
      var r:Int = n1 % n2;
      n1= n2
      n2=r
    }
    println("GCD of "+num1+" and "+num2+" is :"+n1);
  }
}

object scala
{
  def main(args:Array[String]):Unit = {
  var gcd = new scala()
  gcd.GCD(12,15)
  }
}