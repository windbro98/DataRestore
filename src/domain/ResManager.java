package domain;
/**
 * todo: decryption和decompression书写
 */

import com.alibaba.fastjson2.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static util.FileToolUtil.fileRestoreSingle;
import static util.FileToolUtil.readJson;

public class ResManager {
    private String resDir;
    private String compType;
    private String encryType;

    public ResManager(String resDir, String compType, String encryType) {
        this.resDir = resDir;
        this.compType = compType;
        this.encryType = encryType;
    }

    public static void fileRestore(String backFilePath, String resDir) throws IOException {
        String backJsonPath = backFilePath+".json";
        File backFile = new File(backFilePath);
        FileInputStream is = new FileInputStream(backFile);
        JSONObject metaJson = readJson(backJsonPath);
        int fileLen = -1;
        for(String key : metaJson.keySet()){
            fileLen = metaJson.getIntValue(key);
            fileRestoreSingle(is, resDir+key, fileLen);
        }
    }

    private static void fileDecryption(){

    }

    private static void fileDecompression(){

    }
}