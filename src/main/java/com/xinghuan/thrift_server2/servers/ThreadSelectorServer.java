package com.xinghuan.thrift_server2.servers;


import com.xinghuan.thrift_server2.UserService;
import com.xinghuan.thrift_server2.service.UserServiceImpl;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.TThreadedSelectorServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.layered.TFramedTransport;

public class ThreadSelectorServer {
    public static void main(String[] args) {
        try{
            TNonblockingServerSocket tNonblockingServerSocket = new TNonblockingServerSocket(9090);

            //获取processor
            UserService.Processor processor = new UserService.Processor(new UserServiceImpl());
            //指定TCompactProtocol
            TCompactProtocol.Factory factory = new TCompactProtocol.Factory();
            //指定TFramedTransport
            TFramedTransport.Factory factory1 = new TFramedTransport.Factory();

            TThreadedSelectorServer.Args args1 = new TThreadedSelectorServer.Args(tNonblockingServerSocket).workerThreads(200);
            args1.processor(processor);
            args1.protocolFactory(factory);
            args1.transportFactory(factory1);

            //NIO引入线程池处理业务
            TThreadedSelectorServer tThreadedSelectorServer = new TThreadedSelectorServer(args1);
            System.out.println("Starting ThreadedSelector server...");
            tThreadedSelectorServer.serve();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
