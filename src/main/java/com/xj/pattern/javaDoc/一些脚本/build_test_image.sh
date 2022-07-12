#!/bin/bash
mvn clean package
if [ $? -eq 0 ]; then
  echo 'maven build success'
else
  echo "maven failed,exit"
  exit 1
fi

# 获取git分支名
branch=$(git symbolic-ref --short -q HEAD)
# 获取git设置的邮箱
email=$(git config user.email)
# 截取邮箱@符号前面的名字，如果用的是公司邮箱就是姓名lizhiheng+@lensung.com，截取后剩下名字
emailshort=${email%@*}
#剔除掉'
emailshort=`echo $emailshort | sed -e " s/^[/']*//g"`
echo current git branch is $branch,email is $email
currentdate=$(date "+%Y%m%d-%H%M")
#echo current date:[$currentdate],branch:[$branch],email:[$emailshort]

tag=$currentdate"-$branch-$emailshort"
echo $tag

docker login --username=100009102531 ccr.ccs.tencentyun.com --password=******
docker build -t  ccr.ccs.tencentyun.com/lensung_store/wecom-systemapitest:$tag --platform=linux/amd64 .
docker push ccr.ccs.tencentyun.com/lensung_store/wecom-systemapitest:$tag
#tag=0.1
if [ $? -eq 0 ]; then
  echo "docker push success"
  date
fi

