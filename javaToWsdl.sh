mvn clean package

export classpath="D:\java\wdsl_test\wsdl-sdk\target\wsdl-sdk-1.0-SNAPSHOT.jar;$classpath"

echo $classpath;


#java org.apache.axis.wsdl.Java2WSDL -o DemoService.wsdl    \
#    -l"http://localhost:8080/axis/services/DemoService" \
#    -n "urn:DemoService" -p"com.gemdale.axis.demo.service" "urn:DemoService"    \
#    com.gemdale.axis.demo.service.DemoService
#

# 这里是demoService
# 注意：urn:com.gemdale.axis.generate.proxy 是生成代理类的路径，这个与wsdl2java.sh脚本里面也一样
#    java org.apache.axis.wsdl.Java2WSDL -o DemoService.wsdl    \
#        -l"http://localhost:8080/axis/services/DemoService" \
#        -n "urn:com.gemdale.axis.generate.proxy" -p"com.gemdale.axis.demo.service" "com.gemdale.axis.generate.proxy"    \
#        com.gemdale.axis.demo.service.DemoService

# 这里是TestService
    java org.apache.axis.wsdl.Java2WSDL -o TestService.wsdl    \
        -l"http://localhost:8080/axis/services/TestService" \
        -n "urn:com.gemdale.axis.generate.proxy" -p"com.gemdale.axis.demo.service" "com.gemdale.axis.generate.proxy"    \
        com.gemdale.axis.demo.service.TestService