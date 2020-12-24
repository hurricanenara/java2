package com.sparta.week02.domain;

import org.springframework.data.jpa.repository.JpaRepository;

// <RepoName, PrimaryKeyType>
public interface CourseRepository extends JpaRepository<Course, Long> {
}
