package org.mes.db.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.mes.db.dao.AchievesProjectExperienceDao;
import org.mes.exception.BaseException;
import org.mes.service.model.*;
import org.mes.service.service.IAchievesProjectExperienceService;
import org.mes.utils.PbUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Collection;
import java.util.List;

/**
 * 《人事档案》模块，《工作履历》部分的项目经验Service实现类
 *
 * @author hongchuangbin
 * @date 2022-11-30
 */
@Service
public class AchievesProjectExperienceServiceImpl implements IAchievesProjectExperienceService {

    private static final Logger logger = LoggerFactory.getLogger(AchievesProjectExperienceServiceImpl.class);

    @Autowired
    private AchievesProjectExperienceDao achievesProjectExperienceDao;

    /**
     * 非空校验
     * @param param
     * @throws Exception
     */
    private void checkParameter(Object param) throws Exception {
        if (param instanceof Collection) {
            String jsonString = JSONObject.toJSONString(param);
            List<Object> paramList = JSONArray.parseArray(jsonString, Object.class);
            Assert.notEmpty(paramList, "传入参数集合为空");
            for (Object item : paramList) {
                Assert.notNull(item, "传入参数为空");
            }
        } else if (param.getClass().isArray()) {
            Object[] paramArray = (Object[]) param;
            Assert.notEmpty(paramArray, "传入参数集合为空");
            for (Object item : paramArray) {
                Assert.notNull(item, "传入参数为空");
            }
        } else {
            Assert.notNull(param, "传入参数为空");
        }
    }

    /**
     * 登录校验
     * @param param
     * @throws Exception
     */
    private void checkParameter(Object param, SessionInfo sessionInfo) throws Exception {
        if (sessionInfo == null) {
            throw new BaseException("操作人未登录");
        }
        checkParameter(param);
    }

    private void notNullField(Object param) {
        AchievesProjectExperience object = JSONObject.parseObject(JSONObject.toJSONString(param), AchievesProjectExperience.class);
        if (object != null) {
            Assert.notNull(object.getFillYear(), "填充年份为空");
            Assert.notNull(object.getProjectName(), "项目名称为空");
            Assert.notNull(object.getProjectStage(), "项目阶段为空");
            Assert.notNull(object.getOperCd(), "工号为空");
            Assert.notNull(object.getOperNm(), "姓名为空");
        }
    }

    @Override
    public Json addRecord(AchievesProjectExperience param, SessionInfo sessionInfo) {
        try {
            checkParameter(param, sessionInfo);
            OperInf operInf = sessionInfo.getOperInf();
            param.setCreateUserCode(operInf.getOperCd());
            param.setCreateUserName(operInf.getOperNm());
            Integer row = achievesProjectExperienceDao.addAchievesProjectExperience(param);
            if (row.equals(1)) {
                return new Json().success(true).msg("成功新增数据");
            } else {
                logger.info("AchievesProjectExperienceServiceImpl.addRecord(param, sessionInfo) -- 传入参数 -- {}", param);
                return new Json().success(false).msg("新增数据失败");
            }
        } catch (Exception e) {
            logger.info("AchievesProjectExperienceServiceImpl.addRecord(param, sessionInfo) -- 传入参数 -- {}", param);
            logger.error("异常详情：", e);
            return new Json().success(false).msg("服务器异常");
        }
    }

    @Override
    public Json addRecord(List<AchievesProjectExperience> param, SessionInfo sessionInfo) {
        try {
            checkParameter(param, sessionInfo);
            for (AchievesProjectExperience item : param) {
                OperInf operInf = sessionInfo.getOperInf();
                item.setCreateUserCode(operInf.getOperCd());
                item.setCreateUserName(operInf.getOperNm());
            }
            Integer row = achievesProjectExperienceDao.addAchievesProjectExperienceList(param);
            if (row.equals(param.size())) {
                return new Json().success(true).msg("成功新增数据");
            } else {
                logger.info("AchievesProjectExperienceServiceImpl.addRecord(param, sessionInfo) -- 传入参数 -- {}", param);
                return new Json().success(false).msg("新增数据失败");
            }
        } catch (Exception e) {
            logger.info("AchievesProjectExperienceServiceImpl.addRecord(param, sessionInfo) -- 传入参数 -- {}", param.toString());
            logger.error("异常详情：", e);
            return new Json().success(false).msg("服务器异常");
        }
    }

