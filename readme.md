## Remote Debug for application that is run on the Docker run target:

1. start the Spring Boot Rc with docker target
2. start debug RC 'remote debug'
3. invoke http request

result: debugger stops at breakpoint, Spring Debugger staff is initialized, but no Spring stuff is available

with `Attach Debugger...` - no Spring debugger at all