#!/bin/bash -v

orginBranch=$1
localBranch=$2

checkoutOriginBranch=`git checkout $orginBranch`
if [ $? -gt 0 ]
then
	exit
fi

checkoutLocalBranch=`git branch -D $localBranch`


pullOriginBranch=`git pull`
if [ $? -gt 0 ]
then
	exit
fi

checkoutNewOriginBranch=`git checkout -b $localBranch`
if [ $? -gt 0 ]
then
	exit
fi
