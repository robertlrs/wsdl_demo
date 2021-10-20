#java org.apache.axis.wsdl.WSDL2Java -o . -d Session -s -S true \
#    -Nurn:com.gemdale.axis.generate.proxy com.gemdale.axis.generate.proxy DemoService.wsdl

 java org.apache.axis.wsdl.WSDL2Java --server-side \
    --skeletonDeploy true \
    -Nurn:com.gemdale.axis.generate.proxy com.gemdale.axis.generate.proxy DemoService.wsdl