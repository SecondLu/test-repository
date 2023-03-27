package org.mes.db.dao;

import org.apache.ibatis.annotations.Param;
import org.mes.service.model.AchievesProjectExperience;

import java.util.List;

/**
 * 《人事档案》模块，《工作履历》部分的项目经验DAO
 *
 * @author hongchuangbin
 * @date 2022-11-30
 */
@Repository
public interface AchievesProjectExperienceDao {

    /**
     * 新增1条记录
     * @param param
     * @return
     */
    Integer addAchievesProjectExperience(AchievesProjectExperience param);

    /**
     * 新增N条记录
     * @param param
     * @return
     */
    Integer addAchievesProjectExperienceList(List<AchievesProjectExperience> param);

    /**
     * 更新某条记录的字段
     * @param param
     * @return
     */
    Integer editAchievesProjectExperience(AchievesProjectExperience param);

    /**
     * 删除某些记录（逻辑删除）
     * @param idList
     * @param updateUserCode
     * @param updateUserName
     * @return
     */
    Integer deleteAchievesProjectExperienceList(@Param("idList") List<Integer> idList
            , @Param("updateUserCode") String updateUserCode
            , @Param("updateUserName") String updateUserName);

    /**
     * 查询某条记录
     * @param param
     * @return
     */
    AchievesProjectExperience getOneRecord(AchievesProjectExperience param);

    /**
     * 分页查询某些记录集合
     * @param param
     * @return
     */
    List<AchievesProjectExperience> getPage(AchievesProjectExperience param);

    /**
     * 统计查询某些记录
     * @param param
     * @return
     */
    Integer getPageCount(AchievesProjectExperience param);

    /**
     * 查询某些记录集合
     * @param param
     * @return
     */
    List<AchievesProjectExperience> getList(AchievesProjectExperience param);
}