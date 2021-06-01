## Kotlin 实战源码

### 安装 kotlin 工具包

#### Ubuntu 20.04

```shell
sudo snap install --classic kotlin
kotlinc -help
```
#### OSX
```shell
brew install kotlin
```

### 编译和运行
##### PlayGroud
+ [https://play.kotlinlang.org/](https://play.kotlinlang.org/)
##### 本地编译
```
#-d 选项表示生成的类文件的输出路径，可以是目录，也可以是一个 .jar 文件。
#-include-runtime 选项通过在其中包含 Kotlin 运行时库，使得生成的 .jar 文件中自包含运行时库且可运行。

kotlinc hello.kt -include-runtime -d hello.jar
java -jar hello.jar
```

