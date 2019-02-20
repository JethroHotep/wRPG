#!/usr/bin/env sh
pushd ../
mvn install
popd
cp -v ../target/*.jar plugins/
java -Xmx4192M -Xms4192M -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 -jar spigot-1.13.2.jar -nojline
