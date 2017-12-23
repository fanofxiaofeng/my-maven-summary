[Maven实战](https://book.douban.com/subject/5345682/) 一书的第10章为 *使用 Maven 进行测试*, 本文件把里面的一些内容简单总结下 
下面分小节简单说明之

# 10.1 account-captcha
书中的代码是一套体系, 本项目不采用书中的代码, 所以略过

# 10.2 maven-surefire-plugin 简介
Java 世界中主流的单元测试框架为 *JUnit* 和 *[TestNG](http://testng.org/doc/)*.
Maven 所做的只是在构建执行到特定生命周期阶段的时候, 通过插件来执行 Junit 或者 TestNG 的测试用例.
这一插件就是 maven-surefire-plugin, 可以称之为测试运行期(Test Runner), 它能很好地兼容 Junit3, Junit4 以及 TestNG.


# 10.3 跳过测试
[How do I skip the tests?](https://maven.apache.org/general.html#skip-test)   
如果只是想跳过测试的执行, 则
```bash
mvn clean test -DskipTests=true
```

如果想跳过测试的编译与执行, 则
```bash
mvn clean test -Dmaven.test.skip=true
```

# 10.4 动态指定要运行的测试用例
[How can I run a single unit test?](https://maven.apache.org/general.html#run-one-test)  
[Running a Single Test](https://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html)  
例子
```bash
# 只对 CountryTest 进行测试
mvn clean test -Dtest=CountryTest

# 只对 CountryTest 的 testJustShowSomething 方法进行测试
mvn -Dtest=CountryTest#testJustShowSomething test

# 只对 TestClassOne, TestClassTwo 进行测试
mvn -Dtest=TestClassOne,TestClassTwo test
```

# 10.5 包含与排除测试用例
[Inclusions and Exclusions of Tests](https://maven.apache.org/surefire/maven-surefire-plugin/examples/inclusion-exclusion.html)  
[Directory-based Tasks](http://ant.apache.org/manual/dirtasks.html)  
[Learning Ant path style](https://stackoverflow.com/questions/2952196/learning-ant-path-style)  

# 10.6 测试报告
## 10.6.1 基本的测试报告
[Maven Surefire Plugin](http://maven.apache.org/surefire/maven-surefire-plugin/index.html) 中提到
> The Surefire Plugin is used during the test phase of the build lifecycle to execute the unit tests of an application. It generates reports in two different file formats:
> * Plain text files (*.txt)
> * XML files (*.xml)


如果想生成 HTML 格式的测试报告, 请参考 [Maven Surefire Report Plugin](http://maven.apache.org/surefire/maven-surefire-report-plugin/)  
```
mvn clean test surefire-report:report
```

## 10.6.2 测试覆盖率报告
```
mvn cobertura:cobertura
```

# 10.7 运行 TestNG 测试
_待补充_

# 10.8 重用测试代码
_待补充_

# 10.9 小结
_待补充_
