package com.yinhai.simulationreader;

/**
 * @author 银海
 * @version 1.0
 */
public class Test_ {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader = new BufferedReader_(new FileReader_());
        BufferedReader_ bufferedReader1 = new BufferedReader_(new StringReader_());
        bufferedReader.readFile(5);
        bufferedReader.readString(5);
    }
}
