package com.xj.pattern.myDailyTest;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.util.CollectionUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * TestOne
 *
 * @author XuJun
 * @version v1.0
 * {@code @createDate} 2022/7/18
 * <p>
 *     日常测试1：表格数据读取
 *     这里用的是hutool + poi
 *     还可以用阿里的easyexcel
 */
public class TestOne {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\junxu\\Downloads\\邻商店管家导入模板.xlsx");

        ExcelReader reader = ExcelUtil.getReader(file);
        // 表格索引从0开始
        int startRow = 0;
        List<Object> list = new ArrayList<>();
        while (true) {
            List<Object> text = reader.readRow(startRow);
            if (CollectionUtils.isEmpty(text) || text.isEmpty()) {
                break;
            }
            if(startRow>1){
                String wordsGroupName = "";
                String wordsContent = "";
                String wordsTitle = "";
                for (int i = 0; i < text.size(); i++) {
                    if (i == 0) {
                        wordsGroupName = String.valueOf(text.get(0));
                    }
                    if (i == 1) {
                        wordsTitle = String.valueOf(ObjectUtils.defaultIfNull(text.get(1), ""));
                    }
                    if (i == 2) {
                        wordsContent = String.valueOf(text.get(2));
                    }
                }
                list.add(wordsGroupName);
                list.add(wordsContent);
                list.add(wordsTitle);
            }
            startRow++;
        }
        if(CollectionUtils.isEmpty(list) || list.isEmpty()){
            throw new RuntimeException("这是异常");
        }
    }
}
