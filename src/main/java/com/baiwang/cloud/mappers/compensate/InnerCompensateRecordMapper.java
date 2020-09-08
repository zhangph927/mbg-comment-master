package com.baiwang.cloud.mappers.compensate;

import com.baiwang.cloud.common.bean.compensate.InnerCompensateRecord;

public interface InnerCompensateRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(InnerCompensateRecord record);

    int insertSelective(InnerCompensateRecord record);

    InnerCompensateRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InnerCompensateRecord record);

    int updateByPrimaryKey(InnerCompensateRecord record);
}