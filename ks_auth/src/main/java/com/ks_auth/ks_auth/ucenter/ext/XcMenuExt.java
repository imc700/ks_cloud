package com.ks_auth.ks_auth.ucenter.ext;

import com.ks_auth.ks_auth.course.ext.CategoryNode;
import com.ks_auth.ks_auth.ucenter.XcMenu;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by admin on 2018/3/20.
 */
@Data
@ToString
public class XcMenuExt extends XcMenu {

    List<CategoryNode> children;
}
