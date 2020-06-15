package com.ruoyi.project.work.signIn.mapper;

import java.util.List;

import com.ruoyi.project.work.signIn.domain.SignIn;
import com.ruoyi.project.work.signIn.domain.SignInVo;

/**
 * 签到Mapper接口
 *
 * @author ruoyi
 * @date 2020-06-14
 */
public interface SignInMapper {
    /**
     * 查询签到
     *
     * @param id 签到ID
     * @return 签到
     */
    SignInVo selectSignInById(Long id);

    /**
     * 查询签到列表
     *
     * @param signIn 签到
     * @return 签到集合
     */
    List<SignInVo> selectSignInList(SignIn signIn);

    /**
     * 新增签到
     *
     * @param signIn 签到
     * @return 结果
     */
    int insertSignIn(SignIn signIn);

    /**
     * 修改签到
     *
     * @param signIn 签到
     * @return 结果
     */
    int updateSignIn(SignIn signIn);

    /**
     * 删除签到
     *
     * @param id 签到ID
     * @return 结果
     */
    int deleteSignInById(Long id);

    /**
     * 批量删除签到
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteSignInByIds(String[] ids);
}
