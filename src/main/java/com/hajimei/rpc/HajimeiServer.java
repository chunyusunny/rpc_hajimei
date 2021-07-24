package com.hajimei.rpc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import java.io.IOException;

public class HajimeiServer {
    public static void main(String[] args) throws IOException {
        RPC.Server server = new RPC.Builder(new Configuration())
                .setBindAddress("localhost")
                .setPort(9999)
                .setProtocol(MyProtocol.class)
                .setInstance(new MyProtocolImpl())
//                .setNumHandlers(5)
                .build();
        server.start();
    }
}