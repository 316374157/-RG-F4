package com.rgf5.dao;

import com.rgf5.bean.DateBank;

import java.util.List;

/**
 * 文件对数据库的操作
 * @author Administrator
 */
public interface DateBankDao {
    /**
     * 添加一个文件
     * @param dateBank 添加的文件
     * @return true表示添加成功
     */
    public boolean add(DateBank dateBank);
    /**
     * 文件的信息更新
     * @param dateBank 更新过的文件
     * @return True表示更新成功
     */
    public boolean update(DateBank dateBank);

    /**
     * 删除一份文件
     * @param dateBank 要删除的文件
     * @return true表示删除成功
     */
    public boolean delete(DateBank dateBank);
    /**
     * 获取所有的文件信息
     * @return 所有的文件信息
     */
    public List<DateBank> getBeanListAll();
    /**
     * 通过文件名获取文件信息
     * @param dataName 文件名
     * @return 文件的所有信息
     */
    public List<DateBank> getBeanByDataName(String dataName);
    /**
     * 通过文件路径获取文件信息
     * @param dataPath 文件路径
     * @return 一份文件的信息
     */
    public DateBank getBeanByDataPath(String dataPath);
    /**
     * 通过班级ID获取文件信息
     * @param classId 班级ID
     * @return 一个班级的所有文件信息
     */
    public List<DateBank> getBeanListByClassId(String classId);
    /**
     * 通过课程ID获取文件信息
     * @param courseId 课程ID
     * @return 一个课程的所有文件信息
     */
    public List<DateBank> getBeanListByCourseId(String courseId);

    /**
     * 通过文件类型获取文件信息
     * @param dataType 文件类型
     * @return 一个类型的所有文件信息
     */
    public List<DateBank> getBeanListByDataType(String dataType);

}
