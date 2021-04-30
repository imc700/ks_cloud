package com.ks_auth.ks_auth.course.ext;

import com.ks_auth.ks_auth.course.CourseBase;
import com.ks_auth.ks_auth.course.CourseMarket;
import com.ks_auth.ks_auth.course.CoursePic;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Administrator
 * @version 1.0
 **/
@Data
@NoArgsConstructor
@ToString
public class CourseView implements java.io.Serializable {
    private CourseBase courseBase;
    private CoursePic coursePic;
    private CourseMarket courseMarket;
    private TeachplanNode teachplanNode;
}
