package com.ruoyi.project.work.signIn.service.impl;

import java.util.List;

import com.ruoyi.project.work.signIn.domain.SignIn;
import com.ruoyi.project.work.signIn.domain.SignInVo;
import com.ruoyi.project.work.signIn.mapper.SignInMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.work.signIn.service.ISignInService;
import com.ruoyi.common.utils.text.Convert;

import javax.annotation.Resource;

/**
 * 签到Service业务层处理
 *
 * @author ruoyi
 * @date 2020-06-14
 */
@Service
public class SignInServiceImpl implements ISignInService {
    @Resource
    private SignInMapper signInMapper;

    /**
     * 查询签到
     *
     * @param id 签到ID
     * @return 签到
     */
    @Override
    public SignInVo selectSignInById(Long id) {
        return signInMapper.selectSignInById(id);
    }

    /**
     * 查询签到列表
     *
     * @param signIn 签到
     * @return 签到
     */
    @Override
    public List<SignInVo> selectSignInList(SignIn signIn) {
        return signInMapper.selectSignInList(signIn);
    }

    /**
     * 新增签到
     *
     * @param signIn 签到
     * @return 结果
     */
    @Override
    public int insertSignIn(SignIn signIn) {
        return signInMapper.insertSignIn(signIn);
    }

    /**
     * 修改签到
     *
     * @param signIn 签到
     * @return 结果
     */
    @Override
    public int updateSignIn(SignIn signIn) {
        return signInMapper.updateSignIn(signIn);
    }

    /**
     * 删除签到对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSignInByIds(String ids) {
        return signInMapper.deleteSignInByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除签到信息
     *
     * @param id 签到ID
     * @return 结果
     */
    @Override
    public int deleteSignInById(Long id) {
        return signInMapper.deleteSignInById(id);
    }
}
