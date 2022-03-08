package com.wincom.dbsyncagent.tasks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.wincom.dbsyncagent.tasks.dao1.Db1Mapper;
import com.wincom.dbsyncagent.tasks.vo.VodBuyCancelVO;
import com.wincom.dbsyncagent.tasks.vo.VodBuyVO;

@Repository
public class dbSyncTaskServiceImpl implements dbSyncTaskService {
	
	@Autowired
	Db1Mapper dbSyncDao;

	public String getDBTime() throws Exception {
		return dbSyncDao.getDBTime();
	}
	
	public List<VodBuyCancelVO> vodBuyCancelList() throws Exception {
		
		List<VodBuyCancelVO> cancellist = dbSyncDao.vodBuyCancelList();
		return cancellist;
	}

	public List<VodBuyVO> vodBuyList(VodBuyCancelVO vodcancelitem ) throws Exception {
		
		List<VodBuyVO> buylist = dbSyncDao.vodBuyList(vodcancelitem);
		return buylist;
	}
	
	public void updateVodBuy(VodBuyCancelVO vodcancelitem) throws Exception {
		dbSyncDao.updateVodBuy(vodcancelitem);
	}
	
	public void updateVodCancelTbl(VodBuyCancelVO vodcancelitem) throws Exception {
		dbSyncDao.updateVodCancelTbl(vodcancelitem);
	}
}
