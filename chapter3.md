[Maven实战](https://book.douban.com/subject/5345682/) 一书的第3章为 *Maven 使用入门*, 本文件把里面的一些内容简单总结下  
下面分小节简单说明之

为了方便操作, 可以在项目顶层目录执行
```
mvn archetype:generate -DgroupId=com.jyjz.playground -DartifactId=temp -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false 
```
并切换到 `temp` 子目录尝试各个命令的效果

# 3.1 编写 POM
略
# 3.2 编写主代码
写好主代码后, 可以通过 `mvn clean compile` 进行编译
# 3.3 编写测试代码
写好测试代码后, 可以通过 `mvn clean test` 进行测试
# 3.4 打包和运行
可以通过 `mvn clean package` 进行打包  
可以通过 `mvn clean install` 安装到 Maven 本地仓库  
[Executable JAR](http://maven.apache.org/plugins/maven-shade-plugin/examples/executable-jar.html)
里讲述了如何使用 maven-shade-plugin 插件生成可执行 jar 包  
就本项目而言, 可以在项目顶层目录依次执行下列命令观察效果
```sh
cd chapter3
mvn clean package
java -jar target/chapter3-1.0-SNAPSHOT.jar
```
# 3.5 使用 Archetype 生成项目骨架
[Maven Archetype Plugin](http://maven.apache.org/archetype/maven-archetype-plugin/)
# 3.6 m2eclipse 简单使用
略
# 3.7 NetBeans Maven 插件简单使用
略
# 3.8 小结
略
