package com.xinghuan.thrift_server2.servers;


import com.xinghuan.thrift_server2.UserService;
import com.xinghuan.thrift_server2.service.UserServiceImpl;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.layered.TFramedTransport;

public class HaHaServer {
    public static void main(String[] args) {
        try{
            TNonblockingServerSocket tNonblockingServerSocket = new TNonblockingServerSocket(9090);
            //获取processor
            UserService.Processor processor = new UserService.Processor(new UserServiceImpl());
            //指定TCompactProtocol
            TCompactProtocol.Factory factory = new TCompactProtocol.Factory();
            //指定TFramedTransport
            TFramedTransport.Factory factory1 = new TFramedTransport.Factory();
            THsHaServer.Args args1 = new THsHaServer.Args(tNonblockingServerSocket).maxWorkerThreads(200).minWorkerThreads(30);
            args1.processor(processor);
            args1.protocolFactory(factory);
            args1.transportFactory(factory1);

            //NIO 引入线程池处理业务
            TServer server = new THsHaServer(args1);
            System.out.println("Starting HsHa server...");
            server.serve();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
