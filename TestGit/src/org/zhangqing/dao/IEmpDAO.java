package org.zhangqing.dao;

import java.util.Set;

import org.zhangqing.vo.Emp;

public interface IEmpDAO {
	public boolean doCreate(Emp vo) throws Exception;

	public boolean doUpdate(Emp vo) throws Exception;

	public boolean doRemove(Set<Integer> ids) throws Exception;

	public Integer getAllCount(String column, String keyWord) throws Exception;
}
