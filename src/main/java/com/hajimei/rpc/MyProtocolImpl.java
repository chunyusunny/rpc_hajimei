package com.hajimei.rpc;

import org.apache.hadoop.ipc.ProtocolSignature;

import java.io.IOException;

public class MyProtocolImpl implements MyProtocol {
    public int add(int v1, int v2) throws IOException {
        return v1 + v2;
    }

    @Override
    public String findName(String studentId) throws IOException {
        switch (studentId){
            case "20210123456789":
                return "心心";
//                break;
            case "G20210735010164":
                return "初め";
//                break;
            default:
                return null;
        }
    }

    public long getProtocolVersion(String s, long l) throws IOException {
        return MyProtocol.versionID;
    }

    public ProtocolSignature getProtocolSignature(String s, long l, int i) throws IOException {
        return new ProtocolSignature(MyProtocol.versionID, null);
    }
}

