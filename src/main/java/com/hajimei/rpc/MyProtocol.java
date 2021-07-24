package com.hajimei.rpc;

import org.apache.hadoop.ipc.VersionedProtocol;

import java.io.IOException;

public interface MyProtocol extends VersionedProtocol{
    long versionID = 1L;//version number, by default different version's rpc client and server cannot communicate
    int add(int number1, int number2) throws IOException;
    String findName(String studentId) throws IOException;
}
