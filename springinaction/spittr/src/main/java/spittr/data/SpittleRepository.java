/***********************************************
 * File Name: SpittleRepository
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 15 07 2019 下午 4:37
 ***********************************************/
package spittr.data;

import spittr.Spittle;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max,int count);
}
