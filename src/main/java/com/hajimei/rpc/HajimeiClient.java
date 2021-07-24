package com.hajimei.rpc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

public class HajimeiClient {
    public static void main(String[] args) throws IOException {
        MyProtocol proxy = RPC.getProxy(MyProtocol.class, MyProtocol.versionID,
                new InetSocketAddress("localhost", 9999),
                new Configuration());
        System.out.println("findStudent(20210000000000) = " + proxy.findName("20210000000000"));
        System.out.println("findStudent(20210123456789) = " + proxy.findName("20210123456789"));
        System.out.println("findStudent(G20210735010164) = " + proxy.findName("G20210735010164"));
    }
}
