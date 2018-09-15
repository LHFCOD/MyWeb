#!/bin/bash
basepath=$(cd `dirname $0`; pwd)
jarPackage=${basepath}/../target/MyWeb-1.0-SNAPSHOT.jar
mdsPath=${basepath}/../sliceapi/deploy/bin

java -Djava.library.path=$mdsPath -jar $jarPackage