    @Override
    public Json editRecord(AchievesProjectExperience param, SessionInfo sessionInfo) {
        try {
            checkParameter(param, sessionInfo);
            OperInf operInf = sessionInfo.getOperInf();
            param.setUpdateUserCode(operInf.getOperCd());
            param.setUpdateUserName(operInf.getOperNm());
            Integer row = achievesProjectExperienceDao.editAchievesProjectExperience(param);
            if (row.equals(1)) {
                return new Json().success(true).msg("成功更新数据");
            } else {
                logger.info("AchievesProjectExperienceServiceImpl.editRecord(param, sessionInfo) -- 传入参数 -- {}", param);
                return new Json().success(false).msg("更新数据失败");
            }
        } catch (Exception e) {
            logger.info("AchievesProjectExperienceServiceImpl.editRecord(param, sessionInfo) -- 传入参数 -- {}", param);
            logger.error("异常详情：", e);
            return new Json().success(false).msg("服务器异常");
        }
    }

    @Override
    public Json delRecord(List<Integer> param, SessionInfo sessionInfo) {
        try {
            checkParameter(param, sessionInfo);
            OperInf operInf = sessionInfo.getOperInf();
            Integer row = achievesProjectExperienceDao.deleteAchievesProjectExperienceList(param, operInf.getOperCd()
                    , operInf.getOperNm());
            if (row.equals(1)) {
                return new Json().success(true).msg("成功删除数据");
            } else {
                logger.info("AchievesProjectExperienceServiceImpl.delRecord(param, sessionInfo) -- 传入参数 -- {}", param);
                return new Json().success(false).msg("删除数据失败");
            }
        } catch (Exception e) {
            logger.info("AchievesProjectExperienceServiceImpl.delRecord(param, sessionInfo) -- 传入参数 -- {}", param);
            logger.error("异常详情：", e);
            return new Json().success(false).msg("服务器异常");
        }
    }

    @Override
    public DatagridForLayUI getPage(AchievesProjectExperience param, SessionInfo sessionInfo) {
        DatagridForLayUI result = new DatagridForLayUI();
        try {
            checkParameter(param, sessionInfo);
            Integer count = achievesProjectExperienceDao.getPageCount(param);
            param.setBegin(PbUtils.getPageBegin(count, param.getPage(), param.getLimit()));
            List<AchievesProjectExperience> list = achievesProjectExperienceDao.getList(param);
            result.setData(list);
            result.setCount(Long.valueOf(count));
        } catch (Exception e) {
            logger.info("AchievesProjectExperienceServiceImpl.getPage(param, sessionInfo) -- 传入参数 -- {}", param);
            logger.error("异常详情：", e);
            result.setMsg("获取数据异常" + e.getMessage());
        }
        return result;
    }

    @Override
    public List<AchievesProjectExperience> getList(AchievesProjectExperience param) {
        try {
            checkParameter(param);
            return achievesProjectExperienceDao.getList(param);
        } catch (Exception e) {
            logger.info("AchievesProjectExperienceServiceImpl.getList(param) -- 传入参数 -- {}", param);
            logger.error("异常详情：", e);
        }
        return null;
    }

    @Override
    public AchievesProjectExperience getOneRecord(AchievesProjectExperience param) {
        try {
            checkParameter(param);
            return achievesProjectExperienceDao.getOneRecord(param);
        } catch (Exception e) {
            logger.info("AchievesProjectExperienceServiceImpl.getOneRecord(param) -- 传入参数 -- {}", param);
            logger.error("异常详情：", e);
        }
        return null;
    }
}
