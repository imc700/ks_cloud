package com.ks_auth.ks_auth.course.response;

import com.google.common.collect.ImmutableMap;
import com.ks_auth.ks_auth.model.response.ResultCode;
import lombok.ToString;


/**
 * Created by admin on 2018/3/5.
 */
@ToString
public enum CourseCode implements ResultCode {
    COURSE_DENIED_DELETE(false,31001,"删除课程失败，只允许删除本机构的课程！"),
    COURSE_PUBLISH_PERVIEWISNULL(false,31002,"还没有进行课程预览！"),
    COURSE_PUBLISH_CDETAILERROR(false,31003,"创建课程详情页面出错！"),
    COURSE_PUBLISH_COURSEIDISNULL(false,31004,"课程Id为空！"),
    COURSE_PUBLISH_VIEWERROR(false,31005,"发布课程视图出错！"),
    COURSE_PUBLISH_CREATECOURSEPUB_ERROR(false,31006,"创建课程索引信息出错！"),
    COURSE_MEDIA_URLISNULL(false,31101,"选择的媒资文件访问地址为空！"),
    COURSE_MEDIA_NAMEISNULL(false,31102,"选择的媒资文件名称为空！"),
    COURSE_GET_NOTEXISTS(false,31103,"找不到课程信息！"),
    COURSE_MEDIA_TEACHPLAN_GRADEERROR(false,31104,"只允许选择第三级的课程计划关联视频！");


    //操作代码
    boolean success;

    //操作代码
    int code;
    //提示信息
    String message;
    private CourseCode(boolean success, int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }
    private static final ImmutableMap<Integer, CourseCode> CACHE;

    static {
        final ImmutableMap.Builder<Integer, CourseCode> builder = ImmutableMap.builder();
        for (CourseCode commonCode : values()) {
            builder.put(commonCode.code(), commonCode);
        }
        CACHE = builder.build();
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
