package cn.fh.jobdep.task.store.dao;

import cn.fh.jobdep.task.store.dao.model.TaskModel;

public interface TaskModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated
     */
    int insert(TaskModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated
     */
    int insertSelective(TaskModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated
     */
    TaskModel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TaskModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TaskModel record);
}