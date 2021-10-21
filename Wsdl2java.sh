#java org.apache.axis.wsdl.WSDL2Java -o . -d Session -s -S true \
#    -Nurn:com.gemdale.axis.generate.proxy com.gemdale.axis.generate.proxy DemoService.wsdl


#java org.apache.axis.wsdl.WSDL2Java -o . -d Session -s -S true \
#    -Nurn:com.gemdale.axis.generate.proxy com.gemdale.axis.generate.proxy TestService.wsdl
#

#java org.apache.axis.wsdl.WSDL2Java -o ./wsdl-sdk/src/main/java/ -d Session -s -S true \
#    -Nurn:com.gemdale.axis.generate.proxy com.gemdale.axis.generate.proxy  TestService.wsdl


#java org.apache.axis.wsdl.WSDL2Java -o ./wsdl-sdk/src/main/java/ \
#    -Nurn:com.gemdale.axis.generate.proxy com.gemdale.axis.generate.proxy \
#    --server-side --skeletonDeploy true  TestService.wsdl

rm -rf ./wsdl-sdk/src/main/java/com/gemdale/axis/generate/proxy

#java org.apache.axis.wsdl.WSDL2Java -o ./wsdl-sdk/src/main/java/ \
#    -Nurn:com.gemdale.axis.generate.proxy com.gemdale.axis.generate.proxy \
#    --server-side --skeletonDeploy false  TestService.wsdl

java org.apache.axis.wsdl.WSDL2Java -o ./wsdl-sdk/src/main/java/ \
    -Nurn:com.gemdale.axis.generate.proxy com.gemdale.axis.generate.proxy \
    --server-side --skeletonDeploy true  TestService.wsdl