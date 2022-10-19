# 指定基础镜像
FROM swr.cn-south-1.myhuaweicloud.com/mldong/8u212-jdk-alpine-mldong:latest
# EXPOSE 映射端口
EXPOSE 8080
ARG JAR_FILE
ADD target/${JAR_FILE} /app.jar
# CMD 运行以下命令(如果yaml文件定义了command会被覆盖)
ENTRYPOINT ["java", "-jar","/app.jar"]