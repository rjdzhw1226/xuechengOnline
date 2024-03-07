package org.xuecheng.content.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xuecheng.content.service.CourseBaseService;

/**
 * <p>
 * 课程基本信息 前端控制器
 * </p>
 *
 * @author RJD
 */
@Slf4j
@RestController
@RequestMapping("courseBase")
public class CourseBaseController {

    @Autowired
    private CourseBaseService courseBaseService;
}
