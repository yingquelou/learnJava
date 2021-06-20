# ***创建Git本地仓库的主要方式***

## 主要有两种
    
* 将尚未进行版本控制的本地目录转换为 Git 仓库；
    * 用`cd`命令切换到要进行版本控制的本地目录；   

    * 然后用`git init`命令初始化，从而完成工作区的创建，其实际效果会在工作区内创建一个`.git`文件，其中包含了进行版本控制所必需的文件；
* 从其它服务器 克隆 一个已存在的 Git 仓库。
          
    * 用`cd`命令切换到你所指定的位置（文件夹/目录）；

    * 然后运行命令`git clone <url>`，使用时请将`<url>`替换成你所要克隆的仓库地址，主要是以下的形式：

        ```
        
        git clone https://github.com/用户名/仓库名.git
        git clone git@github.com:/用户名/仓库名
        //或其他约定的方式
        ```
        最好去[github](https://github.com)官网直接复制，以免输错！

### 更多**git**学习
##### 请参考官方文档《[Pro Git](https://git-scm.com/book/zh)》
###### 有中文版的PDF文档和电子书(epub格式)免费下载，直接上《**Pro Git**》的github[官方仓库](https://github.com/progit/progit2-zh)弄最新的也可以。
*ps*：有出版成书哦！土豪直接氪金带回家。
PDF：用办公软件打开，如WPS等。
电子书：用阅读器打开，如起点读书、微信读书、QQ阅读等。