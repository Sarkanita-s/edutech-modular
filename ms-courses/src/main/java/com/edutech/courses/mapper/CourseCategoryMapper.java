package com.edutech.courses.mapper;

import com.edutech.common.dto.CourseCategoryDTO;
import com.edutech.courses.entity.CourseCategory;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseCategoryMapper {
    CourseCategoryDTO toDTO(CourseCategory entity);
    CourseCategory toEntity(CourseCategoryDTO dto);
}
