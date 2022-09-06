//package com.xinghuan.thrift_server.servers;
//
//import com.xinghuan.thrift_server.UserService;
//import com.xinghuan.thrift_server.service.UserServiceImpl;
//import org.apache.thrift.protocol.TBinaryProtocol;
//import org.apache.thrift.server.TServer;
//import org.apache.thrift.server.TSimpleServer;
//import org.apache.thrift.server.TThreadPoolServer;
//import org.apache.thrift.transport.TServerSocket;
//import org.apache.thrift.transport.TServerTransport;
//
//public class ThreadPoolServer {
//    public static void main(String[] args) {
//        try{
//            TServerTransport tServerTransport = new TServerSocket(9090);
//            //获取processor
//            UserService.Processor processor = new UserService.Processor(new UserServiceImpl());
//            //指定TBinaryProtocol
//            TBinaryProtocol.Factory factory = new TBinaryProtocol.Factory();
//            //线程池模型参数，最大线程和最小线程参数
//            TThreadPoolServer.Args targs = new TThreadPoolServer.Args(tServerTransport).minWorkerThreads(30).maxWorkerThreads(200);
//            targs.processor(processor);
//            targs.protocolFactory(factory);
//
//            //线程池服务模型 使用标准的阻塞式IO 预先创建一组线程去处理请求
//            TServer server = new TThreadPoolServer(targs);
//            System.out.println("Starting the ThreadPool server...");
//            server.serve();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
