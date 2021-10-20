 mvn clean package

 cp  target/wdsl_test-1.0-SNAPSHOT.jar  /d/software/apache-tomcat-8.5.71-axis/webapps/axis/WEB-INF/lib/


java org.apache.axis.client.AdminClient com/gemdale/axis/generate/proxy/deploy.wsdd
