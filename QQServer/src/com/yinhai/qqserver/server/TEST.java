package com.yinhai.qqserver.server;

import com.yinhai.qqcommon.Message;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 银海
 * @version 1.0
 */
public class TEST {
    HashMap<String, ArrayList<Message>> offLines = new HashMap<>();
    ArrayList<Message> messages = new ArrayList<>();
}

