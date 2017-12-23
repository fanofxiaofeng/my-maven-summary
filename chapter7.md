[Maven实战](https://book.douban.com/subject/5345682/) 一书的第7章为 *生命周期和插件*, 本文件把里面的一些内容简单总结下  
下面分小节简单说明之

# 7.1 何为生命周期
略
# 7.2 生命周期详解
## 7.2.1 三套生命周期
[Introduction to the Build Lifecycle](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html) 里提到
> There are three built-in build lifecycles: `default`, `clean` and `site`.
> The `default` lifecycle handles your project deployment, 
> the `clean` lifecycle handles project cleaning, 
> while the `site` lifecycle handles the creation of your project's site documentation.
## 7.2.2 clean 生命周期
clean 生命周期有3个阶段
1. pre-clean
2. clean
3. post-clean

更具体的描述请参见 [Lifecycle Reference](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#Lifecycle_Reference)
## 7.2.3 default 生命周期
default 生命周期共有23个 phase, 具体的描述请参见 [Lifecycle Reference](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#Lifecycle_Reference)
## 7.2.4 site 生命周期
site 生命周期共有4个阶段
1. pre-site
2. site
3. post-site
4. site-deploy

更具体的描述请参见 [Lifecycle Reference](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#Lifecycle_Reference)
## 7.2.5 命令行与生命周期
各个生命周期是相互独立的, 而一个生命周期的阶段是有前后依赖关系的
```
# 执行 default 生命周期中截止到 install 阶段的所有阶段(包括install 阶段)
mvn install
# 执行 clean 生命周期截止到 clean 阶段的所有阶段(包括 clean 阶段) + 执行 default 生命周期截止到 test 阶段的所有阶段(包括test阶段)
mvn clean test
```
# 7.3 插件目标
_待补充_
# 7.4 插件绑定
## 7.4.1 内置绑定
[Built-in Lifecycle Bindings](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#Built-in_Lifecycle_Bindings)  
[Plugin Bindings for default Lifecycle Reference](https://maven.apache.org/ref/3.5.2/maven-core/default-bindings.html)
## 7.4.2 自定义绑定
_待补充_
# 7.5 插件配置
## 7.5.1 命令行插件配置
```
# 跳过测试的编译与运行
mvn clean test -Dmaven.test.skip=true
# 跳过测试的运行
mvn clean test -DskipTests
```
## 7.5.2 POM 中插件全局配置
略
## 7.5.3 POM 中插件任务配置
在项目顶层目录下依次执行下列命令, 可以看到效果示例
```sh
cd chapter7
mvn post-clean
```
# 7.6 获取插件信息
## 7.6.1 在线插件信息
[Available Plugins](https://maven.apache.org/plugins/index.html)
## 7.6.2 使用 maven-help-plugin 描述插件
_待补充_
# 7.7 从命令行调用插件
_待补充_
# 7.8 插件解析机制
## 7.8.1 插件仓库
_待补充_
## 7.8.2 插件的默认 groupId
在 POM 中配置插件的时候, 如果该插件是 Maven 的官方插件(即如果其 groupId 为 org.apache.maven.plugins), 就可以省略 groupId 配置.
书的作者不推荐使用 Maven 的这一机制, 虽然这么做可以省略一些配置, 但这样的配置会让团队中不熟悉 Maven 的成员感到费解, 况且能省略的配置也就仅仅一行而已.
## 7.8.3 解析插件版本
_待补充_
## 7.8.4 解析插件前缀
_待补充_
# 7.9 小结
_待补充_


