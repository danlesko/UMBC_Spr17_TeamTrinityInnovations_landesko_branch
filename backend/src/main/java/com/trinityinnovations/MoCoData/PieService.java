package com.trinityinnovations.MoCoData;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Dan Lesko on 4/9/2017.
 */
@Service("pieService")
public class PieService {

  @Autowired
  private PieDao pieDao;

  @Transactional
  public List<PieWrapper> getArrestPie(String start_date, String end_date, String city) {
    return pieDao.getArrestPie(start_date, end_date, city);
  }

  @Transactional
  public List<PieWrapper> getCrimePie(String start_date, String end_date, String city) {
    return pieDao.getCrimePie(start_date, end_date, city);
  }
}