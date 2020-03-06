## git 使用说明

    本地仓库同步数据到github
    
    1、在本地创建一个版本库（即文件夹），通过git init把它变成Git仓库；
    
    2、把项目复制到这个文件夹里面，再通过git add .把项目添加到仓库；
    
    3、再通过git commit -m "注释内容"把项目提交到仓库；
    
    4、在Github上设置好SSH密钥后，新建一个远程仓库，通过git remote add origin https://github.com/guyibang/TEST2.git将本地仓库和远程仓库进行关联；
    
    5、最后通过git push -u origin master把本地仓库的项目推送到远程仓库（也就是Github）上；（若新建远程仓库的时候自动创建了README文件会报错，解决办法看上面）。

    参照地址： https://blog.csdn.net/Lucky_LXG/article/details/77849212
 

## 控制台日志乱码

        1、file-setting 编辑器的编码设置成utf-8
        
        2、tomcat运行编码设置,在VM options填写: -Dfile.encoding=UTF-8
        
        3、自定义VM选项设置：-Dfile.encoding=UTF-8
                    