package scala.main

import scala.io.StdIn

object Demo {
  def main(args: Array[String]): Unit = {
    println("hello wji ! gong lvu");

    println("请输入名字： ")
    val name = StdIn.readLine()
    printf("输入的名字是： %s", name)
  }
}
