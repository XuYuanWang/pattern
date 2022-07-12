#!/bin/bash -v

branch=$1
tagTime=$2
tagPoint=$3

if [ "$branch" = "" ];then
  echo "branch 为空"
  exit
fi

if [ "$tagTime" = "" ];then
  echo "tagTime 为空"
  exit
fi

if [ "$tagPoint" = "" ];then
  echo "tagPoint 为空"
  exit
fi



buildPath="ccr.ccs.tencentyun.com/lensung_wshop/order-prod"
projectPath="/opt/repository/linshang_weixin_trade_new"

webPackage="/opt/repository/linshang_weixin_trade_new/web"

cd $projectPath || return
git checkout "$branch"
git pull
mvn clean
mvn install
cd $webPackage || return
mvn package
docker login --username=100017497653 --password=xujun102030 ccr.ccs.tencentyun.com
docker build -t $buildPath:$tagTime-$branch-$tagPoint .
docker push $buildPath:$tagTime-$branch-$tagPoint

# 命令 sh /opt/weixin-server.sh master 20210205 361

