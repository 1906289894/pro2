package com.wb;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if (source == null){
            throw new RuntimeException("参数不能为空");
        }

        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date date = df.parse(source);
            return date;
        } catch (ParseException e) {
            throw new RuntimeException("类型转换错误");
        }

    }
}
