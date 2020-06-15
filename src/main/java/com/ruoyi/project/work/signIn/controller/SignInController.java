package com.ruoyi.project.work.signIn.controller;

import java.util.List;

import com.ruoyi.project.work.signIn.domain.SignIn;
import com.ruoyi.project.work.signIn.domain.SignInVo;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.work.signIn.service.ISignInService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 签到Controller
 *
 * @author ruoyi
 * @date 2020-06-14
 */
@Controller
@RequestMapping("/work/signIn")
public class SignInController extends BaseController {
    private String prefix = "work/signIn";

    @Autowired
    private ISignInService signInService;

    @RequiresPermissions("work:signIn:view")
    @GetMapping("")
    public String signIn() {
        return prefix + "/signIn";
    }

    /**
     * 查询签到列表
     */
    @RequiresPermissions("work:signIn:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SignIn signIn) {
        startPage();
        List<SignInVo> list = signInService.selectSignInList(signIn);
        return getDataTable(list);
    }

    /**
     * 导出签到列表
     */
    @RequiresPermissions("work:signIn:export")
    @Log(title = "签到", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SignIn signIn) {
        List<SignInVo> list = signInService.selectSignInList(signIn);
        ExcelUtil<SignInVo> util = new ExcelUtil<>(SignInVo.class);
        return util.exportExcel(list, "signIn");
    }

    /**
     * 新增签到
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存签到
     */
    @RequiresPermissions("work:signIn:add")
    @Log(title = "签到", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SignIn signIn) {
        return toAjax(signInService.insertSignIn(signIn));
    }

    /**
     * 修改签到
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        SignInVo signInVo = signInService.selectSignInById(id);
        mmap.put("signIn", signInVo);
        return prefix + "/edit";
    }

    /**
     * 修改保存签到
     */
    @RequiresPermissions("work:signIn:edit")
    @Log(title = "签到", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SignIn signIn) {
        return toAjax(signInService.updateSignIn(signIn));
    }

    /**
     * 删除签到
     */
    @RequiresPermissions("work:signIn:remove")
    @Log(title = "签到", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(signInService.deleteSignInByIds(ids));
    }
}
