## Remote Debug for application that is run on the Docker run target:

1. start the Spring Boot Rc with docker target
2. start debug RC 'remote debug'
3. invoke http request

Problems:
Spring Debugger works, but not for the configuration properties:
 - the application.* files appear 'not loaded'
 - the properties evaluation doesn't work
 - the inlays for the actual property values are not shown