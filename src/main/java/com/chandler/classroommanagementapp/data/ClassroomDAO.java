package com.chandler.classroommanagementapp.data;

import com.chandler.classroommanagementapp.forms.Classroom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by davidprince on 7/31/17.
 */
@Repository
@Transactional
public interface ClassroomDAO extends CrudRepository<Classroom, Integer> {
}
