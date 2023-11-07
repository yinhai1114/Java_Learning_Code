package com.yinhai.simulationreader;

/**
 * @author 银海
 * @version 1.0
 */
public class BufferedReader_ extends Reader_{
    private Reader_ reader_;

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }
    //让方法更灵活多次读取
    public void readFile(int num){
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }
    public void readString(int num){
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
}
