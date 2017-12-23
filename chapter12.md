[Maven实战](https://book.douban.com/subject/5345682/) 一书的第12章为 *使用 Maven 构建 Web 应用*, 本文件把里面的一些内容简单总结下    
下面分小节简单说明之

_可以在 chapter12 目录下执行本文的命令_

# 12.1 Web 项目的目录结构
[Packaging Web Archives](https://docs.oracle.com/javaee/7/tutorial/packaging003.htm)
# 12.2 account-service
略
# 12.3 account-web
书中的代码比较多, 我在 chapter12 子目录下写了(有些是插件自动生成或别处复制粘贴的)简单的例子, 代码量少很多, 但是可以体现出效果.
# 12.4 使用 jetty-maven-plugin 进行测试
[Configuring the Jetty Maven Plugin](http://www.eclipse.org/jetty/documentation/9.3.x/jetty-maven-plugin.html)  
注意: 上述链接中所描述的 jetty-maven-plugin 和书中描述的 jetty-maven-plugin 看起来不是一个东西. 但是上述链接中所描述的 jetty-maven-plugin 可以正常运转.
而且 [http://struts.apache.org/getting-started/how-to-create-a-struts2-web-application.html](http://struts.apache.org/getting-started/how-to-create-a-struts2-web-application.html) 中提到的也是上述链接里描述的那个 jetty-maven-plugin.
可以参考 [maven jetty - org.mortbay.jetty vs org.eclipse.jetty](https://stackoverflow.com/questions/15386461/maven-jetty-org-mortbay-jetty-vs-org-eclipse-jetty)

# 12.5 使用 Cargo 实现自动化部署
_待补充_
# 12.6 小结
略
