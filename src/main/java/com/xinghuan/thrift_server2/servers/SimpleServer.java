package com.xinghuan.thrift_server2.servers;


import com.xinghuan.thrift_server2.UserService;
import com.xinghuan.thrift_server2.service.UserServiceImpl;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class SimpleServer {
    public static void main(String[] args) {
        try{
            TServerTransport tServerTransport = new TServerSocket(9090);
            //获取processor
            UserService.Processor processor = new UserService.Processor(new UserServiceImpl());
            //指定TBinaryProtocol
            TBinaryProtocol.Factory factory = new TBinaryProtocol.Factory();
            TSimpleServer.Args targs = new TSimpleServer.Args(tServerTransport);
            targs.processor(processor);
            targs.protocolFactory(factory);

            //单线程服务模型，一般用于测试
            TServer server = new TSimpleServer(targs);
            System.out.println("Starting the simple server...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
