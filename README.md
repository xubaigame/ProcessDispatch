# 基于优先级的非抢占/抢占进程调度算法模拟程序

### 作者：vili &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 联系方式1976763043@qq.com

*2018年操作系统的大作业,程序使用java语言在IDEA上编写,因为涉及图形界面,故需要安装jframe插件.程序在资源分配方面,只针对打印机进行分配.*

## 目录

* [1.程序功能](#1)
* [2.程序截图](#2)

<h2 id="1">程序功能</h2>

1.新建进程前,请初始化打印机数量,默认为0.

2.程序可手动创建模拟进程序列,也可从文件导入,创建或导入的进程列表在新建进程列表中显示

3.选择模拟的方法:1.抢占式  2.非抢占式

4.在模拟运行过程中,可以对当前进程进行阻塞,也可以在阻塞队列中唤醒进程.

5.在运行过程中可随时暂停模拟,观察结果.验证完毕后可以继续模拟.

6.模拟结束后可在预览窗口查看模拟运行结果.包括运行时间,周转时间,带权周转时间等信息.

7.可在主界面重置程序进行下一次模拟,也可随时退出程序

<h2 id="2">程序截图</h2>

主界面:
![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/主界面.png)

模拟结束:
![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/运行完成.png)

结果预览:
![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/结果预览.png)
