package com.ruoyi.project.work.course.mapper;

import java.util.List;

import com.ruoyi.project.work.course.domain.Course;

/**
 * 课程Mapper接口
 *
 * @author ruoyi
 * @date 2020-06-15
 */
public interface CourseMapper {
    /**
     * 查询课程
     *
     * @param courseId 课程ID
     * @return 课程
     */
        Course selectCourseById(Long courseId);

    /**
     * 查询课程列表
     *
     * @param course 课程
     * @return 课程集合
     */
    List<Course> selectCourseList(Course course);

    /**
     * 新增课程
     *
     * @param course 课程
     * @return 结果
     */
    int insertCourse(Course course);

    /**
     * 修改课程
     *
     * @param course 课程
     * @return 结果
     */
    int updateCourse(Course course);

    /**
     * 删除课程
     *
     * @param courseId 课程ID
     * @return 结果
     */
    int deleteCourseById(Long courseId);

    /**
     * 批量删除课程
     *
     * @param courseIds 需要删除的数据ID
     * @return 结果
     */
    int deleteCourseByIds(String[] courseIds);
}
