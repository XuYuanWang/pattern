FROM openjdk:8-jdk-alpine

# set timezone
RUN apk add --no-cache tzdata && \
	cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
	echo "Asia/Shanghai" > /etc/timezone && \
	apk del tzdata
RUN date
WORKDIR /wecom-api/

COPY target/wecom-api.jar /wecom-api/wecom-api.jar
ENTRYPOINT exec java $JAVA_OPTS  -jar wecom-api.jar