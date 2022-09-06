//package com.xinghuan.thrift_server.servers;
//
//import com.xinghuan.thrift_server.UserService;
//import com.xinghuan.thrift_server.service.UserServiceImpl;
//import org.apache.thrift.protocol.TCompactProtocol;
//import org.apache.thrift.server.TNonblockingServer;
//import org.apache.thrift.transport.TNonblockingServerSocket;
//import org.apache.thrift.transport.layered.TFramedTransport;
//
//public class NonBlockingServer {
//    public static void main(String[] args) {
//        try{
//            TNonblockingServerSocket tNonblockingServerSocket = new TNonblockingServerSocket(9090);
//            //获取processor
//            UserService.Processor processor = new UserService.Processor(new UserServiceImpl());
//            //指定TCompactProtocol
//            TCompactProtocol.Factory factory = new TCompactProtocol.Factory();
//            //指定TFramedTransport，非阻塞模型一定要使用TFramedTransport
//            TFramedTransport.Factory factory1 = new TFramedTransport.Factory();
//            TNonblockingServer.Args args1 = new TNonblockingServer.Args(tNonblockingServerSocket);
//            args1.processor(processor);
//            args1.protocolFactory(factory);
//            args1.transportFactory(factory1);
//
//            //使用NIO服务端和客户端需要指定TFramedTransport
//            TNonblockingServer tNonblockingServer = new TNonblockingServer(args1);
//            System.out.println("Starting Non-blocking server...");
//            tNonblockingServer.serve();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//}
