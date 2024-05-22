package com.excel.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.EmployeeTechnicalSkills;

public interface EmployeeTechnicalRepository extends JpaRepository<EmployeeTechnicalSkills, Integer> {

	Optional<EmployeeTechnicalSkills> findBySkillTypeAndSkillRatingAndYearOfExperience(
			String skillType, String skillRating, double yearOfExperience);
}
