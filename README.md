# 家政服务管理系统
- 基于ssm框架

# 项目运行说明
> 安装 mysql数据库  本人使用的版本是(5.1)
> 创建数据库 house_manage
> 导入数据库文件 主目录下面的 house_manage.sql
> 请使用maven运行项目 输入 tomcat7:run

## 后端使用的相关技术
- spring
- springMVC
- fastjson				数据交互
- poi					excel表生成
- commons-fileupload  	文件上传
- javax.mail           	邮件发送
- mybatis 	        	持久层框架
- druid					数据库连接池
- freemarker    		模板引擎
- qiniu      			七牛云文件上传


## 1.0版本发布
- 修改文件上传服务器为七牛云
- 修改邮件发送邮箱为配置形式 放入到wl-config.properties中
- 优化数据库主键生成策略
- 修复项目运行时 不自动跳转到前台页面的bug
