package org.mes.service.service;

import org.mes.service.model.AchievesProjectExperience;
import org.mes.service.model.DatagridForLayUI;
import org.mes.service.model.Json;
import org.mes.service.model.SessionInfo;

import java.util.List;

/**
 * 《人事档案》模块，《工作履历》部分的项目经验Service
 *
 * @author hongchuangbin
 * @date 2022-11-30
 */
public interface IAchievesProjectExperienceService {

    /**
     * 新增一条记录
     * @param param
     * @return
     */
    Json addRecord(AchievesProjectExperience param, SessionInfo sessionInfo);

    /**
     * 新增一些记录
     * @param param
     * @return
     */
    Json addRecord(List<AchievesProjectExperience> param, SessionInfo sessionInfo);

    /**
     * 更新一条记录
     * @param param
     * @return
     */
    Json editRecord(AchievesProjectExperience param, SessionInfo sessionInfo);

    /**
     * 删除一些记录
     * @param param
     * @return
     */
    Json delRecord(List<Integer> param, SessionInfo sessionInfo);

    /**
     * 分页获取一些记录
     * @param param
     * @return
     */
    DatagridForLayUI getPage(AchievesProjectExperience param, SessionInfo sessionInfo);

    /**
     * 获取一些记录
     * @param param
     * @return
     */
    List<AchievesProjectExperience> getList(AchievesProjectExperience param);

    /**
     * 获取一条记录
     * @param param
     * @return
     */
    AchievesProjectExperience getOneRecord(AchievesProjectExperience param);
}