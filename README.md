## Dubbo-SOA

### Dubbo+Zookeeper+Spring Context+Spring Data JPA
> 将电商系统进行服务拆分，各个子系统分别运行在不同的server上，达到各个模块之间松散耦合，仅仅通过dubbo向其他系统提供服务或者获取服务，提高系统稳定性，并且便于进行系统升级

getting start
1. 进入到每个模块的的core的test下面
1. 根据自己的server信息修改resources
1. 启动zookeeper
1. 运行main类
1. 启动soa-consumer-web模块

刚刚初学dubbo，如有错误，请提issue指正，或者联系我邮箱 debri_liu@163.com
下一步准备将此应用升级成spring boot的