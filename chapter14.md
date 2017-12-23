[Maven实战](https://book.douban.com/subject/5345682/) 一书的第14章为 *灵活的构建*, 本文件把里面的一些内容简单总结下    
下面分小节简单说明之

_可以在 chapter14 目录下执行本文的命令_

# 14.1 Maven 属性
[Project Interpolation and Variables](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html#Project_Interpolation)  
Maven 属性可以分为以下类别 
1. 内置属性
2. POM 属性
3. 自定义属性
4. Settings 属性
5. Java 系统属性
6. 环境变量属性

使用 `mvn help:system` 命令可以看到所有的 `System Properties` 和 `Environment Variables`
# 14.2 构建环境的差异
略
# 14.3 资源过滤
[How do I filter resource files?](http://maven.apache.org/guides/getting-started/index.html#How_do_I_filter_resource_files)  
为资源目录开启过滤
```xml
<resources>
    <resource>
        <directory>src/main/resources</directory>
        <filtering>true</filtering>
    </resource>
</resources>
```
为测试资源目录开启过滤
```xml
<testResources>
    <testResource>
        <directory>src/test/resources</directory>
            <filtering>true</filtering>
    </testResource>
</testResources>
```
激活不同的 profile
```sh
# 如果在项目的顶层目录, 则可以先切换到 chapter14 子目录下
cd chapter14

# 选择 dev profile
mvn clean package -P dev
# 查看效果
java -jar target/chapter14-1.0-SNAPSHOT.jar

# 选择 prod profile
mvn clean package -P prod
# 查看效果
java -jar target/chapter14-1.0-SNAPSHOT.jar
```
# 14.4 Maven Profile
[Introduction to Build Profiles](http://maven.apache.org/guides/introduction/introduction-to-profiles.html)
## 14.4.1 针对不同环境的 profile
例子可以参见 14.3 小节的部分
## 14.4.2 激活 profile
_待补充_
查看当前有哪些 profile 被激活
```
mvn help:active-profiles
```
列出当前所有的 profile
```
mvn help:all-profiles
```
## 14.4.3 profile 的种类
_待补充_
# 14.5 Web 资源过滤
_待补充_
# 14.6 在 profile 中激活集成测试
_待补充_
# 14.7 小结
_待补充_
