## 1. 参考代码链接
https://blog.csdn.net/CSDN___LYY/article/details/79461026

**定时**备份参考

https://blog.csdn.net/fish332/article/details/114178510

mysql数据库形式下的备份参考

https://zhuanlan.zhihu.com/p/335167642

https://www.linuxprobe.com/java-source-list.html

https://blog.csdn.net/qq_25406669/article/details/103399860

https://blog.51cto.com/u_16175472/6948440

https://www.php.cn/faq/616266.html


（建议搜索：java文件备份）文件备份参考

## 2. 参考库

1. 前端GUI：swing
2. 定时：Timer.SheduleAtFixedRate
3. 读取文件：io
4. 

## 3. 开发进度


## 4. 技术栈
1. 将指定目录下的文件全部备份到**一个文件**中
2. 将备份件**还原**为原本的目录树
3. 对备份文件进行**加密、解密**
4. 对备份文件进行**打包、解包**
5. 对**元数据**进行处理
5. 对目录树下的文件进行**筛选**
6. **周期性**备份和**数据淘汰**的**设置**
7. 感知用户**文件变化**，进行自动备份
8. **jsonPath可以学习，用于筛选过程**

## 5. 现存问题
1. 各种exception之间的逻辑关系（基本放弃解决）
2. 内部文件夹中的文件写入异常
