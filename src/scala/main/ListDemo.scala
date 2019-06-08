package scala.main

object ListDemo {
    def main(args: Array[String]) {
      val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
      val nums = Nil

      println( "第一网站是 : " + site.head )
      println( "最后一个网站是 : " + site.tail )
      println( "最后一个网站是 : " + site.tail.head )
      println( "最后一个网站是 : " + site.tail.tail.tail )
      println( "查看列表 site 是否为空 : " + site.isEmpty )
      println( "查看 nums 是否为空 : " + nums.isEmpty )

      val fill = List.fill(10)("jiwei")
      println(fill)

      // 通过给定的函数创建 5 个元素
      val squares = List.tabulate(7)( n => n * n )
      val sortSquares = squares.sortWith(_ > _)
      println( "一维 : " + squares  )
      println( "一维 : " + sortSquares  )

      // 创建二维列表
      val mul = List.tabulate( 4,5 )( _ * _ )
      println( "多维 : " + mul  )

      1 to 5
    }
}
