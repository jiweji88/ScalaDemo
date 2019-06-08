package scala.main

object FuncationDemo {

  def main(args: Array[String]): Unit = {
    // 函数传名调用
    callByNameFucation(nowTime())
    // 可变参数函数
    printStrings("jiwei", "love", "gong")
    // 偏应用函数
    val bindFirstPrint = printStrings("jiwei", _ : String)
    bindFirstPrint("gong")
    // 指定参数名
    directFiledName(b="jiwei",a="gong")
    // 高阶函数
    apply(directFiledName, "jiwei", "gong")
    // 匿名函数
    var unknownNameFunction = (a: Int, b: Int) => a + b
    println(printf("A+B=%d", unknownNameFunction(1,2)))
    // 函数柯里化
    println(printf("add(x)(y): %d", add(2)(3)))

  }

  def callByNameFucation(i: => Long) = {
    println(i)
    i
  }
  def nowTime() = {
    println("你想要获取时间")
    System.nanoTime()
  }

  def printStrings(arr : String*) = {
    var i:Int = 0
    for (str <- arr) {
      println(printf("输入的第%d参数： %s", i, str))
      i += 1
    }
  }

  def directFiledName(a : String, b : String) = {
    println("a:" + a)
    println("b:" + b)
  }

  def apply (f: (String,String) => Unit, a:String, b: String) = directFiledName(a, b)

  def add(x:Int)(y:Int) = x + y

}
